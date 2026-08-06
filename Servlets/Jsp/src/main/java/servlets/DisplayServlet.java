package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/save")
public class DisplayServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("servlet called");
        String optionUsed = req.getParameter("optionUsed");
        String feild1 = req.getParameter("feild1");
        String feild2 = req.getParameter("feild2");
        String feild3 = req.getParameter("feild3");
        String feild4 = req.getParameter("feild4");
        req.setAttribute("feild1",feild1);
        req.setAttribute("feild2",feild2);
        req.setAttribute("feild3",feild3);
        req.setAttribute("feild4",feild4);

        req.setAttribute("optionUsed",optionUsed);

       RequestDispatcher dispatcher= req.getRequestDispatcher("response.jsp");
       dispatcher.forward(req,res);


    }
}
