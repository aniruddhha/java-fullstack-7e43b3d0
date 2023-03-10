package com.ani.cart.user;

import com.ani.cart.input.CartDataInput;

public class UserMenu {
   
    private final CartDataInput ip;
    private final UserController controller;

    public UserMenu() {
        ip = new CartDataInput();
        controller = new UserController();
    }

    private void displayMenu() {
        StringBuilder builder = new StringBuilder();
        builder.append("🔥 User Menu 🔥")
        .append("\n")
        .append("-------------------")
        .append("\n")
        .append("Select Your Choice")
        .append("\n")
        .append("-------------------")
        .append("\n")
        .append("1. New User")
        .append("\n")
        .append("2. List Users")
        .append("\n")
        .append("3. Select User")
        .append("\n")
        .append("4. Exit")
        .append("\n");

        System.out.println(builder.toString());
    }

    public void performAction() {

        while(true) {
            displayMenu();
            int ch = ip.askForUserChoice();

            if(ch >= 4 ) {
                System.out.println("\n 🙏 Thanks for using our services");
                break;
            } else {
                if(ch == 1) {
                    System.out.println("\n 👏 You selected New User \n");
                    try {
                        int id = ip.askForId();
                        String name = ip.askForName();
                        controller.createNewUser(id, name);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                } else if(ch == 2) {
                    System.out.println(" \n 👏 You selected List users \n ");
                    controller.listAllUsers();
                } else  {
                    System.out.println("\n 👏 You selected Select User \n");
                } 
            }
        }
    }
}
