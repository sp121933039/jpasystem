package com.sunpeng.jpasytem.controller;


import com.sunpeng.jpasytem.service.IHellloService;
import com.sunpeng.jpasytem.system.maill.MailService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;

@RestController
@Slf4j
public class HelloWorldController {


    @Autowired
    private MailService mailService;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private IHellloService hellloService;

    @GetMapping("/hello")
    @ApiOperation(value = "测试方法 hello")
    public Callable<String> hello(){
//        发送邮件
//        mailService.sendSimpleMail("18640580605@163.com","测试"," 测试邮件功能");
            log.info("主线程开始");
         Callable result = new Callable() {
             @Override
             public Object call() throws Exception {
                 log.info("副线程开始");
                 Thread.sleep(2000);
                 log.info("副线程结束");
                 return hellloService.hello();
             }
         };
        log.info("主线程结束");
        redisTemplate.opsForValue().set("test:set","testValue1");




        return result;
    }



}
