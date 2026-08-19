package com.xworkz.controller;

import com.xworkz.dao.FeedBackDao;
import com.xworkz.dto.FeedBackDto;
import com.xworkz.dto.UserDto;
import com.xworkz.service.FeedBackServiceImpl;

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

        UserDto userDto =(UserDto)session.getAttribute("user");
        String mobile=req.getParameter("mobile");
        String comment=req.getParameter("comment");
        FeedBackDto feedBackDto=new FeedBackDto(comment,Long.parseLong(mobile),userDto.getId());
        System.out.println(userDto +" feedback : " +feedBackDto);
        FeedBackServiceImpl feedBackService=new FeedBackServiceImpl(new FeedBackDao());
        feedBackService.validateAndSave(feedBackDto);

        req.setAttribute("user",userDto);
        req.setAttribute("feedback",feedBackDto);

        req.getRequestDispatcher("feedback.jsp").forward(req,resp);



    }


}
