package com.financial.financialsystem.services;

import com.financial.financialsystem.entity.Trades;

public interface TradeService {

    //添加交易记录
    int addTrade(Trades trade);
}
