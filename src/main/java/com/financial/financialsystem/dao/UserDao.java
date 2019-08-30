package com.financial.financialsystem.dao;

import com.financial.financialsystem.entity.Trades;
import com.financial.financialsystem.entity.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    //根据手机号查询用户
    Users getUserByPhone(@Param("phone")String phone);

    //根据昵称查询用户
    Users getUserByNickName(@Param("nickName")String nickName);

    //添加用户
    int addUser(Users user);

    //给推荐人奖金
    int updateCapital(@Param("tuijianren")String tuijianren);

    //查询所有用户
    List<Users> getAllUsers();

    //更新余额
    int updBalanceByid(Double money,int uid);

    //所有用户交易记录
    List<Trades> getAllTradesByid();

    //交易到期操作
    int updTradesByid(int uid);


}
