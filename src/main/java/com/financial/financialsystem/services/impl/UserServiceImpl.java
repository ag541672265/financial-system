package com.financial.financialsystem.services.impl;

import com.financial.financialsystem.dao.UserDao;
import com.financial.financialsystem.entity.Trades;
import com.financial.financialsystem.entity.Users;
import com.financial.financialsystem.services.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;
    @Override
    public Users getUserByPhone(String phone) {
        return userDao.getUserByPhone(phone);
    }

    @Override
    public Users getUserByNickName(String nickName) {
        return userDao.getUserByNickName(nickName);
    }

    @Override
    @Transactional
    public int register(Users user,String tuijianren) {
        int n1=userDao.addUser(user);
        int n2=userDao.updateCapital(tuijianren);
        if(n1==1 && n2==1){
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public List<Users> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public int updBalanceByid(Double money,int uid) {
        return userDao.updBalanceByid(money,uid);
    }

    @Override
    public List<Trades> getAllTradesByid() {
        return userDao.getAllTradesByid();
    }

    @Override
    public int updTradesByid(int uid) {
        return userDao.updTradesByid(uid);


    @Override
    public int UpdateUser(String phone, double balance,double balanc) {
        return userDao.UpdateUser(phone,balance,balanc);
    }

    @Override
    public int addtrades(String phone, double amount) {
        return userDao.addtrades(phone,amount);

    }
}
