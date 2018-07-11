package com.sunpeng.jpasytem.controller;


import com.sunpeng.jpasytem.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String index(){
        User user = new User();
        user.setUserName("sunpeng");
        System.out.println(user.getUserName());
        return "hello world";
    }


}
