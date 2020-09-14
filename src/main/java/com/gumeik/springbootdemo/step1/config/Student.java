package com.gumeik.springbootdemo.step1.config;

import com.gumeik.springbootdemo.step1.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//表明该类为配置类
public class Student {
    @Bean//bean的默认id为方法名，默认的值为方法的返回值
    public Person createPerson(){
        Person person = new Person();
        person.setUsername("gumeik");
        person.setAge(17);
        return person;
    }
}
