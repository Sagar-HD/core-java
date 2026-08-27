package com.xworkz.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/profile")
public class ProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=(String) req.getSession().getAttribute("name");
        System.out.println(" got name :"+name+" from session now redirecting again to profile");
        RequestDispatcher rd=req.getRequestDispatcher("Profile.jsp");
        rd.forward(req,resp);
    }
}
