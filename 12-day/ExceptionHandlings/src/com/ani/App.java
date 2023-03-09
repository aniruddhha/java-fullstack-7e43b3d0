package com.ani;

import com.ani.custom.InvalidAgeException;
import com.ani.custom.UserInputting;
import com.ani.custom.WrongFileFormatException;

public class App {
    public static void main(String[] args) {
        UserInputting ip = new UserInputting();

        try {
            int age = ip.askForUserAge();
        } catch (InvalidAgeException e) {
        }

        try {
            ip.createUserFromFile("abc.txt");
        } catch (WrongFileFormatException e) {
            e.printStackTrace();
        }
    }
}
