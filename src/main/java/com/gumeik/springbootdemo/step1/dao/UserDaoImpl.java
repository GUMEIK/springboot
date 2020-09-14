package com.gumeik.springbootdemo.step1.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

@Repository
@PropertySource(value = {"classpath:config/user.properties"})
public class UserDaoImpl implements UserDao {
    @Value("${user.name}")//实现简单值的注入
    private String username;
    @Value("${user.age}")
    private String userage;
    @Override
    public void say() {
        System.err.println("用户的姓名为：" + username);
        System.err.println("用户的年龄为：" + userage);
    }
}
