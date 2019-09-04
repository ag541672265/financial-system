package com.financial.financialsystem.services.impl;

import com.financial.financialsystem.dao.GoodsDao;
import com.financial.financialsystem.entity.Goods;
import com.financial.financialsystem.services.GoodsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Resource
    private GoodsDao dao;

    @Override
    public List<Goods> getAll() {
        return dao.getAll();
    }

    @Override
    public Goods getById(Integer gid) {
        return dao.getById(gid);
    }

    @Override
    public int delGoodsById(Integer gid) {
        return dao.delGoodsById(gid);
    }

    @Override
    public int addGoods(Goods goods) {
        return dao.addGoods(goods);
    }
}
