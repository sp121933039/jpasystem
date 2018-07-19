package com.sunpeng.jpasytem.system.initialize;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)   //多个初始化的时候执行顺序
@Slf4j
public class initialize implements CommandLineRunner {



    @Override
    public void run(String... args) throws Exception {
        log.info("正在初始化一些资源");
    }
}
