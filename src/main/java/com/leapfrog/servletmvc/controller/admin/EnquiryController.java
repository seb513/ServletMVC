/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.servletmvc.controller.admin;

import com.leapfrog.servletmvc.controller.helper.Controller;
import com.leapfrog.servletmvc.dao.ContactDAO;
import com.leapfrog.servletmvc.dao.impl.ContactDAOImpl;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
@WebServlet(name="enquiry",urlPatterns ={"/admin/enquiry/*"})
public class EnquiryController extends Controller{
    private ContactDAO contactDAO = new ContactDAOImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String vp="/WEB-INF/views/admin/enquiry/index.jsp";
        req.setAttribute("contacts",contactDAO.getAll());
        
        HttpSession session = req.getSession(true);
        session.setAttribute("logged in", "you are logged in");
        RequestDispatcher dispatcher = req.getRequestDispatcher(vp);
        dispatcher.forward(req, resp);
    }
 
}
