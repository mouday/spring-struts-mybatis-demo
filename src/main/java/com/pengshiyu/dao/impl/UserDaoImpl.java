package com.pengshiyu.dao.impl;

import com.pengshiyu.bean.User;
import com.pengshiyu.dao.UserDao;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    // 自动注入
    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public List<User> getAll() {
        return this.getSqlSession().selectList(
                "com.pengshiyu.bean.user.mapper.getAll");
    }
}
