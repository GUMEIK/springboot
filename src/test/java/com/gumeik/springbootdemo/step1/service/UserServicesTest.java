package com.gumeik.springbootdemo.step1.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServicesTest {
    @Autowired//此处还可以用另外两个注解resource和r&=…………………………
    private UserService userService;
    @Test
    public void test(){
        userService.say();
    }
}
