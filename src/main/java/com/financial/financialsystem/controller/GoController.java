package com.financial.financialsystem.controller;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.financial.financialsystem.entity.Users;
import com.financial.financialsystem.services.UserService;
import com.financial.financialsystem.util.AlipayConfig;
import com.financial.financialsystem.util.EmptyUtils;
import com.financial.financialsystem.util.GetOrNu;
import com.financial.financialsystem.util.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 这是做跳转的
 */

@Controller
public class GoController {
    @Resource
    private UserService userService;
    @Resource
    private RedisUtils redisUtils;


    private double amount=0;

    @RequestMapping("/toUser")
    public String toUser(){
        return "redirect:/toassets";
    }

    @RequestMapping("/toZhiFu")
    public String sd(){
        return "zhifu";
    }





    @Autowired
    private AlipayConfig alipayConfig;

    @RequestMapping("/toPay")
    public void toPay(@RequestParam("jine")int jine, HttpServletRequest request, HttpServletResponse response) throws AlipayApiException, IOException {
        amount=jine;
        response.setContentType("text/html;UTF-8");

        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);

        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);

        //商户订单号，商户网站订单系统中唯一订单号，必填
        //String out_trade_no = new String(request.getParameter("WIDout_trade_no").getBytes("ISO-8859-1"),"UTF-8");
        //付款金额，必填
        //String total_amount = new String(request.getParameter("WIDtotal_amount").getBytes("ISO-8859-1"),"UTF-8");
        //订单名称，必填
        //String subject = new String(request.getParameter("WIDsubject").getBytes("ISO-8859-1"),"UTF-8");
        //商品描述，可空
        //String body = new String(request.getParameter("WIDbody").getBytes("ISO-8859-1"),"UTF-8");


        //订单号，uuid创建的不重复


       String orderNumber= GetOrNu.createOrderNumber() ;
        System.out.println (orderNumber );
        alipayRequest.setBizContent("{\"out_trade_no\":\""+ orderNumber +"\","
                + "\"total_amount\":\""+ jine +"\","
                + "\"subject\":\""+ "aa7" +"\","
                + "\"body\":\""+" "+"\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");


        String result = alipayClient.pageExecute(alipayRequest).getBody();




        response.getWriter().write(result);
        response.getWriter().flush();
        response.getWriter().close();
    }


    @RequestMapping("/callBack")
    public String  callBack(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, AlipayApiException {
        Map<String,String> params = new HashMap<String,String>();
        Map<String,String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }
            //乱码解决，这段代码在出现乱码时使用
            valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
            params.put(name, valueStr);
        }

        boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key, AlipayConfig.charset, AlipayConfig.sign_type); //调用SDK验证签名

        //——请在这里编写您的程序（以下代码仅作参考）——


        if(signVerified) {
//            System.out.println("支付成功");
//            System.out.println (amount );
//            //获取token
//            String tokenKey="token";
//            String tokenValue=(String)redisUtils.get(tokenKey);
//                JSONObject jsonObject=JSONObject.parseObject(tokenValue);
//                String account=jsonObject.getString("phone");
//                Users users=userService.getUserByPhone(account);
//                int i=userService.addtrades(account,amount);
//                int i1=userService.UpdateUser(account,users.getBalance(),amount);
            //商户订单号
            String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");
            //支付宝交易号
            String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"),"UTF-8");
            //付款金额
            String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"),"UTF-8");

            System.out.println("total_amount====" + total_amount);
            System.out.println("trade_no====" + trade_no);
            System.out.println("out_trade_no====" + out_trade_no);
//            result = "付款成功！";
            System.out.println("付款成功！");

            return "redirect:addMoney?amount=" + total_amount+"&orderNumber="+out_trade_no;
        }else{
            System.out.println("支付失败");
            return "adad";
        }

    }

}
