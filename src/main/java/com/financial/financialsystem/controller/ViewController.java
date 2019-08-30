package com.financial.financialsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//所有页面跳转链接

@Controller
public class ViewController {
    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }
    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }
    @RequestMapping(value = "register",method = RequestMethod.GET)
    public String request(){
        return "register";
    }

    @RequestMapping(value = "insurance",method = RequestMethod.GET)
    public String insurance(){
        return "insurance";
    }




}
