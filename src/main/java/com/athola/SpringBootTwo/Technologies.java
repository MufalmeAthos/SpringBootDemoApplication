/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.athola.SpringBootTwo;

import org.springframework.stereotype.Component;

/**
 *
 * @author HP
 */

@Component
public class Technologies {
    private int t_id;
    private String t_name;

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }
    
    
    public void techs(){
        System.out.println("Successful");
    }
}
