package com.ani.aop.xl;

import org.springframework.stereotype.Component;

@Component
public class XLReader {
    
    public void readXLData() {
        System.out.println("Reading XL Data");
    }

    public double readAmountCell() {
        return 0.9;
    }
}
