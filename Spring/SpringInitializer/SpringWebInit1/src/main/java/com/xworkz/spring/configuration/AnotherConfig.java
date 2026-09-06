package com.xworkz.spring.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AnotherConfig {
    public AnotherConfig() {
        System.out.println("another config created");
    }
}
