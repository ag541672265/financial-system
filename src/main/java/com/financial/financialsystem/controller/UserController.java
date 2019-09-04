package com.financial.financialsystem.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.financial.financialsystem.entity.Users;
import com.financial.financialsystem.services.QiniuService;
import com.financial.financialsystem.services.UserService;
import com.financial.financialsystem.util.CodeUtils;
import com.financial.financialsystem.util.GenerateWord;
import com.financial.financialsystem.util.QiniuUtils;
import com.google.gson.Gson;
import com.qiniu.http.Response;
import com.qiniu.storage.model.DefaultPutRet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

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


    //个人页面查看，可看自己的资产，交易记录等
    //进入资产界面
    @RequestMapping("/toassets")
    public String toassets(HttpServletRequest request,Model model){
        HttpSession session=request.getSession();
        Users user=(Users)session.getAttribute("user");
        double jijin=1000;
        double licai=1000;
        double zongzichan = user.getBalance()+user.getCapital()+jijin+licai;
        if(user.getNickName ()==null){
            model.addAttribute ("nickName","尚未填写用户名");
        }else{
            model.addAttribute ("nickName",user.getNickName ());
        }
        model.addAttribute("zongzichan",zongzichan);
        model.addAttribute("jijin",jijin);
        model.addAttribute("licai",licai);
        request.setAttribute("user",user);
        return "assets";
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
