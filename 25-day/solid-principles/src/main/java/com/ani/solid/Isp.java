package com.ani.solid;

public class Isp { }

// Bad Design
interface Doable {

    int connect();

    int disconnect();

    void move();

    double[] locate();

    void turnOnFlash();

    void turnOffFlash();
}

// just want to connect or discoonect
class Device implements Doable {

    @Override
    public int connect() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'connect'");
    }

    @Override
    public int disconnect() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'disconnect'");
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'move'");
    }

    @Override
    public double[] locate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'locate'");
    }

    @Override
    public void turnOnFlash() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'turnOnFlash'");
    }

    @Override
    public void turnOffFlash() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'turnOffFlash'");
    }

}

interface Connectable { 
    int connect();
    int disconnect();
}

interface Movable {
    void move();
}

interface Locatable {
    double[] locate();
}

interface Flashable {
    void turnOnFlash();
    void turnOffFlash();
}