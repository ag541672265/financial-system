package com.financial.financialsystem.services;

import com.financial.financialsystem.entity.Users;
import org.apache.ibatis.annotations.Param;

public interface UserService {


    //根据手机号登录
    Users getUserByPhone(@Param("phone")String phone);
}
