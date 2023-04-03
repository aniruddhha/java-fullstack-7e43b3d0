package com.ani.spring.excel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class XLManager {

    @Autowired
    private XLReader reader; // this ref should point to object created inside ioc container
    
    @Autowired
    private XLFormatter formatter;

    public void configXL() {
        reader.setReadLimit(10);
        formatter.setFont("abc");
    }
}
