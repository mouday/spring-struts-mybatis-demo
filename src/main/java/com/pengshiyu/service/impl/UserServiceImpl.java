package com.pengshiyu.service.impl;

import com.pengshiyu.bean.User;
import com.pengshiyu.dao.UserDao;
import com.pengshiyu.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> getAll() {
        return userDao.getAll();
    }
}
