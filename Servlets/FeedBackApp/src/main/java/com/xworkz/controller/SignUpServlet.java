package com.xworkz.controller;

import dto.User;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/signup")
public class SignUpServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

        String userId=req.getParameter("userId");
        String email=req.getParameter("email");
        String name=req.getParameter("name");
        String password=req.getParameter("password");
        String confirmPassword=req.getParameter("confirmPassword");

        if(userId==null||email==null||name==null||password==null||confirmPassword==null){
            res.getWriter().println("all fields required");
            return;
        }
        if(!password.equals(confirmPassword)){
            res.getWriter().println("password dont match");
            return;
        }
        User user=new User(email,Integer.parseInt(userId),name,password);
        ServletContext context=req.getServletContext();

        context.setAttribute(name,user);


        res.getWriter().println(
                "<html>"+
                        "</body>"
                +"sign up suceess please login to give feedback !" +

                "<a href=\"login.jsp\">login</a>"
                        +"</body>"
                +"</html>"
                );





    }
}
