package com.gumeik.springbootdemo.step1.dao;

import com.gumeik.springbootdemo.step1.bean.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
@Repository
public class UserDaoImpl2 implements UserDao {
//    @Resource(name = "userBean")//spring不推荐使用该注解
    @Autowired
    @Qualifier(value = "userBean")
    private UserBean userBean;
    @Override
    public void say() {
        System.err.println("UserDaoImpl2");
        System.err.println("user的姓名为:" + userBean.getName());
        System.err.println("user的年龄为：" + userBean.getAge());
    }

}
