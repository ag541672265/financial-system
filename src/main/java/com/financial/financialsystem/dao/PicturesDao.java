package com.financial.financialsystem.dao;

import com.financial.financialsystem.entity.Pictures;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

//图片调用
@Mapper
public interface PicturesDao {
    //按类型查找图片地址
    String getPicAddressByGidAndType12(@Param("pic_goods_id") Integer gid, @Param("pic_type") Integer pt1, @Param("pic_type2") Integer pt2);
    //添加图片
    Integer addOnePicture(Pictures pictures);
    //删除图片
    Integer delPicture(@Param("pic_id") Integer pid);
    //修改图片
    Integer setOnePictureById(Pictures pictures);
    //有需求自己添加...
    Pictures test();



}
