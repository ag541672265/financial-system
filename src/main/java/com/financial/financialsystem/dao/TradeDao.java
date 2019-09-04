package com.financial.financialsystem.dao;

import com.financial.financialsystem.entity.Trades;

public interface TradeDao {

    //添加交易记录
    int addTrade(Trades trade);
}
