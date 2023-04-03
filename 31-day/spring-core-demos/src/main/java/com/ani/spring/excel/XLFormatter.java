package com.ani.spring.excel;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class XLFormatter {
    
    public void setFont(String font) {
        System.out.println("XLFormatter : Set Font to " + font);
    }

    public String formatData() {
        return "formated data";
    }
}
