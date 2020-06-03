package com.pengshiyu.service.impl;

import com.pengshiyu.bean.User;
import com.pengshiyu.dao.UserDao;
import com.pengshiyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> getAll() {
        return userDao.getAll();
    }
}
