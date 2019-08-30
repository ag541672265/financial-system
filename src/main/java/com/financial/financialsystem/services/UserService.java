package com.financial.financialsystem.services;

import com.financial.financialsystem.entity.Trades;
import com.financial.financialsystem.entity.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {


    //根据手机号登录
    Users getUserByPhone(@Param("phone")String phone);

    //根据昵称查询用户
    Users getUserByNickName(@Param("nickName")String nickName);

    //用户注册
    int register(Users user,String tuijianren);

    //查询所有用户
    List<Users> getAllUsers();

    //更新余额
    int updBalanceByid(Double money,int uid);

    //所有用户交易记录
    List<Trades> getAllTradesByid();

    //交易到期操作
    int updTradesByid(int uid);

}
