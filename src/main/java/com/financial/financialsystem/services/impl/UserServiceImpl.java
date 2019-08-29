package com.financial.financialsystem.services.impl;

import com.financial.financialsystem.dao.UserDao;
import com.financial.financialsystem.entity.Users;
import com.financial.financialsystem.services.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;
    @Override
    public Users getUserByPhone(String phone) {
        return userDao.getUserByPhone(phone);
    }
}
