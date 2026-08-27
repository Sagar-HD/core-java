package com.xworkz.controller;

import com.xworkz.dto.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/register" )
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String name=req.getParameter("name");
       String password=req.getParameter("password");


       User user=new User(name,password);
       req.setAttribute("message","user "+name+" registered successfully");
        RequestDispatcher rd= req.getRequestDispatcher("Register.jsp");
        rd.forward(req,resp);
    }
}

