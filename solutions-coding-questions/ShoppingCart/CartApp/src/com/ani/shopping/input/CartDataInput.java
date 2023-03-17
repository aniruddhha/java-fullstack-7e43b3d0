package com.ani.shopping.input;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.ani.shopping.exception.InvalidInputException;

public class CartDataInput {
    
    private final Scanner scanner;

    public CartDataInput() {
        scanner = new Scanner(System.in);
    }

    private int readNumber() {
        int num = 0;
        try {
            num = scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine(); // reset the scanner, otherwise scanner will misbehave
            throw new InvalidInputException("❌ Please Enter Number Only");
        }
        return num;
    }

    public int askForUserChoice() {
        System.out.print("👉 Enter Your Choice : ");
        return readNumber();
    }

    public int askForId(String msg) {
        System.out.print("👉 " + msg +" : ");
        int id = readNumber();
       
        if(id <= 0) throw new InvalidInputException("❌ Id "+ id +" is invalid. Please provide positive id");
        return id;
    }

    public String askForName(String msg) {
        System.out.print("👉 " + msg +" : ");
        String name = scanner.next();
        if(name.length() > 3) {
            throw new InvalidInputException("❌ Name must be contains atleast 3 characters");
        }
        return name;
    }
}
