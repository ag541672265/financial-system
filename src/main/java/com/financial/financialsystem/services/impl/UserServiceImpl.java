package com.financial.financialsystem.services.impl;

import com.financial.financialsystem.dao.UserDao;
import com.financial.financialsystem.entity.IdCard;
import com.financial.financialsystem.entity.Users;
import com.financial.financialsystem.services.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    //注册功能，添加用户。
    @Override
    public boolean addUsers(String nickName,String phone,String password,String account) {
        if (userDao.addUsers(nickName,phone,password,account) > 0) {
            return true;
        }
        return false;
    }


    //根据account查找用户
    @Override
    public Users queryUserByAccount(String account) {
        Users user = userDao.queryUserByAccount(account);
        return user;
    }


    //根据电话号查找用户//添加100块邀请钱
    @Override
    public int queryUserByPhone(String tuiphone) {
        Users users = userDao.queryUserByPhone(tuiphone);
        int states = users.getStates();
        int n = 0;
        if(states>0){
            double capital = users.getCapital();
            capital = capital+100;
            n = userDao.addMoneyByPhone(capital,tuiphone);
        }
        return n;
    }
    //根据昵称查找昵称
    @Override
    public String getUserByNickName(String nickName) {
        String n = userDao.getUserByNickName(nickName);
        return n;
    }
    //根据电话号返回用户信息
    @Override
    public Users getUserByPhone(String phone) {
        Users user = userDao.queryUserByPhone(phone);
        return user;
    }
    //添加身份证信息
    @Override
    public int addIdCard(String cName,String cardId,int uid) {
        int n = userDao.addIdCard(cName,cardId,uid);
        return n;
    }

    @Override
    public int updateBalance(int uid, double balance) {
        int n = userDao.updateBalance(uid,balance);
        return n;
    }

    @Override
    public double getBanlanceByUid(int uid) {
        double balance = userDao.getBanlanceByUid(uid);
        return balance;
    }

//    @Override
//    public Long getUidByAccount(String account) {
//        Long n = userDao.getUidByAccount(account);
//        return n;
//    }
}
