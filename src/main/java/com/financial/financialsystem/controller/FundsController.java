package com.financial.financialsystem.controller;

import com.financial.financialsystem.entity.Capital;
import com.financial.financialsystem.entity.Users;
import com.financial.financialsystem.external.fund.Funds;
import com.financial.financialsystem.external.fund.MessagesService;
import com.financial.financialsystem.external.fund.Userfund;
import com.financial.financialsystem.services.FundService;
import com.financial.financialsystem.services.GoodsService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

//链接基金程序调取其中的数据，存入本程序数据库
@Controller
public class FundsController {

    @Resource
    private GoodsService goodsService;
    @Resource
    private FundService fundService;

    // 接口地址
    String address = "http://129.211.129.219:9999/service/webservice?wsdl";
    // 代理工厂
    JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean ();

    @RequestMapping("/chajijin")
    public String chajijin(Integer fid,Model model) {
        try {

            // 设置代理地址
            jaxWsProxyFactoryBean.setAddress (address);
            // 设置接口类型
            jaxWsProxyFactoryBean.setServiceClass (MessagesService.class);
            // 创建一个代理接口实现
            MessagesService ms = (MessagesService) jaxWsProxyFactoryBean.create ();
            // 数据准备
            // 调用代理接口的方法调用并返回结果
            Funds funds = ms.queryjijin (fid);
            System.out.println (funds.getFname ());
            model.addAttribute("funds",funds);
            return "detailsfunds";
        } catch (Exception e) {
            e.printStackTrace ( );
        }
        return "/";
    }

    @RequestMapping("/chaalljijin")
    public String chaalljijin(Model model) {
        try {
            // 设置代理地址
            jaxWsProxyFactoryBean.setAddress (address);
            // 设置接口类型
            jaxWsProxyFactoryBean.setServiceClass (MessagesService.class);
            // 创建一个代理接口实现
            MessagesService ms = (MessagesService) jaxWsProxyFactoryBean.create ();
            // 数据准备
            // 调用代理接口的方法调用并返回结果
            List<Funds> fundsList = ms.queryalljijin ();
            for (Funds fs : fundsList) { System.out.println (fs.getFname ()); }
            model.addAttribute("fundsList",fundsList);
            return "allfunds";
        } catch (Exception e) {
            e.printStackTrace ( );
        }
        return "/";
    }

    @RequestMapping("/chamezongjijin")
    public String chamezongjijin(Model model,HttpServletRequest request) {
        try {

            // 设置代理地址
            jaxWsProxyFactoryBean.setAddress (address);
            // 设置接口类型
            jaxWsProxyFactoryBean.setServiceClass (MessagesService.class);
            // 创建一个代理接口实现
            MessagesService ms = (MessagesService) jaxWsProxyFactoryBean.create ();
            // 数据准备
            // 调用代理接口的方法调用并返回结果

            HttpSession session=request.getSession();
            Users user=(Users)session.getAttribute("user");
            Integer uid = user.getUid();
            List<Userfund> result = ms.querymejijin (uid);
            List<Funds> funds = ms.queryalljijin ();
            model.addAttribute("funds",funds);
            model.addAttribute("fundsList",result);
            return "privatefunds";
            /*
            //算我总共有多少钱的基金
            double money = 0;
            for (Userfund uf : result) {
                money += uf.getMoney ( );
                System.out.println (money);
            }
            */
        } catch (Exception e) {
            e.printStackTrace ( );
        }
        return "/";
    }

    @RequestMapping("/mairujijin")
    public String mairujijin(Integer fid, Integer type, double money, HttpServletRequest request) {
        try {
            // 设置代理地址
            jaxWsProxyFactoryBean.setAddress (address);
            // 设置接口类型
            jaxWsProxyFactoryBean.setServiceClass (MessagesService.class);
            // 创建一个代理接口实现
            MessagesService ms = (MessagesService) jaxWsProxyFactoryBean.create ();
            // 数据准备
            // 调用代理接口的方法调用并返回结果
            if(type==9){
                HttpSession session=request.getSession();
                Users user=(Users)session.getAttribute("user");
                Integer uid = user.getUid();
                double capital = user.getCapital();
                double balance = user.getBalance();
                System.out.println(balance);
                System.out.println(capital);
                System.out.println(money);

                if(goodsService.zhifumoney(uid,fid,type,money,capital,balance)){
                    if (ms.buyjijin (uid, fid, money)) {
                        System.out.println("基金购买成功");
                        request.getSession().setAttribute("user",goodsService.queryUSID(uid));
                        return "redirect:/toassets";
                    }
                }else{
                    System.out.println("基金购买失败");
                    return "funds";
                }
            }

        } catch (Exception e) {
            e.printStackTrace ( );
        }
        return "funds";
    }

