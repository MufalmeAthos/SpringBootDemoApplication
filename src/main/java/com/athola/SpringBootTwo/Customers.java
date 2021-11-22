/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.athola.SpringBootTwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author HP
 */

@Component
public class Customers {
    private int c_id;
    private String c_name;
    private String c_coursename;
    @Autowired
    private Technologies techdetails;

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getC_coursename() {
        return c_coursename;
    }

    public void setC_coursename(String c_coursename) {
        this.c_coursename = c_coursename;
    }

    public Technologies getTechdetails() {
        return techdetails;
    }

    public void setTechdetails(Technologies techdetails) {
        this.techdetails = techdetails;
    }

   
    public void diplayer(){
        System.out.println("Object created successfully, On my birthday");
        techdetails.techs();
    }
    
}
