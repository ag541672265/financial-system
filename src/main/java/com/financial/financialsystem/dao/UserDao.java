package com.financial.financialsystem.dao;

import com.financial.financialsystem.entity.Users;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

    //根据手机号查询用户
    Users getUserByPhone(@Param("phone")String phone);


}
