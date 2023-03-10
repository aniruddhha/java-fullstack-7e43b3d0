package com.ani.thread.sync;

public class SpellingChecker implements Runnable {

    private final ImpData dt;
    
    public SpellingChecker(ImpData dt) {
        this.dt = dt;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10000; i++ ) {
            dt.increment();
        }
    }
}
