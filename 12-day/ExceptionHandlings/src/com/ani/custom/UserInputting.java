package com.ani.custom;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputting {

    private final Scanner scanner = new Scanner(System.in);

    public int askForUserAge() throws InvalidAgeException {
        System.out.println("\n 👉 Whats you age : ");
        int age = 0;
        
        try {
           age = scanner.nextInt();
        }catch(InputMismatchException ex) {
            age = 0;
            System.out.println("\n ❌ Please Enter Numbers Only");
        }    

        // age should not be negative 

        if(age < 0) {
            throw new InvalidAgeException(" ❌ "+age +" Must be possitive ");
        }
        if(age > 100) {
            throw new InvalidAgeException(" ❌ "+age +" Must not be greater than 100 ");
        }
        // age should not be more than 100 years

        return age;
    }

    public void createUserFromFile(String name) throws WrongFileFormatException {
        if(name.contains(".xml")) {
            throw new WrongFileFormatException("Unsuported File Format");
        }
        // save user to db
    }
}
