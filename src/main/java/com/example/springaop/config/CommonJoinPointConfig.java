package com.example.springaop.config;

import org.aspectj.lang.annotation.Pointcut;

import java.util.logging.Logger;


public class CommonJoinPointConfig {

    private final Logger logger = Logger.getLogger(this.getClass().getName());

    @Pointcut("execution(* com.example.springaop.repository.*.*(..))")
    public void repositoryLayerExecution() {
    }

    @Pointcut("execution(* com.example.springaop.service.*.*(..))")
    public void serviceLayerExecution() {
    }
}
