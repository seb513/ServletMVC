/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.servletmvc.dao.impl;

import com.leapfrog.servletmvc.controller.entity.Contact;
import com.leapfrog.servletmvc.dao.ContactDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class ContactDAOImpl implements ContactDAO{

    @Override
    public List<Contact> getAll() {
        List<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact("Shiva","Shrestha", "sthaseb@gmail.com", "Hey Buddy", "Where the hell are you?"));
        contactList.add(new Contact("Sanjay","Hona", "honasanjay@gmail.com", "Hey Buddy", "Where are you?"));
        contactList.add(new Contact("Pujan","Maharjan", "puzmhz@gmail.com", "Hey Buddy", "lol"));
        return contactList;
    }
    
}
