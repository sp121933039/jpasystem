package com.sunpeng.jpasytem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableScheduling  //任务调度
@EnableSwagger2
public class JpasytemApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpasytemApplication.class, args);
    }
}
