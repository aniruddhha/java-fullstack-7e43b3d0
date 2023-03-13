package com.ani.cart.input;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.ani.cart.exception.InvalidInputException;

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
            scanner.nextLine();
            throw new InvalidInputException("❌ Please Enter Number Only");
        }
        return num;
    }

    public int askForUserChoice() {
        System.out.print("👉 Enter Your Choice : ");
        return readNumber();
    }

    public int askForId() {
        System.out.print("👉 Enter Id : ");
        int id = readNumber();
       
        if(id <= 0) throw new InvalidInputException("❌ Id "+ id +" is invalid. Please provide positive id");
        return id;
    }

    public String askForName() {
        System.out.print("👉 Enter Name : ");
        String name = scanner.next();
        if(name.length() > 3) {
            throw new InvalidInputException("❌ Name must be contains atleast 3 characters");
        }
        return name;
    }
}
