package com.example.springaop.service;

import com.example.springaop.repository.Dao1;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class Business1 {

    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final Dao1 dao1;

    public Business1(Dao1 dao1) {
        this.dao1 = dao1;
    }

    public String calculateSomething() {
        logger.info("calculateSomething() called from Business1");
        return dao1.retrieveSomething();
    }

    public void throwException() {
        try {
            new RuntimeException("Exception from Business1");
        } catch (RuntimeException ignored) {

        }
    }
}
