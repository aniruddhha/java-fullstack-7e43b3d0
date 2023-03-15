package com.ani.file.ops;

import java.io.Serializable;

public class Car implements Serializable { //⛳️
    
    private int speed;
    private String make;
    private boolean isAuto;
    private transient String model = "ppp";

    public Car(int speed, String make, boolean isAuto) {
        this.speed = speed;
        this.make = make;
        this.isAuto = isAuto;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public boolean isAuto() {
        return isAuto;
    }
    public void setAuto(boolean isAuto) {
        this.isAuto = isAuto;
    }

    @Override
    public String toString() {
        return "Car [speed=" + speed + ", make=" + make + ", isAuto=" + isAuto + ", model=" + model + "]";
    }
}
