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



    //修改用户金额
    int UpdateUser(@Param("phone") String phone,@Param("balance") double balance,@Param("balanc") double balanc);
    //添加充值记录
    int addtrades(@Param("phone")String phone,@Param("amount")double amount);

    //查询当前用户余额
    double getBlanceByPhone(@Param("phone")String phone);


    //修改头像
    int updatehead(String headimg,String phone);
}
