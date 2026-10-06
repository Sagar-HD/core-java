package com.sagar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan(basePackages = "com.sagar")
public class WebConfig implements WebMvcConfigurer {

    public WebConfig() {
        System.out.println("WebConfig constructor called");
    }

    @Bean
    public Validator validator() {
        return new LocalValidatorFactoryBean();
    }

}
