package com.ani.sdw;

import com.ani.sdw.date.DateDemo;

public class App {

    public static void demo1() {
        com.ani.sdw.StringDemos sd = new com.ani.sdw.StringDemos();
        sd.demo2();

        com.ani.sdw.Animal an = new com.ani.sdw.Animal();
        an.st();
        
        com.ani.sdw.date.Animal an1 = new com.ani.sdw.date.Animal();
        an1.dt();
    }

    public static void demo2() {
        StringDemos sd = new StringDemos();
        sd.demo5();
    }

    public static void demo3() {
        DateDemo dd = new DateDemo();
        dd.demo2();
    }
    public static void main(java.lang.String[] args) throws java.lang.Exception {
        java.lang.System.out.println("🔥 String, Date, Warapper 🔥");

       demo3();
    }
}
