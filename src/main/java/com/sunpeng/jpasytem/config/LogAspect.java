package com.sunpeng.jpasytem.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LogAspect {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Pointcut("execution(public * com.sunpeng.jpasytem.*.*.*(..))")
    public void printLog(){
    }

    @Before("printLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {

        logger.info("Method : " +joinPoint.getSignature());
    }

}
