package com.financial.financialsystem.services.impl;

import com.financial.financialsystem.dao.PicturesDao;
import com.financial.financialsystem.entity.Pictures;
import com.financial.financialsystem.services.PictureService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PictureServiceImpl implements PictureService {

    @Resource
    PicturesDao picturesDao;

    @Override
    public String getPicAddressByGidAndType12(Integer gid, Integer pt1, Integer pt2) {
        return picturesDao.getPicAddressByGidAndType12(gid, pt1, pt2);
    }

    @Override
    public Integer addOnePicture(Pictures picture) {
        return picturesDao.addOnePicture(picture);
    }

    @Override
    public Integer delPicture(Integer pid) {
        return picturesDao.delPicture(pid);
    }

    @Override
    public Integer setOnePictureById(Pictures picture) {
        return picturesDao.setOnePictureById(picture);
    }

    @Override
    public Pictures test() {
        return picturesDao.test();
    }
}
