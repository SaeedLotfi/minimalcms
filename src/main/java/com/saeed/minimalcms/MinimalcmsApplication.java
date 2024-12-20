package com.saeed.minimalcms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class MinimalcmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(MinimalcmsApplication.class, args);
    }
}
