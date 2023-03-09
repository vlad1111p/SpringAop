package com.example.springaop.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Aspect
@Configuration
public class AroundAopAspect {

    private final Logger logger = Logger.getLogger(this.getClass().getName());


    @Around("com.example.springaop.config.CommonJoinPointConfig.serviceLayerExecution()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        joinPoint.proceed();
        long timeTaken = System.currentTimeMillis() - startTime;

        logger.info("Time taken by " + joinPoint + " is " + timeTaken);
    }
}
