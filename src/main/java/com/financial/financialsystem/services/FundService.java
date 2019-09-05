package com.financial.financialsystem.services;

public interface FundService {
    //查看自己的总基金数
    double zongjijin(Integer uid,int t);
    //查看自己昨天的盈利
    double yesterdayUTP(Integer uid,Integer type);

}
