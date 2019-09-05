package com.financial.financialsystem.services.impl;

import com.financial.financialsystem.dao.GoodsDao;
import com.financial.financialsystem.entity.Goods;
import com.financial.financialsystem.dao.GoodsDao;
import com.financial.financialsystem.dao.UserDao;
import com.financial.financialsystem.entity.Capital;
import com.financial.financialsystem.entity.Trades;
import com.financial.financialsystem.entity.Users;
import com.financial.financialsystem.services.GoodsService;
import org.apache.ibatis.annotations.Param;
import com.financial.financialsystem.services.UserService;
import com.financial.financialsystem.util.GenerateWord;
import com.financial.financialsystem.util.GetOrNu;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsDao goodsDao;

    @Override
    public List<Goods> getAll() {
        return goodsDao.getAll();
    }

    @Override
    public Goods getById(Integer gid) {
        return goodsDao.getById(gid);
    }

    @Override
    public int delGoodsById(Integer gid) {
        return goodsDao.delGoodsById(gid);
    }

    @Override
    public int addGoods(Goods goods) {
        return goodsDao.addGoods(goods);
    }

    @Override
    @Transactional
    public boolean zhifumoney(Integer uid, Integer gid,Integer type,double money,double capital,double balance) {
        if(tianjiaTOC(uid,gid,money,type,"购买基金")){
            System.out.println("订单添加成功");
        }else{
            System.out.println("订单添加失败");
            return false;
        }
        Capital capitalone=queryugcontact(uid,gid,type);//查看这个人以前有没有用代金券买这个商品

        if(type==11){//理财

        }if(type==9){//基金

        }if(type==5){//保险

        }

        if(capital!=0){
            if(capital>=money){//如果代金券比你要付的钱多或者一样，就只用代金券
                if(capitalone!=null){
                    if(upugcontact(uid,gid,type,money+capitalone.getMoney())){
                        System.out.println("修改一条Capital表数据成功");
                        return upUBCdata(uid,balance,capital-money);
                    }else{
                        System.out.println("更改capital表失败");
                        return false;
                    }
                }else{
                    if(addugcontact(uid,gid,type,money)){
                        System.out.println("添加一条Capital表数据成功");
                        return upUBCdata(uid,balance,capital-money);
                    }else{
                        System.out.println("添加capital表失败");
                        return false;
                    }
                }
            }else{//如果代金券比你要付的钱少，就需要用到余额
                double qian = money-capital;
                if(capitalone!=null){
                    if(upugcontact(uid,gid,type,capital+capitalone.getMoney())){
                        System.out.println("修改一条Capital表数据成功");
                        return upUBCdata(uid,balance-qian,0);
                    }else{
                        System.out.println("更改capital表失败");
                        return false;
                    }
                }else{
                    if(addugcontact(uid,gid,type,capital)){
                        System.out.println("添加一条Capital表数据成功");
                        return upUBCdata(uid,balance-qian,0);
                    }else{
                        System.out.println("添加capital表失败");
                        return false;
                    }
                }

            }
        }else {
            //这里写直接付钱的方法;不用管capital
            System.out.println("没有奖励金");
            return upUBCdata(uid,balance-money,0);
        }
    }

    @Override
    public boolean addugcontact(Integer uid, Integer gid,Integer states,double money) {
        if(goodsDao.addugcontact(uid,gid,states,money)>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean upugcontact(Integer uid, Integer gid, Integer states, double money) {
        if(goodsDao.upugcontact(uid,gid,states,money)>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Capital queryugcontact(Integer uid, Integer gid, Integer states) {
        return goodsDao.queryugcontact(uid,gid,states);
    }

    @Override
    public List<Capital> queryugcontact(Integer uid) {
        return goodsDao.queryugcontact(uid);
    }

    @Override
    public boolean upUBCdata(Integer uid, double balance, double capital) {
        if(goodsDao.upUBCdata(uid,balance,capital)>0){
            System.out.println("user表更改capital成功");
            return true;
        }else {
            System.out.println("user表更改capital失败");
            return false;
        }
    }

    @Override
    public boolean addTOC(Trades trades) {
        if(goodsDao.addTOC(trades)>0){
            return true;
        }else {
            return false;
        }
    }

    public boolean tianjiaTOC(Integer uid, Integer gid, double money,Integer type, String comment) {
        Trades trades = new Trades();
        trades.setAccFrom(uid);
        trades.setGoodsID(gid);
        trades.setOrderNumber(GetOrNu.createOrderNumber());
        trades.setAmount(money);
        trades.setType(type);
        trades.setComment(comment);
        if(addTOC(trades)){
            System.out.println("订单添加成功");
            return true;
        }else {
            System.out.println("订单添加失败");
            return false;
        }
    }

    @Override
    public boolean licaibuy(Integer uid, Integer gid, Integer type, double money, double capital, double balance) {
        return false;
    }

    @Override
    public boolean Redeemmoney(Integer uid, Integer gid, double money) {

        return false;
    }

    @Override
    public Users queryUSID(Integer uid) {
        return goodsDao.queryUSID(uid);
    }

}
