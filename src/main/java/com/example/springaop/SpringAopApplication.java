package com.example.springaop;

import com.example.springaop.service.Business1;
import com.example.springaop.service.Business2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.springaop"})
public class SpringAopApplication implements CommandLineRunner {

    private final Business1 business1;

    private final Business2 business2;

    public SpringAopApplication(Business1 business1, Business2 business2) {
        this.business1 = business1;
        this.business2 = business2;
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringAopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(business1.calculateSomething());
        System.out.println(business2.calculateSomething2());
        business1.throwException();
        business2.throwException();
    }
}
