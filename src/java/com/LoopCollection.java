/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com;

import java.io.IOException;
import java.util.List;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author abhi
 */
public class LoopCollection extends SimpleTagSupport{
    private List items;
    private String var;

    @Override
    public void doTag() throws JspException, IOException {

        for(Object  o : items){
        getJspContext().setAttribute(var, o);
        getJspBody().invoke(null);
        }
    
    }
    
    
    

    public List getItems() {
        return items;
    }

    public void setItems(List items) {
        this.items = items;
    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }
}
