package com.pengshiyu.dao.impl;

import com.pengshiyu.bean.User;
import com.pengshiyu.dao.UserDao;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    public List<User> getAll() {
        return this.getSqlSession().selectList(
                "com.pengshiyu.bean.user.mapper.getAll");
    }
}
