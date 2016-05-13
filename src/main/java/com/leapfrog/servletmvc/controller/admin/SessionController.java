/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.servletmvc.controller.admin;

import com.leapfrog.servletmvc.controller.helper.Controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
@WebServlet(urlPatterns = {"/admin/mysession/* "})
public class SessionController extends Controller{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if(session.getAttribute("logged in")!=null){
            resp.getWriter().println("<h1>"+session.getAttribute("logged in")+"</h1>");
        }
    }
    
    
}
