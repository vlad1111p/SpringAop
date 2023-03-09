package com.example.springaop.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Aspect
@Configuration
public class AfterAopAspect {

    private final Logger logger = Logger.getLogger(this.getClass().getName());

    @AfterReturning(
            value = "execution(* com.example.springaop.service.*.*(..))",
            returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        logger.info("Check for intercepted method " + joinPoint.getSignature().getName());
        logger.info("Value returned by intercepted method " + result);
    }

    @After("com.example.springaop.config.CommonJoinPointConfig.serviceLayerExecution()")
    public void after(JoinPoint joinPoint) {
        logger.info("After execution " + joinPoint.getSignature().getName());
    }

    @AfterThrowing(
            value = "execution(* com.example.springaop.service.*.*(..))",
            throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint, Exception exception) {
        logger.info("Check for intercepted method " + joinPoint.getSignature().getName());
        logger.info("Exception thrown by intercepted method " + exception);
    }
}
