package com.example;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;

public class F implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Initialization code, if needed
        System.out.println("In Initializing");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // Perform pre-processing tasks, if needed
        System.out.println("LoggingFilter: Request received from " + request.getRemoteAddr());

        // Pass the request and response to the next filter in the chain
        chain.doFilter(request, response);

        // Perform post-processing tasks, if needed
        System.out.println("LoggingFilter: Response sent back to client");
    }

    @Override
    public void destroy() {
        // Cleanup code, if needed
    }
}
