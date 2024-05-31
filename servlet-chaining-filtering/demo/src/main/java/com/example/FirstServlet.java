package com.example;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 

public class FirstServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        
        System.out.println("Classpath:");
        for (String path : System.getProperty("java.class.path").split(File.pathSeparator)) {
            System.out.println(path);
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set content type
        response.setContentType("text/html");

        // Forward the request to SecondServlet
        RequestDispatcher dispatcher = request.getRequestDispatcher("/second");
        dispatcher.forward(request, response);
    }
}
