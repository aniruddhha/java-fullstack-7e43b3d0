package com.ani.thread.itc;

public class ItcHub {
    private int number = 0;
    private boolean isReady;

    public synchronized void produce(int producedNumber) {
        while(isReady) {
            try {
                wait(); // wait untill consumer consumes the number
            } catch (InterruptedException e) {
              
            }
        }

        number = producedNumber;
        isReady = true;
        System.out.println("🟢 Producer produced " + number);
        notifyAll(); // notify to all waiting consumers that number is ready 
    }

    public synchronized void consume() {
        while(!isReady) {
            try {
                wait(); // producer produces the number
            } catch (Exception e) {
            }
        }
        int num = number;
        isReady = false;
        System.out.println("🟢 Consumer Consumed the number " + num);
        notifyAll(); // notify producers that, number has been consumed.
    }
}
