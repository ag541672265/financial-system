package com.financial.financialsystem.services;

import com.financial.financialsystem.entity.Capital;
import com.financial.financialsystem.entity.Trades;

import java.util.List;

import com.financial.financialsystem.entity.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsService {

    List<Goods> getAll();

    Goods getById(@Param("gid") Integer gid);

    //管理员功能  下架 上新
    int delGoodsById(@Param("gid") Integer gid);


    int addGoods(Goods goods);
    /*杨可鹏写的，购买方法公用的，我需要用户id，商品id，购买的金额,和代金券剩余的钱,还要传一个type
    *（用户的id和代金券这个钱从session里查，商品id和购买金额是你传给我的,
    *type是告诉我是买的哪种类型的商品（1是基金，2是理财，3是保险）），
    *我会修改user表的余额和代金券。优限使用代金券交易
    */
    boolean zhifumoney(Integer uid, Integer gid,Integer type,double money,double capital,double balance);
    //增加一条用户代金券商品关系
    boolean addugcontact(Integer uid,Integer gid,Integer states,double money);
    //修改一条用户代金券商品关系
    boolean upugcontact(Integer uid,Integer gid,Integer states,double money);
    //查看这个用户以前有没有用代金券买这个商品
    Capital queryugcontact(Integer uid, Integer gid,Integer states);
    //查Capital表，这个人花出去多少代金券
    List<Capital> queryugcontact(Integer uid);
    //更改user表的balance,capital
    boolean upUBCdata(Integer uid,double balance,double capital);
    //添加订单
    boolean addTOC(Trades trades);
    boolean tianjiaTOC(Integer uid, Integer gid, double money,Integer type, String comment);

    //赎回基金的方法
    boolean Redeemmoney(Integer uid, Integer gid, double money);
}
