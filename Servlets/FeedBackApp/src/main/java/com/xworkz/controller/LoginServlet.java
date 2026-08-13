package com.xworkz.controller;

import dto.User;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {


        String name=req.getParameter("name");
        String password=req.getParameter("password");
        ServletContext context= req.getServletContext();
          User user= (User)context.getAttribute(name);
          if(user==null || !user.getPassword().equals(password)){
              res.getWriter().println("username or password wrong");
              return;
          }
        HttpSession session=req.getSession();
          session.setAttribute("user",user);


          res.getWriter().println("<html>" +
                  "<body>"+
                  "login success you can give ur feedback " +
                  "<a href=\"feedback.jsp\"> feedback</a>"+

                  "</body>"+
                  "</html>");









    }
}
