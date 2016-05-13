/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.servletmvc.dao;

import com.leapfrog.servletmvc.controller.entity.Contact;
import java.util.List;

/**
 *
 * @author User
 */
public interface ContactDAO {
    List<Contact> getAll();
}
