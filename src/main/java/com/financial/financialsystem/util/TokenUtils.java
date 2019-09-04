package com.financial.financialsystem.util;

import com.alibaba.fastjson.JSON;
import com.financial.financialsystem.entity.UserVO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Component
public  class TokenUtils {

    @Resource
    private  RedisUtils redisUtils;

    public  String generateToken(UserVO userVo){
        StringBuilder builder=new StringBuilder();
        builder.append("token-");
        builder.append("PC-"+"-");
        String info=MD5.getMd5(userVo.getPhone().toString(),32);
        builder.append(info+"-");
        builder.append(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
        builder.append(UUID.randomUUID().toString().substring(0,6));
        return builder.toString();
    }


    public  void saveToken(String token, UserVO userVo){
        String tokenKey="financial"+userVo.getAccount();
        String tokenValue=null;
        if ((tokenValue=(String)redisUtils.get(tokenKey))!=null){
            //说明用户已经登录了
            redisUtils.delete(tokenKey);
        }
        //缓存用户token
        redisUtils.set(tokenKey,30,token);

        //缓存用户详细信息
        redisUtils.set(token,30, JSON.toJSONString(userVo));

    }
}
