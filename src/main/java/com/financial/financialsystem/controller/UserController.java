package com.financial.financialsystem.controller;


import com.financial.financialsystem.entity.Users;
import com.financial.financialsystem.services.UserService;
import com.financial.financialsystem.util.RedisUtils;
import com.financial.financialsystem.util.Token;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 用户调取方法
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    //访问首页
    @RequestMapping("/")
    public String toIndex(HttpServletRequest request){
        return "index";
    }

    //去登录页面
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "userLogin";
    }

    //用户登录
    @PostMapping("/doLogin")
    public String doLogin(HttpServletRequest request,
            @RequestParam("phone")String phone, @RequestParam("password")String password){
        Users user=userService.getUserByPhone(phone);
        if(null==user){
            request.setAttribute("loginInfo","用户不存在，请先注册！");
            return "register";
        }else{
            if(user.getPassword().equals(password)){
                String tokenStr= Token.genetateToken();
                RedisUtils redis=new RedisUtils();
                //redis.set("token",tokenStr);
                //request.getSession().setAttribute("token",tokenStr);
                request.getSession().setAttribute("user",user);
                return "index";
            }else{
                request.setAttribute("loginInfo","密码不正确，请重新确认！");
                return "userLogin";
            }
        }
    }

}
