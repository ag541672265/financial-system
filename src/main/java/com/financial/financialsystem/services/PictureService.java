package com.financial.financialsystem.services;

import com.financial.financialsystem.entity.Pictures;
import org.springframework.web.bind.annotation.RequestParam;

public interface PictureService {
    //按类型查找图片地址
    String getPicAddressByGidAndType12(Integer gid,Integer pt1,Integer pt2);
    //添加图片
    Integer addOnePicture(Pictures picture);
    //删除图片
    Integer delPicture(Integer pid);
    //修改图片
    Integer setOnePictureById(Pictures picture);

    Pictures test();
}
