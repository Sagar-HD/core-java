package com.xworkz.contollers;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/event")
public class EventServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String eventName = req.getParameter("eventName");
        String organizerName = req.getParameter("organizerName");
        String eventDate = req.getParameter("eventDate");
        String venue = req.getParameter("venue");
        String capacity = req.getParameter("capacity");
        String registrationFee = req.getParameter("registrationFee");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        if (!LocalDate.parse(eventDate).isAfter(LocalDate.now())) {
            out.println("<html><body>Event date must be in the future</body></html>");
            return;
        }


            if (Integer.parseInt(capacity) <= 0) {
                out.println("<html><body>Capacity must be positive</body></html>");
                return;
            }



            if (Double.parseDouble(registrationFee) < 0) {
                out.println("<html><body>Registration fee cannot be negative</body></html>");
                return;
            }


        out.println("data saved : ");
        out.println("event name : " + eventName);
        out.println("organizer name : " + organizerName);
        out.println("event date : " + eventDate);
        out.println("venue : " + venue);
        out.println("capacity : " + capacity);
        out.println("registration fee : " + registrationFee);
        out.println("<a href='index.html'>Home</a>");
    }
}
