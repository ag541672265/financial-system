package com.financial.financialsystem.dao;

import com.financial.financialsystem.entity.Users;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

    //根据手机号查询用户
    Users getUserByPhone(@Param("phone")String phone);

    //根据昵称查询用户
    Users getUserByNickName(@Param("nickName")String nickName);

    //添加用户
    int addUser(Users user);

    //给推荐人奖金
    int updateCapital(@Param("tuijianren")String tuijianren);


    //修改用户金额
    int UpdateUser(String phone,double balance,double balanc);
    //添加充值记录
    int addtrades(String accFrom,double amount);

}
