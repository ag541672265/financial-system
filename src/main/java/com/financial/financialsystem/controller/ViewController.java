package com.financial.financialsystem.controller;

import com.financial.financialsystem.entity.FundVO;
import com.financial.financialsystem.services.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

//所有页面跳转链接

@Controller
public class ViewController {

    @Resource
    private GoodsService goodsService;

    //访问首页
    @GetMapping(value = "/")
    public String toIndex(HttpServletRequest request){
        return "index";
    }
    //去登录页面
    @RequestMapping("/toLogin")
    public String toLogin(HttpServletRequest request){
        return "userLogin";
    }
    //去注册页面
    @GetMapping(value = "/toRegister")
    public String toRegister(HttpServletRequest request){
        return "userRegister";
    }

    //去基金首页
    @GetMapping(value = "/toFund")
    public String toFund(HttpServletRequest request){
        List<FundVO> fundsList=goodsService.queryAllFund();
        request.setAttribute("fundsList",fundsList);
        return "fund";
    }

    @RequestMapping(value = "insurance",method = RequestMethod.GET)
    public String insurance(){
        return "insurance";
    }




}
