package com.ani.thread.itc;

public class NumConsumer implements Runnable {

    private final ItcHub hub;

    public NumConsumer(ItcHub hub) {
        this.hub = hub;
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            hub.consume();
        }
    }
}
