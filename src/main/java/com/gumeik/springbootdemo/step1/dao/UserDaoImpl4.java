package com.gumeik.springbootdemo.step1.dao;

import com.gumeik.springbootdemo.step1.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl4 implements UserDao{
    @Autowired
//    根据配置类注入
    @Qualifier(value = "createPerson")
    private Person person;
    @Override
    public void say() {
        System.err.println("UserDaoImpl4");
        System.err.println("Person的姓名为：" + person.getUsername());
        System.err.println("Person的年龄为：" + person.getAge());
    }
}
