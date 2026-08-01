package com.xworkz.controllers;

import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(loadOnStartup = 1, urlPatterns = "/test", initParams = @WebInitParam(name = "name", value = "sagar"))
public class TestServlet implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {


        System.out.println("Servlet initialized , deployed by "+config.getInitParameter("name"));


    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service method called ");
        res.getWriter().println("<h1>we got your request </h1>");
        res.getWriter().println("<a href=\"/test\">click here to go back<a/>");
    }

    @Override
    public String getServletInfo() {
        return "test Servlet";
    }

    @Override
    public void destroy() {
        System.out.println("servlet is going to destory");

    }
}
