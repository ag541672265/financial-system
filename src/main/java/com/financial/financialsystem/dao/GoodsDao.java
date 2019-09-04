package com.financial.financialsystem.dao;

import com.financial.financialsystem.entity.FundVO;

import java.util.List;

public interface GoodsDao {

    //查询所有基金商品
    List<FundVO> queryAllFund();
}
