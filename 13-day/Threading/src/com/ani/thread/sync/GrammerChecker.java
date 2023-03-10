package com.ani.thread.sync;

public class GrammerChecker implements Runnable {

    private final ImpData dt;
    
    public GrammerChecker(ImpData dt) {
        this.dt = dt;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10000; i++ ) {
            dt.decrement();
        }
    }
}
