package com.ani.custom;

import java.util.Scanner;

public class UserInputting {

    private final Scanner scanner = new Scanner(System.in);

    public void askForUserAge() {
        System.out.println("\n 👉 Whats you age : ");    
        int age = scanner.nextInt();
        // age should not be negative 
        // age should not be more 100 years
    }
}
