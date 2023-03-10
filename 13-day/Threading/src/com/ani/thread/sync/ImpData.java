package com.ani.thread.sync;

public class ImpData {
    
    private int count = 0;
    private final Object lock = new Object();

    public void increment() {
        synchronized(lock) {
            count++;
        }
    }

    public synchronized void safeInc() {
        count++;
    }

    public void decrement() {
        synchronized(lock) {
            count--;
        }
    }

    public synchronized void safeDec() {
        count--;
    }

    public void currentCount() {
        System.out.println("Count "+ count);
    }
}
