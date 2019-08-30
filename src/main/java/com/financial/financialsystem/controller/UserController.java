package com.financial.financialsystem.controller;



import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.financial.financialsystem.entity.Users;
import com.financial.financialsystem.services.UserService;
import com.financial.financialsystem.util.HttpUtils;

import org.apache.http.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;


/**
 * 用户调取方法
 */
@Controller
public class UserController {
    //获取随机生成的验证码
    private static String randomNum=null;
    @Resource
    private UserService userService;
    @RequestMapping("/")
    public String init(){
        return "index";
    }
    //去登录页面
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }
    //去投资页面
    @RequestMapping("/toTouzi_list")
    public String toTouzi_list(){
        return "touzi_list";
    }
    //用户购买产品投资
    @PostMapping("/touzi")
    public String touzi(@RequestParam("cName")String cName, @RequestParam("cardId")String cardId,@RequestParam("jine") double jine, HttpServletRequest request){
        HttpSession session = request.getSession();
        Users user = (Users) session.getAttribute("user");
        int uid = user.getUid();
        System.out.println("---jine----"+jine);
        int n = userService.addIdCard(cName,cardId,uid);
        //现在余额等于购买完商品的钱
        double balance = user.getBalance()-jine;
        //更新余额
        int c = userService.updateBalance(uid,balance);
        System.out.println("---balance----"+balance);

        //查询现在剩多少钱
        double balanceNow = userService.getBanlanceByUid(uid);
        System.out.println("---balanceNow----"+balanceNow);

        //大于0就正常返回，小于零再说。
        if (balanceNow>0){
            return "touzi_list";
        }else{
            //时间不够了，余额不够先返回首页。
            return "index";
        }

    }
    //用户登录
    @PostMapping("/doLogin")
    public String doLogin(HttpServletRequest request,
                          @RequestParam("phone")String phone, @RequestParam("password")String password){
        Users user=userService.getUserByPhone(phone);
        if(null==user){
            request.setAttribute("info","用户不存在，请先注册！");
            return "register";
        }else{
            if(user.getPassword().equals(password)){
                request.getSession().setAttribute("user",user);
                return "user_index";
            }else{
                request.setAttribute("info","密码不正确，请重新确认！");
                return "index";
            }
        }
    }

    //去注册页面
    @RequestMapping("/toRegister")
    public String toRegister(){
        return "register";
    }
    //添加用户，注册功能
    @RequestMapping("/addUser")
    public String addUser(@RequestParam("nickName") String nickName, @RequestParam("phone") String phone,
                          @RequestParam("password") String password, @RequestParam("tuiphone")  String tuiphone, HttpSession session){
        StringBuilder sb=new StringBuilder();
        sb.append(phone);
        for (int i = 0; i < 4; i++) {
            char c=(char)(int)(Math.random()*26+97);
            sb.append(c);
        }
        String account = sb.toString();
        if (userService.addUsers(nickName,phone,password,account)){


            int n = userService.queryUserByPhone(tuiphone);
            System.out.println("=========="+sb+"===========");
            note(phone);

            return "index";
        }else{

            return "register";
        }
    }
    //异步获取验证码
    @PostMapping(value="getRandomNum",produces= {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getRandomNum(@RequestParam("phone")String phone){
        note(phone);
        String n = randomNum;
        return JSON.toJSONString(n, SerializerFeature.PrettyFormat);
    }
    //异步查重用户名
    @PostMapping(value="checkNickName",produces= {"application/json;charset=UTF-8"})
    @ResponseBody
    public String checkNickName(@RequestParam("nickName")String nickName){
        int n=0;
        if(userService.getUserByNickName(nickName)!=null){
            n=1;
        }else{
            n=0;
        }
        // String data=JSON.toJSONStringWithDateFormat(d, "yyyy-MM-dd", SerializerFeature.PrettyFormat);
        return JSON.toJSONString(n, SerializerFeature.PrettyFormat);
    }
    //异步查重手机号
    @PostMapping(value="checkPhone",produces= {"application/json;charset=UTF-8"})
    @ResponseBody
    public String checkPhone(@RequestParam("phone")String phone) {
        int n=0;
        if(userService.getUserByPhone(phone)!=null){
            n=1;
        }else{
            n=0;
        }
        // String data=JSON.toJSONStringWithDateFormat(d, "yyyy-MM-dd", SerializerFeature.PrettyFormat);
        return JSON.toJSONString(n, SerializerFeature.PrettyFormat);
    }
    //从页面接收手机号 把验证码返回到 页面
//    public void reception(HttpServletRequest request, HttpServletResponse response) {
//        String phone = request.getParameter("phone");
//        note(phone);
//        print(request, response, new Gson().toJson(randomNum));
//    }
    //随机生产4为验证码
    public String randomNum() {
        StringBuilder sb=new StringBuilder();
        Random random=new Random();
        for (int i = 0; i < 4; i++) {
            sb.append(random.nextInt(10));
        }

        return sb.reverse().toString();
    }

    //向手机发送验证码的方法
    public void note(String phone) {
        String host = "http://dingxin.market.alicloudapi.com";
        String path = "/dx/sendSms";
        String method = "POST";
        String appcode = "c5c6854487ac4519a4d7a527b7c8f327";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("mobile", phone);
        randomNum=randomNum();
        String code="code:"+randomNum;
        querys.put("param",code);
        querys.put("tpl_id", "TP1711063");
        Map<String, String> bodys = new HashMap<String, String>();
        try {
            /**
             * 重要提示如下:
             * HttpUtils请从
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
             * 下载
             *
             * 相应的依赖请参照
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
             */
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            System.out.println(response.toString());
            //获取response的body
            //System.out.println(EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
