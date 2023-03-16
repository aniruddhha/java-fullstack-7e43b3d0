package com.ani.lmd;

public class BasicDemo {
    
    public void demo1() {

        // Runnable runnable = some object
        Runnable runnable = new Runnable() {
            @Override
            public void run() { }
        };
        // can I assign funtion
    }

    public void demo2() {
        // Runnable runnable = some function
        Runnable runnable1 = () -> { };

        Runnable runnable2 = this::someFunction;
    }

    public void someFunction() {

    }
}
