package com.financial.financialsystem.util;

import org.apache.http.HttpResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CodeUtils {

    //获取随机生成的验证码
    private static String randomNum=null;

    //随机生产4为验证码
    public static String randomNum() {
        StringBuilder sb=new StringBuilder();
        Random random=new Random();
        for (int i = 0; i < 4; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.reverse().toString();
    }
    //向手机发送验证码的方法
    public static String note(String phone) {
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
        return randomNum;
    }
}
