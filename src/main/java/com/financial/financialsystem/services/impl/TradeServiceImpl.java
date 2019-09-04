package com.financial.financialsystem.services.impl;

import com.financial.financialsystem.dao.TradeDao;
import com.financial.financialsystem.entity.Trades;
import com.financial.financialsystem.services.TradeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TradeServiceImpl implements TradeService {
    @Resource
    private TradeDao tradeDao;

    @Override
    public int addTrade(Trades trade) {
        return tradeDao.addTrade(trade);
    }
}
