package com.ani.spring.excel;

import org.springframework.stereotype.Component;

@Component
public class XLReader {
    
    private XLFormatter formatter;

    public void setReadLimit(int limit) {
        System.out.println("XLReader : Set Read Limit " + limit);
    }

    public String readXL() {
        return formatter.formatData();
    }
}
