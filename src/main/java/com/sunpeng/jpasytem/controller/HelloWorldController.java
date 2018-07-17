package com.sunpeng.jpasytem.controller;


import com.sunpeng.jpasytem.system.maill.MailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MailService mailService;

    @RequestMapping("/hello")
    public String hello(){
//        发送邮件
//        mailService.sendSimpleMail("18640580605@163.com","测试"," 测试邮件功能");
        return "hello world";
    }



}
