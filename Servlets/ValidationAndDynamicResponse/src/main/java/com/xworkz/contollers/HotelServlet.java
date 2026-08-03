package com.xworkz.contollers;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/hotel")
public class HotelServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String guestName = req.getParameter("guestName");
        String checkInDate = req.getParameter("checkInDate");
        String checkOutDate = req.getParameter("checkOutDate");
        String roomType = req.getParameter("roomType");
        String numberOfGuests = req.getParameter("numberOfGuests");
        String totalAmount = req.getParameter("totalAmount");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        if (!LocalDate.parse(checkOutDate).isAfter(LocalDate.parse(checkInDate))) {
            out.println("<html><body>Check-out date must be after check-in date</body></html>");
            return;
        }


            int guests = Integer.parseInt(numberOfGuests);
            if (guests <= 0) {
                out.println("<html><body>Number of guests must be positive</body></html>");
                return;
            }

            if (roomType.equals("Single") && guests > 1) {
                out.println("<html><body>Single room can accommodate only 1 guest</body></html>");
                return;
            }
            if (roomType.equals("Double") && guests > 2) {
                out.println("<html><body>Double room can accommodate only 2 guests</body></html>");
                return;
            }
            if (roomType.equals("Suite") && guests > 4) {
                out.println("<html><body>Suite can accommodate maximum 4 guests</body></html>");
                return;
            }


            if (Double.parseDouble(totalAmount) <= 0) {
                out.println("<html><body>Total amount must be positive</body></html>");
                return;
            }


        out.println("data saved : ");
        out.println("guest name : " + guestName);
        out.println("check-in date : " + checkInDate);
        out.println("check-out date : " + checkOutDate);
        out.println("room type : " + roomType);
        out.println("number of guests : " + numberOfGuests);
        out.println("total amount : " + totalAmount);
        out.println("<a href='index.html'>Home</a>");
    }
}
