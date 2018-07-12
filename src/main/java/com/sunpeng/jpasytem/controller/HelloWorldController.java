package com.sunpeng.jpasytem.controller;


import com.sunpeng.jpasytem.entity.User;
import com.sunpeng.jpasytem.maill.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private MailService mailService;

    @RequestMapping("/hello")
    public String index(){
        User user = new User();
        user.setUserName("sunpeng");
        System.out.println(user.getUserName());
//        发送邮件
//        mailService.sendSimpleMail("********","test simple mail"," hello this is simple mail");
        return "hello world";
    }


}
