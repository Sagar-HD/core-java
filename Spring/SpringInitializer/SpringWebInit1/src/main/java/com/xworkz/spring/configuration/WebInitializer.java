package com.xworkz.spring.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    public WebInitializer() {
        System.out.println("web initializer created");
    }
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class,AnotherConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/","/home","/spring"};
    }
}
