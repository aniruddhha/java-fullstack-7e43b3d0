package com.ani.thread.basics;

public class ThreadOne extends Thread {
    @Override
    public void run() {
        super.run();

        // this code will be executed by thread

        helper();
    }

    private void helper() {

    }
}


