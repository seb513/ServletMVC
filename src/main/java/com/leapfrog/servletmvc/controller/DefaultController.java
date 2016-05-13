/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.servletmvc.controller;

import com.leapfrog.servletmvc.controller.helper.Email;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="default",urlPatterns ={"/","/contact/*"})
public class DefaultController extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        String vp="/WEB-INF/views/index.jsp";
        if(request.getRequestURI().contains("/contact")){
           vp= "/WEB-INF/views/contact.jsp";
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(vp);
        dispatcher.forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //response.getWriter().println(request.getParameter("first_name"));
        Email email = new Email();
        email.setFrom(request.getParameter("email"));
        email.setHost("smtp.wlink.com.np");
        //email.setHost("smtp.ntc.net.np");
        email.setSubject(request.getParameter("subject"));
        email.setBody(request.getParameter("message"));
        email.send();
        response.getWriter().println("<h1>Thank you</h1>");
    }
}
