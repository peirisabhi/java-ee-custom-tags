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
public class Loop extends SimpleTagSupport{
    private int start;
    private int end;

    @Override
    public void doTag() throws JspException, IOException {
        while (start < end) {  
            getJspBody().invoke(null);
            start++;
        }
    }
    
    

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
    
    
}
