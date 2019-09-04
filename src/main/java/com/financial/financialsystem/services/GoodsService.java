package com.financial.financialsystem.services;

import com.financial.financialsystem.entity.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsService {

    List<Goods> getAll();

    Goods getById(@Param("gid") Integer gid);

    //管理员功能  下架 上新
    int delGoodsById(@Param("gid") Integer gid);


    int addGoods(Goods goods);
}
