package com.xworkz.contollers;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Arrays;

@WebServlet(urlPatterns = "/vehicle")
public class VehicleServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String vehicleNumber = req.getParameter("vehicleNumber");
        String ownerName = req.getParameter("ownerName");
        String vehicleType = req.getParameter("vehicleType");
        String registrationDate = req.getParameter("registrationDate");
        String insuranceValidTill = req.getParameter("insuranceValidTill");
        String fuelType = req.getParameter("fuelType");

        resp.setContentType("text/html");
        PrintWriter out= resp.getWriter();

        if (!LocalDate.parse(insuranceValidTill).isAfter(LocalDate.now())) {

            out.println("<html><body>Invalid insurance date</body></html>");


        }

        if (!Arrays.asList("Petrol", "Diesel", "CNG").contains(fuelType)) {
            out.println("<html><body>Invalid fuel type</body></html>");

        }

        out.println("data saved : ");
        out.println("vehicle number : "+vehicleNumber);
        out.println("owner name : "+ownerName);
        out.println("vehicle type : "+vehicleType);
        out.println("registration date : "+registrationDate);
        out.println("insurance valid till : "+insuranceValidTill);
        out.println("fuel type : "+fuelType);
        out.println("<a href='index.html'>Home</a>");



    }
}
