package com.example;

import java.io.*;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 

public class SecondServlet  extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set content type
        response.setContentType("text/html");

        response.setContentType("text/html");

        // Write the response
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Hello from SecondServlet</h2>");
        out.println("</body></html>");
      
    }
}
