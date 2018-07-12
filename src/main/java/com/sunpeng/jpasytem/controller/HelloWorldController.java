package com.sunpeng.jpasytem.controller;


import com.sunpeng.jpasytem.entity.User;
import com.sunpeng.jpasytem.system.maill.MailService;
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
        mailService.sendSimpleMail("121933039@qq.com","测试"," 测试邮件功能");
        return "hello world";
    }


}
