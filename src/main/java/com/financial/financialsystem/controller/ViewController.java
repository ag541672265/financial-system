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
    @GetMapping(value = "/index")
    public String toIndex2(HttpServletRequest request){
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
    //去保险页面
    @RequestMapping(value = "insurance",method = RequestMethod.GET)
    public String insurance(){
        return "insurance";
    }
    @RequestMapping(value = "insurance_new",method = RequestMethod.GET)
    public String insuranceNew(){
        return "insurance_new";
    }

    @RequestMapping(value = "insurancePro_new",method = RequestMethod.GET)
    public String insuranceProNew(){
        return "insurancePro_new";
    }
    @RequestMapping(value = "insurancePro_one",method = RequestMethod.GET)
    public String insuranceProOne(){
        return "insurancePro_one";
    }



    //去保险产品介绍页
    @RequestMapping(value = "insurancePro",method = RequestMethod.GET)
    public String insurancePro(){
        return "insurancePro";
    }

    @RequestMapping(value = "insurancePro2",method = RequestMethod.GET)
    public String insurancePro2(){
        return "insurancePro2";
    }
    //去理财页面
    @RequestMapping(value = "fProducts",method = RequestMethod.GET)
    public String fProducts(){
        return "financialProducts";
    }
    //去基金页面
    @RequestMapping(value = "fund",method = RequestMethod.GET)
    public String fund(){
        return "fund";
    }





}
