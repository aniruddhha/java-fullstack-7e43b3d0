package com.ani.cart;

import com.ani.cart.user.User;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int a = 10;
        int b = 20;
        int c = 30;

        int[] intArr = new int[3];
        intArr[0] = a;
        intArr[1] = b;
        intArr[2] = c;

        User us1 = new User(1, "abc");
        User us2 = new User(2, "pqr");
        User us3 = new User(3, "xyz");

        User[] usrArr = new User[3];
        usrArr[0] = us1;
        usrArr[1] = us2;
        usrArr[3] = us3;

    }
}
