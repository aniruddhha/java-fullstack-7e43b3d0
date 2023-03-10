package com.ani.thread.itc;

public class ImpData {
    
    private int count = 0;
    private final Object lock = new Object();

    public void increment() {
        synchronized(lock) {
            count++;
        }
    }

    public void decrement() {
        synchronized(lock) {
            count--;
        }
    }

    public void currentCount() {
        System.out.println("Count "+ count);
    }
}
