package com.ani.thread.itc;

public class ItcHub {
    private int number = 0;
    private boolean isNumberReady = false;

    public synchronized void produce(int producedNumber) {

        // do I have already produced, and it is not consumed by cosumer ?
        if(isNumberReady) {
            System.out.println("👉 Waiting Consumer to consume already produced number");
            try {
                wait(); // wait untill consumer consumes the number
            } catch (InterruptedException e) {
                System.out.println("Producer Caught");
            }
        }

        number = producedNumber;
        isNumberReady = true;
        System.out.println("🟢 Producer produced " + number);
        notifyAll(); // notify to all waiting consumers that number is ready 
    }

    public synchronized void consume() {

        // is number not produced and I am trying consume it ?
        if(!isNumberReady) {
            System.out.println("👉 Producer have not produced number yet");
            try {
                wait(); // wait until, producer produces the number
            } catch (Exception e) {
                System.out.println("Consumer Caught");
            }
        }
        isNumberReady = false;
        System.out.println("🟢 Consumer Consumed the number " + number);
        notifyAll(); // notify producers that, number has been consumed.
    }
}
