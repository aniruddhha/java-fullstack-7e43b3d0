package com.ani.thread;

public class App {

    public static void demo1() {
        ThreadOne to = new ThreadOne();
        to.start();

        Runnable tt = new ThreadTwo();
        Thread t1 = new Thread(tt);
        t1.start();
    }


    public static void main(String[] args) throws Exception {
        System.out.println("Threading");

    }
}
