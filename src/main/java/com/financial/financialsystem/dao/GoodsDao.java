package com.financial.financialsystem.dao;

import com.financial.financialsystem.entity.Capital;
import com.financial.financialsystem.entity.Trades;

import java.util.List;

public interface GoodsDao {
    //增加一条用户代金券商品关系
    int addugcontact(Integer uid,Integer gid,Integer states,double money);
    //修改一条用户代金券商品关系
    int upugcontact(Integer uid,Integer gid,Integer states,double money);
    //查看这个用户以前有没有用代金券买这个商品
    Capital queryugcontact(Integer uid, Integer gid,Integer states);
    //查Capital表，这个人花出去多少代金券
    List<Capital> queryugcontact(Integer uid);
    //更改user表的balance,capital
    int upUBCdata(Integer uid,double balance,double capital);
    //添加订单
    int addTOC(Trades trades);
}
