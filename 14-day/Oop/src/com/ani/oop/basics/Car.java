package com.ani.oop.basics;

public class Car {
    
    private int speed;

    public Car(double milg) {
        this.speed = (int)milg/10;
    }

    public Car(int speed) {

        this(78.90); // call the constructor

        this.speed = speed;
        // class variable = local variable
        //car1.speed = speed
        //car2.speed = speed
    }
}



    public void topSpeed() {
        //car1.speed
        //car2.speed
        System.out.println(this.speed);
        System.out.println(speed);
    }

    public void moreSpeed() {
       topSpeed();
    }
}
