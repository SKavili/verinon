package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorld extends HttpServlet {

    
    @Override
    public void init() throws ServletException {
        
        System.out.println("Classpath:");
        for (String path : System.getProperty("java.class.path").split(File.pathSeparator)) {
            System.out.println(path);
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello, World!</h1>"+request.getParameter("id")+""+request.getHeader("User-Agent"));
    }
}
