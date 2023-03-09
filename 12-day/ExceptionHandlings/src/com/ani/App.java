package com.ani;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int op1 = 10;
        int op2 = 0;

        // addition op
        int res1 = op1 + op2;
        System.out.println("Addition "+ res1);

        // subtraction
        int res2 = op1 - op2;
        System.out.println("Subtraction "+ res2);

        // multiplication
        int res3 = op1 * op2;
        System.out.println("Multiplication "+ res3);

        // division
        int res4 = op1 / op2; // 10/0
        System.out.println("Division "+ res4);

    }
}
