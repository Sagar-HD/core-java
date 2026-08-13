package com.xworkz.controller;

import dto.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/feedback")
public class FeedbackServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        HttpSession session=req.getSession(false);
        if(session==null || session.getAttribute("user")==null){
            resp.getWriter().println("please login before giving feedback");
            return;
        }

        User user=(User)session.getAttribute("user");
        String mobile=req.getParameter("mobile");
        String comment=req.getParameter("comment");
        System.out.println(user.getName()+" feedback : "+comment);

        resp.getWriter().write("feedback saved for user "+user.getName());


    }


}
