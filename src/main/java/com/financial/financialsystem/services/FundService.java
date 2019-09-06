package com.financial.financialsystem.services;

import com.financial.financialsystem.external.fund.Trades;

import java.util.List;

public interface FundService {
    //查看自己的总基金数
    double zongjijin(Integer uid,int t);
    //查看自己昨天的盈利
    double yesterdayUTP(Integer uid,Integer type);
    //查看自己某个基金的钱
    double mequeryfunds(Integer uid,Integer gid);
    //查我在基金表的所有记录
    List<Trades> getUSTD(Integer uid);
}
