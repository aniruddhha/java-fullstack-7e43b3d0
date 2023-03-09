package com.ani.basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {

    public void demo1() {
        int op1 = 10;
        int op2 = 0;

        // addition op
        int res1 = op1 + op2;
        System.out.println("Addition " + res1);

        // subtraction
        int res2 = op1 - op2;
        System.out.println("Subtraction " + res2);

        // multiplication
        int res3 = op1 * op2;
        System.out.println("Multiplication " + res3);

        // division
        int res4 = op1 / op2; // 10/0 ArithmaticException
        System.out.println("Division " + res4);
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
            Class.forName("com.ani.CarUtilccc"); // 🫳 throw new ClassNotFoundException(); 👈
            
            int a = 10 / 0; // 🫳 throw new ArithmaticException(); 👈

            // forget about what file reader is, right now.
            FileReader fr = new FileReader("ghfhfg.txt"); // 🫳 throw new FileNotFoundException(); 👈
        } catch (FileNotFoundException e /* 🤌 */) {
            System.out.println("❌ File not found");
        } catch (ClassNotFoundException e /* 🤌 */) {
            System.out.println("❌ CarUtil not found");
        } catch (ArithmeticException e/* 🤌 */) {
            System.out.println("❌ You are dividing by zero");
        } catch (Exception e/* 🤌 */) {
            System.out.println("❌ I didnt find matching Exception");
        } catch (Throwable t /* 🤌 */) {
            System.out.println("❌ I find Generic Exception");
        } finally {
            System.out.println("⌛️ I will execute in all cases");
        }
    }

    public void demo5() {
        while (true) {
            while (true) {
                new String();
            }
        }
    }

    public void demo6(int a, int b) throws RuntimeException {

        if( a < 8 || b > 40) {
            throw new RuntimeException("Invalid Values");
        }
    }

    public void demo7(int a, int b) throws Exception {

        if( a < 8 || b > 40) {
            throw new Exception("Invalid Values");
        }
    }
}
