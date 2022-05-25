/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author abhi
 */
public class Test extends SimpleTagSupport{
    private String first_name;
    private String last_name;

    @Override
    public void doTag() throws JspException, IOException {
        
        getJspBody().invoke(null);
        
       getJspContext().getOut().write("<h1>");
       getJspContext().getOut().write(first_name + " " + last_name);
       getJspContext().getOut().write("</h1>");
    }
    
    
    
    

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getLast_name() {
        return last_name;
    }
}
