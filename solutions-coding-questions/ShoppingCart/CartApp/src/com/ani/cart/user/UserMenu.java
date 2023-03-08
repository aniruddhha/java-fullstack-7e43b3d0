package com.ani.cart.user;

import java.util.Scanner;

public class UserMenu {
    private Scanner scanner;

    public UserMenu() {
        scanner = new Scanner(System.in);
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
        .append("\n")
        .append("\n")
        .append("👉 Enter your Choice : ");

        System.out.println(builder.toString());
    }

    public void performAction() {

        while(true) {
            displayMenu();
            int ch = scanner.nextInt();

            if(ch >= 4 ) {
                System.out.println("\n 🙏 Thanks for using our services");
                break;
            } else {
                if(ch == 1) {
                    System.out.println("\n 👏 You selected New User \n");

                    System.out.println("\n 👉 Enter User Id: ");
                    int id = scanner.nextInt();

                    System.out.println("\n 👉 Enter User Name: ");
                    String name = scanner.next();

                    int sts = UsersDb.addNewUser(id, name);

                    if(sts == UsersDb.NO_MORE_SPACE) {
                        System.out.println("\n ❌ There is no more space ");
                    }
                    else if( sts == UsersDb.USER_ALREADY_EXISTS) {
                        System.out.println("\n ❌ User Already Exists ");
                    } else {
                        System.out.println("\n ✅ User Successfully Created ");
                    }

                } else if(ch == 2) {
                    System.out.println(" \n 👏 You selected List users \n ");

                    User[] users = UsersDb.listUsers();
                    for( User user : users) {
                        System.out.println("\n 👉 Id " + user.getId() +" Name "+user.getName());
                    }

                } else  {
                    System.out.println("\n 👏 You selected Select User \n");
                } 
            }
        }
    }
}
