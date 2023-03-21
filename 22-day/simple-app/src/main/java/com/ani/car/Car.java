package com.ani.car;

/**
 * This is a car class, which represents car entity.
 */
public class Car {
    private int speed;

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * It increases the speed.
     * @param sp speed by which car should move.
     */
    public void speedUp(int sp) {
        this.speed = sp;
    }
}
