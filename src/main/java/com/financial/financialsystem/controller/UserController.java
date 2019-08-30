package com.financial.financialsystem.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.financial.financialsystem.entity.Users;
import com.financial.financialsystem.services.UserService;
import com.financial.financialsystem.util.CodeUtils;
import com.financial.financialsystem.util.GenerateWord;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 用户调取方法
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    //访问首页
    @RequestMapping("/")
    public String toIndex(HttpServletRequest request){
        return "index";
    }

    //去注册页面
    @RequestMapping("/toRegister")
    public String toRegister(){
        return "userRegister";
    }


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

    //去登录页面
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "userLogin";
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

}
