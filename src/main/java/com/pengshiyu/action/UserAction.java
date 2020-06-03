package com.pengshiyu.action;

import com.opensymphony.xwork2.ActionSupport;
import com.pengshiyu.bean.User;
import com.pengshiyu.service.UserService;

import java.util.List;

public class UserAction extends ActionSupport {
    private List<User> users;
    private UserService userService;

    public String list(){
        System.out.println("list");

        users = userService.getAll();
        System.out.println(users);
        return SUCCESS;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
