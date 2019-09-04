package com.financial.financialsystem.controller;

import com.financial.financialsystem.entity.Trades;
import com.financial.financialsystem.entity.Users;
import com.financial.financialsystem.services.TradeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class TradeController {

    @Resource
    private TradeService tradeService;

    //购买基金
    @PostMapping("/buyFund")
    public String buyFund(HttpServletRequest request,
                          RedirectAttributes attributes,
                          @RequestParam("gid")Integer gid,
                          @RequestParam("money")Double money){
        HttpSession session=request.getSession();
        Users currentUser=(Users)session.getAttribute("user");
        if(currentUser==null){
            attributes.addFlashAttribute("info","您还未登录，请先登录！");
        }else{
            if(currentUser.getBalance()<money){
                attributes.addFlashAttribute("info","余额不足！");
            }else{
                //添加交易记录，修改用户表等操作
                Trades trade=new Trades();
                attributes.addFlashAttribute("info","购买成功！");
            }
        }
        return "redirect:/toFund";
    }
}
