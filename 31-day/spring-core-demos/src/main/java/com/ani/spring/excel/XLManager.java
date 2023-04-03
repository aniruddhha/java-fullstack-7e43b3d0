package com.ani.spring.excel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ani.spring.util.FileUtil;

@Component
public class XLManager {

    @Autowired
    private XLReader reader; // this ref should point to object created inside ioc container
    
    @Autowired
    private XLFormatter formatter;

    @Autowired
    private FileUtil util;

    public void configXL() {
        reader.setReadLimit(10);
        formatter.setFont("abc");
        util.fileSize();
    }
}
