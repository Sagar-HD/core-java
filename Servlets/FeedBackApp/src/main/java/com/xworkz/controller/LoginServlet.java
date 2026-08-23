package com.xworkz.controller;

import com.xworkz.dao.UserDao;
import com.xworkz.dto.UserDto;
import com.xworkz.dto.UserLoginDto;
import com.xworkz.service.SignInService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {


        String name=req.getParameter("name");
        String password=req.getParameter("password");
        ServletContext context= req.getServletContext();

          UserLoginDto userLoginDto= new UserLoginDto(password,name);


        SignInService signInService=new SignInService(new UserDao());

        if(!signInService.verifyLogin(userLoginDto)){
            res.getWriter().println("username or password wrong");
           return;
        }

        HttpSession session=req.getSession();


         UserDto userDto=signInService.userByName(name);

        session.setAttribute("user", userDto);


        RequestDispatcher rd=req.getRequestDispatcher("feedback.jsp");
        rd.forward(req,res);









    }
}
