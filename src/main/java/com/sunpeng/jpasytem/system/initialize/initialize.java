package com.sunpeng.jpasytem.system.initialize;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)   //多个初始化的时候执行顺序
public class initialize implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void run(String... args) throws Exception {
        logger.info("正在初始化一些资源");
    }
}
