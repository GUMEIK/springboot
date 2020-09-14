package com.gumeik.springbootdemo.step1.service;

import com.gumeik.springbootdemo.step1.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Qualifier(value = "userDaoImpl4")//和@AutoWired注解配合使用
    @Autowired
    private UserDao userDao;
    public void say(){
        userDao.say();
    }
}
