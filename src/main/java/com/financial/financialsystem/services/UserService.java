package com.financial.financialsystem.services;

import com.financial.financialsystem.entity.Users;
import org.apache.ibatis.annotations.Param;

public interface UserService {


    //根据手机号登录
    Users getUserByPhone(@Param("phone")String phone);

    //根据昵称查询用户
    Users getUserByNickName(@Param("nickName")String nickName);

    //用户注册
    int register(Users user,String tuijianren);
}
