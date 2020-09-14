package com.gumeik.springbootdemo.step2.controller;

import com.gumeik.springbootdemo.step2.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Slf4j
@Controller
public class NestedController {
    @RequestMapping("/test")
    @ResponseBody
    public String test(@RequestBody User user){
        System.err.println("请求参数name：字段:" + user.getName());
        System.err.println("请求参数age:字段:" + user.getAge());
        System.err.println("请求参数Info字段：" + user.getInfo());
        System.err.println("info字段：lover：" + user.getInfo().getLover());
        System.err.println("info字段：sex：" + user.getInfo().getSex());
        return "success,200";
    }
}
