package com.ani.thread.itc;

public class NumProducer implements Runnable {

    private final ItcHub hub;

    public NumProducer(ItcHub hub) {
        this.hub = hub;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            hub.produce(100 * i);
        }
    }
}
