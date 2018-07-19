package com.sunpeng.jpasytem.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
@Slf4j
public class LogAspect {

    @Pointcut("execution(public * com.sunpeng.jpasytem.*.*.*(..))")
    public void printLog(){
    }

    @Before("printLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {

        log.info("Method : " +joinPoint.getSignature());
    }

}
