package com.example.springaop.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Aspect
@Configuration
public class BeforeAopAspect {

    private final Logger logger = Logger.getLogger(this.getClass().getName());

    @Before("com.example.springaop.config.CommonJoinPointConfig.serviceLayerExecution()")
    public void before(JoinPoint joinPoint) {
        logger.info("Check for intercepted method " + joinPoint.getSignature().getName());
    }

}
