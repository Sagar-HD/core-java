package com.xworkz.controller;

import com.xworkz.dto.UserDto;
import com.xworkz.service.SignUpService;
import com.xworkz.service.SignUpServiceImpl;

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
        SignUpService service=new SignUpServiceImpl();


        if(userId==null||email==null||name==null||password==null||confirmPassword==null){
            res.getWriter().println("all fields required");
            return;
        }
//        if(!password.equals(confirmPassword)){
//            res.getWriter().println("password dont match");
//            return;
//        }

        UserDto userDto =new UserDto(email,Integer.parseInt(userId),name,password);
        service.validateAndSave(userDto);
        ServletContext context=req.getServletContext();

        context.setAttribute(name, userDto);


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
