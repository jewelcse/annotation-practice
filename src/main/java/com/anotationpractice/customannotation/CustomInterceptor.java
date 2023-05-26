package com.anotationpractice.customannotation;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.io.PrintWriter;


public class CustomInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String username = request.getHeader("username");
        String pass = request.getHeader("password");

        if(username != null && pass != null){
            System.out.println("checking the user credentials");
            if(username.equals("admin") && pass.equals("admin")){
                return true;
            }else{
                response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
                PrintWriter out = response.getWriter();
                out.print("An error occurred while processing your request.");
                System.out.println("wrong user credentials");
            }
        }
        return false;
    }

    // todo: what will be happen if the preHandle method return false
    // when preHandle return false, the controller is not called
    // but got the 200 code

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        System.out.println("postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

        System.out.println("afterCompletion");
    }
}
