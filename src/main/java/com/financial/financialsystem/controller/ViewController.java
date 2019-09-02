package com.financial.financialsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

//所有页面跳转链接

@Controller
public class ViewController {
    //访问首页
    @GetMapping(value = "/")
    public String toIndex(HttpServletRequest request){
        return "index";
    }
    //去登录页面
    @RequestMapping("/login")
    public String toLogin(){
        return "userLogin";
    }
    //去注册页面
    @GetMapping(value = "/toRegister")
    public String toRegister(){
        return "userRegister";
    }

    @RequestMapping(value = "/insurance",method = RequestMethod.GET)
    public String insurance(){
        return "insurance";
    }




}
