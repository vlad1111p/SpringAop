package com.example.springaop.service;

import com.example.springaop.repository.Dao2;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class Business2 {


    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final Dao2 dao2;

    public Business2(Dao2 dao2) {
        this.dao2 = dao2;
    }

    public String calculateSomething2() {
        logger.info("calculateSomething2() called from Business2");
        return dao2.retrieveSomething();
    }

    public void throwException() {
        try {
            new RuntimeException("Exception from Business2");
        } catch (RuntimeException ignored) {
        }
    }
}