    @RequestMapping("/maichujijin")
    public String maichujijin(Integer fid, double money,HttpServletRequest request) {
        try {

            // 设置代理地址
            jaxWsProxyFactoryBean.setAddress (address);
            // 设置接口类型
            jaxWsProxyFactoryBean.setServiceClass (MessagesService.class);
            // 创建一个代理接口实现
            MessagesService ms = (MessagesService) jaxWsProxyFactoryBean.create ();
            // 数据准备
            // 调用代理接口的方法调用并返回结果

            HttpSession session=request.getSession();
            Users user=(Users)session.getAttribute("user");
            Integer uid = user.getUid();
            boolean result = ms.selljijin (uid, fid, money);
            if (result) {
                System.out.println ("卖出成功");
                double shengyujijin = fundService.mequeryfunds(uid,fid);
                Capital capital = goodsService.queryugcontact(uid,fid,9);
                if(capital==null){
                    if(goodsService.upUBCdata(uid,user.getBalance()+money,user.getCapital())){
                        if(goodsService.tianjiaTOC(uid,fid,money,10,"卖出基金")){
                            System.out.println("订单添加成功");
                            request.getSession().setAttribute("user",goodsService.queryUSID(uid));
                            return "redirect:/toassets";
                        }else{
                            System.out.println("订单添加失败");
                            return "/";
                        }
                    }else {
                        return "/";
                    }
                }else {
                    double jianglijijin = capital.getMoney();
                    if (shengyujijin >= jianglijijin || capital == null) {
                        if (goodsService.upUBCdata(uid, user.getBalance() + money, user.getCapital())) {
                            if(goodsService.tianjiaTOC(uid,fid,money,10,"卖出基金")){
                                System.out.println("订单添加成功");
                                request.getSession().setAttribute("user",goodsService.queryUSID(uid));
                                return "redirect:/toassets";
                            }else{
                                System.out.println("订单添加失败");
                                return "/";
                            }
                        } else {
                            return "/";
                        }
                    } else {
                        //给奖励金加钱
                        if (goodsService.upUBCdata(uid, user.getBalance() + money, user.getCapital() + jianglijijin - shengyujijin)) {
                            //改商品和用户的奖励金关联表
                            if (goodsService.upugcontact(uid, fid, 9, shengyujijin)) {
                                request.getSession().setAttribute("user", goodsService.queryUSID(uid));
                                return "redirect:/toassets";
                            } else {
                                return "/";
                            }

                        } else {
                            return "/";
                        }
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace ( );
        }
        return "/";
    }


    /*@RequestMapping("/queryById")
    @ResponseBody
    public String test(@RequestParam(value="id",defaultValue = "0")long id) {
// 创建动态客户端
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://localhost:1380/service/webservice?wsdl");
        // 需要密码的情况需要加上用户名和密码
        // client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME, PASS_WORD));
        HTTPConduit conduit = (HTTPConduit) client.getConduit();
        HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
        httpClientPolicy.setConnectionTimeout(2000);  //连接超时
        httpClientPolicy.setAllowChunking(false);    //取消块编码
        httpClientPolicy.setReceiveTimeout(120000);     //响应超时
        conduit.setClient(httpClientPolicy);
        //client.getOutInterceptors().addAll(interceptors);//设置拦截器
        Object[] objects = new Object[0];
        try {
            // invoke("方法名",参数1,参数2,参数3....);
            objects = client.invoke("qureyContentById",id );
            System.out.println("返回数据:" + objects[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "ok";
    }*/
}
