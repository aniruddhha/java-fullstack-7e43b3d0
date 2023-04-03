package com.ani.spring.excel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class XLReader {
    
    // @Autowired // filed level injection
    private XLFormatter formatter;

    // @Autowired // constructor level injection
    // public XLReader(XLFormatter formatter) {
    //     this.formatter = formatter;
    // }

    @Autowired // setter level injection
    public void setFormatter(XLFormatter formatter) {
        this.formatter = formatter;
    }

    public void setReadLimit(int limit) {
        System.out.println("XLReader : Set Read Limit " + limit);
    }

    public String readXL() {
        return formatter.formatData();
    }
}
