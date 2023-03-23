package com.ani.testing.util;

public class CalcUtil {
    public int calc(int num1, int num2) {
        if(num1 < 10 ) throw new RuntimeException("Num1 should range bewtween 10 to 100");
        if(num1 > 100) throw new RuntimeException("Num1 should range bewtween 10 to 100");
        return num1 + num2;
    }
}

// num1 = 10
// num2 = 10
// expected op = 20
// actual op = 20
 
// num1 = 10
// num2 = 200
// expected op = 210