package com.financial.financialsystem.controller;

import com.financial.financialsystem.services.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 商品方法
 */

@Controller
public class GoodsController {

    @Resource
    private GoodsService goodsService;

    @RequestMapping("/dianjigoumai")
    @ResponseBody
    public String dianjigoumai(Integer uid, Integer gid,Integer type,double money,double capital,double balance){
        if(goodsService.zhifumoney(uid,gid,type,money,capital,balance)){
            System.out.println("xxxxxx");
            return "<h>ok</h>";
        }else{
            return "<h>no</h>";
        }

    }
}
