package com.sagar.app.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitialiser extends AbstractAnnotationConfigDispatcherServletInitializer {


    public WebInitialiser() {

        System.out.println("WebInitialiser constructor called");

    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/","/index.jsp"};
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{AppConfig.class};
    }

}
