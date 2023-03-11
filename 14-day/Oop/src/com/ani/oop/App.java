package com.ani.oop;

import com.ani.oop.basics.Account;
import com.ani.oop.basics.Car;

public class App {

    public static void demo1() {
        Car car1 = new Car(100);
        car1.topSpeed();

        Car car2 = new Car(300);
        car2.topSpeed();
    }

    public static void demo2() {
        Account ac1 = new Account(10, "abc", true);
        System.out.println(ac1);
        System.out.println(ac1.getClass());

        Account ac2 = new Account(10, "abc", true);
        System.out.println(ac2);

        boolean eq1 = ac1 == ac2; // references of the object
        System.out.println(eq1 ? "Objects are Equal" : "Objects are Not Equal");

        boolean eq2 = ac1.equals(ac2); // checking content/state of the object
        System.out.println(eq2 ? "Objects are Equal" : "Objects are Not Equal");

        System.out.println(" Ac1 Hashcode : "+ac1.hashCode());
        System.out.println(" Ac2 Hashcode : "+ac2.hashCode());
    }

    public static void main(String[] args) throws Exception {
        System.out.println("🔥 OOP 🔥 ");

        demo2();
    
    }
}
