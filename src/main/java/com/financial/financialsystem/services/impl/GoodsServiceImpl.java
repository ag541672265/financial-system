package com.financial.financialsystem.services.impl;

import com.financial.financialsystem.dao.GoodsDao;
import com.financial.financialsystem.entity.FundVO;
import com.financial.financialsystem.services.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Resource
    private GoodsDao goodsDao;

    @Override
    public List<FundVO> queryAllFund() {
        return goodsDao.queryAllFund();
    }
}
