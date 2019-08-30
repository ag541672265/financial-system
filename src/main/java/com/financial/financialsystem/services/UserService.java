package com.financial.financialsystem.services;

import com.financial.financialsystem.entity.IdCard;
import com.financial.financialsystem.entity.Users;

public interface UserService {
    //注册功能，添加用户。
    boolean addUsers(String nickName,String phone,String password,String account);
    //根据account查找用户
    Users queryUserByAccount(String account);
    //根据电话号查找用户//添加100块邀请钱
    int queryUserByPhone(String phone);
    //异步查昵称
    String getUserByNickName(String nickName);

    Users getUserByPhone(String phone);
    //插入身份证信息
    int addIdCard(String cName,String cardId,int uid);
    //根据账户查找用户uid
//    Long getUidByAccount(String account);
    //修改余额
    int updateBalance(int uid,double balance);
    //查询即时余额
    double getBanlanceByUid(int uid);
}
