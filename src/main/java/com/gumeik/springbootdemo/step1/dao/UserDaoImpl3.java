package com.gumeik.springbootdemo.step1.dao;

import com.gumeik.springbootdemo.step1.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Repository;
@ImportResource(value = {"classpath:config/person.xml"})//加载xml文件中的配置，如bean
@Repository//持久层数据注解
public class UserDaoImpl3 implements UserDao{
//    根据xml配置文件注入
    @Autowired
    private Person person;
    @Override
    public void say() {
        System.err.println("UserDaoImpl3");
        System.err.println("person的姓名为：" + person.getUsername());
        System.err.println("person的年龄为：" + person.getAge());
    }
}
