package com.financial.financialsystem.controller;

import com.financial.financialsystem.entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VaultController {

    @RequestMapping("/jijin")
    public String jijin(){

        return "redirect:/chaalljijin";
    }

    @RequestMapping("/licai")
    public String licai(){

        return "touzi_list";
    }


}
