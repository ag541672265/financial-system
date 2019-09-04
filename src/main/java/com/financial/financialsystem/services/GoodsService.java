package com.financial.financialsystem.services;

import com.financial.financialsystem.entity.FundVO;

import java.util.List;

public interface GoodsService {

    //查询所有基金商品
    List<FundVO> queryAllFund();
}
