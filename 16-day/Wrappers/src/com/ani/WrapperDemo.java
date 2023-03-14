package com.ani;

public class WrapperDemo {

    public void demo1() {

        int  i = 10;

        Integer age = 10;

        Integer dt = i; // primitive assigned to class

        int j = age; // object reference assigned to primitive 
    }

    public void demo2() {
        String num1 = "10";
        String num2 = "20";

        int n1 = Integer.parseInt(num1); // converted string to int
        int n2 = Integer.parseInt(num2);

        System.out.println(" Addition is "+ (num1 + num2) );
        System.out.println(" Addition is "+ (n1 + n2) );
    }

    public void demo3() {
        System.out.println("Double Min Value " + Double.MIN_VALUE);
        System.out.println("Double Max Value " + Double.MAX_VALUE); 
    }
}
