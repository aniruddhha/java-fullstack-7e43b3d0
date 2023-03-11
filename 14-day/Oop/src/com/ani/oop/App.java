package com.ani.oop;

import com.ani.oop.basics.Car;

public class App {

    public static void demo1() {
        Car car1 = new Car(100);
        car1.topSpeed();

        Car car2 = new Car(300);
        car2.topSpeed();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("🔥 OOP 🔥 ");

        demo1();
    
    }
}
