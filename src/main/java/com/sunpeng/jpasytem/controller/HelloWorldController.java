package com.sunpeng.jpasytem.controller;


import com.sunpeng.jpasytem.service.IHellloService;
import com.sunpeng.jpasytem.system.maill.MailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloWorldController {


    @Autowired
    private MailService mailService;

    @Autowired
    private IHellloService hellloService;

    @RequestMapping("/hello")
    public String hello(){
//        发送邮件
//        mailService.sendSimpleMail("18640580605@163.com","测试"," 测试邮件功能");
        log.info("hello方法");
        return hellloService.hello();
    }



}
