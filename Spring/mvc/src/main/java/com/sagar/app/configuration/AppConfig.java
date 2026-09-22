package com.sagar.app.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sagar.app")
public class AppConfig {
    public AppConfig() {
        System.out.println("app config created");
    }
}
