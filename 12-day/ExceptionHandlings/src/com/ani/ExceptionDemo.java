package com.ani;

public class ExceptionDemo {
    
    public void demo1() {
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
        int res4 = op1 / op2; // 10/0 ArithmaticException
        System.out.println("Division "+ res4);
    }

    public void demo2() {
        int[] arr = { 89, 90, 78 };
        System.out.println(arr[9]); // ArrayIndexOutOfBoundException
    }

    public void demo3() {
        String str = null; 
        str.length(); // NullPointerException
    }

    public void demo4() {
        // ClassNotFoundException
        try {
            // expected event is, it will load CarUtil class
            // unexpected is CarUtil is not available
            Class.forName("com.ani.CarUtil");   // 🫳 throw new ClassNotFoundException(); 👈 
        } catch (Exception e/*🤌*/) {
            System.out.println("❌ CarUtil class is not available");
        } finally {
            System.out.println("⌛️ I will execute in all cases");
        }
    }

    public void demo5() {
        while(true) {
            while(true) {
                new String();
            }
        }
    }
}
