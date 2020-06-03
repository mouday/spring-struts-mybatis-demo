package com.pengshiyu.action;

import com.opensymphony.xwork2.ActionSupport;
import com.pengshiyu.bean.User;
import com.pengshiyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport {
    private List<User> users;

    @Autowired
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
