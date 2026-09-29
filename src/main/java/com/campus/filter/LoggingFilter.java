package com.campus.filter;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;



public class LoggingFilter extends HttpFilter {
    @Override
    public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain)
            throws java.io.IOException,ServletException {
        System.out.println("Request received at: ");
        chain.doFilter(request, response);
    }
    
    
}
