package com.financial.financialsystem.controller;

import com.financial.financialsystem.entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VaultController {

    @RequestMapping("/jijin")
    public String jijin(){

        return "about";
    }

    @RequestMapping("/licai")
    public String licai(){

        return "touzi_list";
    }

    @RequestMapping("/huijinhong")
    public String huijinhong(){

        return "huijinhong";
    }

}
