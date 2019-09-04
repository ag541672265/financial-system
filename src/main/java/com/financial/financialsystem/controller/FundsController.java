package com.financial.financialsystem.controller;


import com.financial.financialsystem.entity.Users;
import com.financial.financialsystem.external.fund.Funds;
import com.financial.financialsystem.external.fund.MessagesService;
import com.financial.financialsystem.external.fund.Userfund;
import com.financial.financialsystem.services.GoodsService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

//链接基金程序调取其中的数据，存入本程序数据库
@Controller
public class FundsController {

    @Resource
    private GoodsService goodsService;

    // 接口地址
    String address = "http://localhost:9999/service/webservice?wsdl";
    // 代理工厂
    JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean ( );

    @RequestMapping("/chajijin")
    @ResponseBody
    public String chajijin(Integer fid) {
        try {

            // 设置代理地址
            jaxWsProxyFactoryBean.setAddress (address);
            // 设置接口类型
            jaxWsProxyFactoryBean.setServiceClass (MessagesService.class);
            // 创建一个代理接口实现
            MessagesService ms = (MessagesService) jaxWsProxyFactoryBean.create ( );
            // 数据准备
            // 调用代理接口的方法调用并返回结果
            Funds funds = ms.queryjijin (fid);
            System.out.println (funds.getFname ( ));
        } catch (Exception e) {
            e.printStackTrace ( );
        }
        return "<h>好了</h>";
    }

    @RequestMapping("/chaalljijin")
    public String chaalljijin(Model model) {
        try {

            // 设置代理地址
            jaxWsProxyFactoryBean.setAddress (address);
            // 设置接口类型
            jaxWsProxyFactoryBean.setServiceClass (MessagesService.class);
            // 创建一个代理接口实现
            MessagesService ms = (MessagesService) jaxWsProxyFactoryBean.create ( );
            // 数据准备
            // 调用代理接口的方法调用并返回结果
            List<Funds> fundsList = ms.queryalljijin ( );
            for (Funds fs : fundsList) { System.out.println (fs.getFname ( )); }
            model.addAttribute("fundsList",fundsList);
            return "funds";
        } catch (Exception e) {
            e.printStackTrace ( );
        }
        return "/";
    }

    @RequestMapping("/chamezongjijin")
    @ResponseBody
    public String chamezongjijin(Integer uid) {
        try {

            // 设置代理地址
            jaxWsProxyFactoryBean.setAddress (address);
            // 设置接口类型
            jaxWsProxyFactoryBean.setServiceClass (MessagesService.class);
            // 创建一个代理接口实现
            MessagesService ms = (MessagesService) jaxWsProxyFactoryBean.create ( );
            // 数据准备
            // 调用代理接口的方法调用并返回结果
            List<Userfund> result = ms.querymejijin (uid);
            double money = 0;
            for (Userfund uf : result) {
                money += uf.getMoney ( );
                System.out.println (money);
            }
        } catch (Exception e) {
            e.printStackTrace ( );
        }
        return "<h>好了</h>";
    }

    @RequestMapping("/mairujijin")
    public String mairujijin(Integer fid, Integer type, double money, HttpServletRequest request) {
        try {
            // 设置代理地址
            jaxWsProxyFactoryBean.setAddress (address);
            // 设置接口类型
            jaxWsProxyFactoryBean.setServiceClass (MessagesService.class);
            // 创建一个代理接口实现
            MessagesService ms = (MessagesService) jaxWsProxyFactoryBean.create ( );
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
                        return "redirect:/chaalljijin";
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
    @ResponseBody
    public String maichujijin(Integer uid, Integer fid, double money) {
        try {

            // 设置代理地址
            jaxWsProxyFactoryBean.setAddress (address);
            // 设置接口类型
            jaxWsProxyFactoryBean.setServiceClass (MessagesService.class);
            // 创建一个代理接口实现
            MessagesService ms = (MessagesService) jaxWsProxyFactoryBean.create ( );
            // 数据准备
            // 调用代理接口的方法调用并返回结果
            boolean result = ms.selljijin (uid, fid, money);
            if (result) {
                System.out.println ("卖出成功");
            }
        } catch (Exception e) {
            e.printStackTrace ( );
        }
        return "<h>好了</h>";
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
