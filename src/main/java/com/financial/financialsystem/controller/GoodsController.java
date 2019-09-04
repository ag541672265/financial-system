package com.financial.financialsystem.controller;

import com.financial.financialsystem.entity.Users;
import com.financial.financialsystem.services.GoodsService;
import com.financial.financialsystem.entity.Goods;
import com.financial.financialsystem.services.GoodsService;
import com.financial.financialsystem.services.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 商品方法
 */

@Controller
public class GoodsController {

    @Resource
    private GoodsService service;

    @Resource
    private UserService userService;

    @RequestMapping("/toShangCheng")
    public String toShangCheng(Model model){
        List<Goods>gList=service.getAll();
        //当前测试 到时候用session获取
        double balance=userService.getBlanceByPhone("18210067962");

        model.addAttribute("gList",gList);
        model.addAttribute("money",balance);
        return "shangcheng";
    }


    //异步返回余额
    @RequestMapping(value = "/queryYuE",produces={"application/json;charset=UTF-8"})
    @ResponseBody
    public String queryYuE(){

        //当前测试 到时候用session获取
        double balance=userService.getBlanceByPhone("18210067962");


        return JSON.toJSONString(balance,SerializerFeature.PrettyFormat);
    }


    @RequestMapping(value = "/toBuy")
    @ResponseBody
    public String quer(@RequestParam(value = "gId") Integer gid, Integer type, double jine, HttpServletRequest request){
        HttpSession session=request.getSession();
        Users user=(Users)session.getAttribute("user");
        Integer uid = user.getUid();
        double capital = user.getCapital();
        double balance = user.getBalance();
        System.out.println(balance);
        System.out.println(capital);
        System.out.println(jine);
        if(service.zhifumoney(uid,gid,type,jine,capital,balance)){
            System.out.println("xxxxxx");
            return "<h>ok</h>";
        }else{
            return "<h>no</h>";
        }
    }

}
