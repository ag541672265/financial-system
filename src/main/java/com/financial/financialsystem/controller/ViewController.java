package com.financial.financialsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
    public String toLogin(HttpSession session){
        session.removeAttribute("user");
        return "userLogin";
    }
    //去注册页面
    @GetMapping(value = "/toRegister")
    public String toRegister(){
        return "userRegister";
    }

    @RequestMapping(value = "/insurance",method = RequestMethod.GET)
    public String insurance(){
        return "insurance_new";
    }

    @GetMapping(value = "/detail")
    private String Detail(){
        return "";
    }




    @RequestMapping(value = "/insurancePro_new",method = RequestMethod.GET)
    public String insuranceProNew(Model model, @RequestParam(value = "page",required = false)String page)throws Exception{

        if (page==null||page.equals("")){

            model.addAttribute("page",1);
        }else {
            model.addAttribute("page",page);
        }
        model.addAttribute("pages",4);
        return "insurancePro_new_p";
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




}
