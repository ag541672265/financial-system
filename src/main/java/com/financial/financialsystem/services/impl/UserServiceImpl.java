package com.financial.financialsystem.services.impl;

import com.financial.financialsystem.dao.UserDao;
import com.financial.financialsystem.entity.Trades;
import com.financial.financialsystem.entity.Users;
import com.financial.financialsystem.services.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.DecimalFormat;
import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public Users getUserByPhone(String phone) {
        return userDao.getUserByPhone (phone);
    }

    @Override
    public Users getUserByNickName(String nickName) {
        return userDao.getUserByNickName (nickName);
    }

    @Override
    @Transactional
    public int register(Users user, String tuijianren) {
        int n1 = userDao.addUser (user);
        int n2 = userDao.updateCapital (tuijianren);
        if (n1 == 1 && n2 == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public List<Users> getAllUsers() {
        return userDao.getAllUsers ( );
    }

    @Override
    public int updBalanceByid(Double money, int uid) {
        return userDao.updBalanceByid (money, uid);
    }

    @Override
    public List<Trades> getAllTradesByid() {
        return userDao.getAllTradesByid ( );
    }

    @Override
    public int updTradesByid(int uid) {
        return userDao.updTradesByid (uid);
    }


    @Override
    public int UpdateUser(String phone, double balance, double balanc) {
        return userDao.UpdateUser (phone, balance, balanc);
    }

    @Override
    public int addtrades(int accFrom,String orderNumber, double amount) {
        return userDao.addtrades (accFrom,orderNumber, amount);

    }

    @Override
    public double getBlanceByPhone(String phone) {
        return userDao.getBlanceByPhone(phone);
    }

    @Override
    public int updatehead(String headimg,String phone) {
        return userDao.updatehead (headimg,phone);
    }

    //余额算法
    @Override
    @Transactional
    public boolean balanceAlgorithm() {
        List<Users> usersList = getAllUsers();
        double num = getRandom()/1000;
        for(Users us:usersList){
            double db = getdb(us.getBalance()+us.getBalance()*num);
            if(updBalanceByid(db,us.getUid())<0){
                return false;
            }
        }
        return true;
    }
    //数字格式转换
    public double getdb(double num){
        DecimalFormat df = new DecimalFormat("0.00");
        String a = df.format(num);
        double b = Double.parseDouble(a);
        return b;
    }
    //设置随机数的上线和下线
    private static long getRandom(int min, int max) {
        return Math.round(Math.random() * (max - min) + min);
    }
    //随机生成一个数，这个数是1.5~2.0的几率是99%，是2.0~3.5的记率是1%
    private static double getRandom() {
        double r1 = getRandom(15, 20) / 10.0;
        double r2 = getRandom(20, 35) / 10.0;
        float r3 = getRandom(0, 100);
        return r3 < 99 ? r1 : r2;
    }
}
