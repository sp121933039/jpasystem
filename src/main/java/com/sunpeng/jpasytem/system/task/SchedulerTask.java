package com.sunpeng.jpasytem.system.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class SchedulerTask {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(cron="0 0/1 * * * ?")
    private void process(){
        System.out.println(dateFormat.format(new Date()));

    }

}