package com.xworkz.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    public MyInitializer() {
        System.out.println("created my initializer");
    }
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MyConfig2.class,MyConfig1.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/test","/me","/something"};
    }
}
