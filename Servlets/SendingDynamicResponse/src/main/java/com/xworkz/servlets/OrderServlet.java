package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(loadOnStartup = 1,urlPatterns = "/order")
public class OrderServlet extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        String name = req.getParameter("name");
        String product = req.getParameter("product");
        String quantity = req.getParameter("quantity");
        PrintWriter out=res.getWriter();
        out.println("<h1>Order Details</h1>");
        out.println("<h2>Name: " + name + "</h2>");
        out.println("<h2>Product: " + product + "</h2>");
        out.println("<h2>Quantity: " + quantity + "</h2>");
        out.println("<h2>Thank you for your order</h2>");


    }
}
