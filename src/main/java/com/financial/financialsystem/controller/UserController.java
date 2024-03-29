package com.financial.financialsystem.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.financial.financialsystem.entity.Assets;
import com.financial.financialsystem.entity.Trades;
import com.financial.financialsystem.entity.Users;
import com.financial.financialsystem.services.FundService;
import com.financial.financialsystem.services.GoodsService;
import com.financial.financialsystem.services.QiniuService;
import com.financial.financialsystem.services.UserService;
import com.financial.financialsystem.util.CodeUtils;
import com.financial.financialsystem.util.GenerateWord;
import com.financial.financialsystem.util.QiniuUtils;
import com.google.gson.Gson;
import com.qiniu.http.Response;
import com.qiniu.storage.model.DefaultPutRet;
import org.apache.catalina.LifecycleState;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * 用户调取方法
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;
    @Autowired
    private QiniuUtils qiniuUtils;
    @Autowired
    private QiniuService qiniuService;
    @Resource
    private FundService fundService;
    @Resource
    private GoodsService goodsService;


    //异步查重用户名
   /* @PostMapping(value="checkNickName",produces= {"application/json;charset=UTF-8"})
    @ResponseBody
    public String checkNickName(@RequestParam("nickName")String nickName){
        int n=0;
        if(userService.getUserByNickName(nickName)!=null){
            n=1;
        }else{
            n=0;
        }
        // String data=JSON.toJSONStringWithDateFormat(d, "yyyy-MM-dd", SerializerFeature.PrettyFormat);
        return JSON.toJSONString(n, SerializerFeature.PrettyFormat);
    }*/
    //异步查重手机号
    @PostMapping(value="checkPhone",produces= {"application/json;charset=UTF-8"})
    @ResponseBody
    public String checkPhone(@RequestParam("phone")String phone) {
        int n=0;
        if(userService.getUserByPhone(phone)!=null){
            n=1;
        }else{
            n=0;
        }
        // String data=JSON.toJSONStringWithDateFormat(d, "yyyy-MM-dd", SerializerFeature.PrettyFormat);
        return JSON.toJSONString(n, SerializerFeature.PrettyFormat);
    }
    //短信验证
    @PostMapping(value="reception",produces= {"application/json;charset=UTF-8"})
    @ResponseBody
    public String reception(@RequestParam("phone")String phone) {
        String randomNum= CodeUtils.note(phone);
        return JSON.toJSONString(randomNum, SerializerFeature.PrettyFormat);
    }

    //用户注册
    @PostMapping("/register")
    public String register(HttpServletRequest request,
                           @RequestParam("phone")String phone,
                           @RequestParam("password")String password,
                           @RequestParam("tuijianren")String tuijianren){
        Users user=new Users();
        String account=phone+ GenerateWord.generateWord();
        user.setAccount(account);
        user.setPhone(phone);
        user.setPassword(password);
        int n=userService.register(user,tuijianren);
        if(n==1){
            return "userLogin";
        }else{
            request.setAttribute("info","注册失败！");
            return "userRegister";
        }

    }



    //用户登录
    @PostMapping("/doLogin")
    public String doLogin(HttpServletRequest request,
            @RequestParam("phone")String phone, @RequestParam("password")String password){
        Users user=userService.getUserByPhone(phone);
        if(null==user){
            request.setAttribute("info","用户不存在，请先注册！");
            return "userRegister";
        }else{
            if(user.getPassword().equals(password)){
                request.getSession().setAttribute("user",user);
                return "index";
            }else{
                request.setAttribute("info","密码不正确，请重新确认！");
                return "userLogin";
            }
        }
    }

    /*Assets表
uid 用户编号
money 用户的总资产
balance  用户余额
capital  用户的奖励金剩余
jijin  用户的基金总数
licai 用户的理财金总数
yjijin  用户昨日基金总收益
ylicai  用户昨日理财总收益
jijinprofit  用户的基金总收益
licaiprofit  用户的理财总收益
     */
    //个人页面查看，可看自己的资产，交易记录等
    //进入资产界面
    @RequestMapping("/toassets")
    public String toassets(HttpServletRequest request,Model model){
        HttpSession session=request.getSession();
        Users user=(Users)session.getAttribute("user");
        Integer uid = user.getUid();
        user = goodsService.queryUSID(uid);
        Assets assets = new Assets();
        assets.setUid(user.getUid());
        assets.setBalance(user.getBalance());
        assets.setCapital(user.getCapital());
        double jijin=fundService.zongjijin(user.getUid(),1);
        assets.setJijin(jijin);
        double licai=1000;
        assets.setLicai(licai);
        double yjijin =fundService.yesterdayUTP(uid,7);
        double ylicai=0;
        assets.setYjijin(yjijin);
        assets.setYlicai(ylicai);
        assets.setYyingli(yjijin+ylicai);
        double jijinprofit =fundService.zongjijin(user.getUid(),0);
        double licaiprofit =0;
        assets.setJijinprofit(jijinprofit);
        assets.setLicaiprofit(licaiprofit);
        assets.setYingliprofit(jijinprofit+licaiprofit);
        assets.setMoney(user.getBalance()+user.getCapital()+jijin+licai);
        List<Trades> tradesList = goodsService.getATstream(uid);
        request.getSession().setAttribute("user",goodsService.queryUSID(uid));
        request.getSession().setAttribute("assets",assets);
        model.addAttribute("tradesList",tradesList);
        return "assets";
    }


    @RequestMapping(value="/addMoney")
    public String addMoney( double amount,String orderNumber, HttpServletRequest request){

        HttpSession session=request.getSession ();
        Users users= (Users) session.getAttribute ("user");
        System.out.println ("进入"+ users.getAccount ());
        System.out.println (amount );
        System.out.println (amount );
        String account =users.getPhone ();
        int i=userService.addtrades(users.getUid (),orderNumber,amount);
        int i1=userService.UpdateUser(account,users.getBalance(),amount);
        System.out.println (i );
        System.out.println (i1);
        return "redirect:/toassets";
    }

    //修改头像
    @PostMapping("/addContent")
    public String update(@RequestParam("file") MultipartFile img,String phone,HttpServletRequest request) throws IOException {
        System.out.println ("method:" + img.getOriginalFilename ( ));
        Response response = qiniuService.uploadFile (img.getInputStream ( ));
        DefaultPutRet putRet = new Gson ( ).fromJson (response.bodyString ( ), DefaultPutRet.class);
        String imgs = qiniuUtils.getPath ( ) + "/" + putRet.key;
        HttpSession session=request.getSession();
        Users user=(Users)session.getAttribute("user");
        System.out.println("username"+user.getNickName());
        userService.updatehead (imgs,phone);
        session.removeAttribute ("user");
        request.getSession ().setAttribute ("user",userService.getUserByPhone (phone));

        return "assets";

    }

}
