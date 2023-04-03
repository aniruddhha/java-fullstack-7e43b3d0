package com.ani.spring.excel;

import org.springframework.stereotype.Component;

@Component
public class XLManager {

    private XLReader reader;
    private XLFormatter formatter;

    public void configXL() {
        reader.setReadLimit(10);
        formatter.setFont("abc");
    }
}
