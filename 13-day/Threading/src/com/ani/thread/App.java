package com.ani.thread;

public class App {

    public static void demo1() {
        ThreadOne to = new ThreadOne();
        to.start();

        Runnable task1 = new ThreadTwo();
        Thread t1 = new Thread(task1);
        t1.start();

        Runnable task2 = new ExcelReaderTask();
        Thread t2 = new Thread(task2);
        t2.start();
    }


    public static void main(String[] args) throws Exception {
        System.out.println("Threading");

    }
}
