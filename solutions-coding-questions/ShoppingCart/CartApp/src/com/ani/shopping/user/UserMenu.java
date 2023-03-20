package com.ani.shopping.user;

import com.ani.shopping.cart.CartController;
import com.ani.shopping.cart.CartMenu;
import com.ani.shopping.input.CartDataInput;
import com.ani.shopping.item.ItemController;

public class UserMenu {
   
    private final CartDataInput ip;
    private final UserController userController;

    private CartMenu cartMenu;
    private CartController cartController;

    public UserMenu(
        CartDataInput ip, 
        UserController userController,
        CartController cartController, 
        ItemController itemController,
        CartMenu cartMenu
    ) {
        this.ip = ip;
        this.userController = userController;
        this.cartController = cartController;
        this.cartMenu = cartMenu;
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
        .append("3. Go To User Cart")
        .append("\n")
        .append("4. Exit")
        .append("\n");

        System.out.println(builder.toString());
    }

    public void performAction() {

        while(true) {
            displayMenu();

            int ch = 0;
            try {
                ch = ip.askForUserChoice();
            } catch (Exception e) {
                System.out.println("\n ❌ Enter Numbers Only \n");
            }

            if(ch >= 4 ) {
                System.out.println("\n 🙏 Thanks for using our services");
                break;
            } else {
                if(ch == 1) {
                    System.out.println("\n 👏 You selected New User \n");
                    try {
                        int id = ip.askForId("Enter User Id");
                        String name = ip.askForName("Enter User Name");
                        userController.createNewUser(id, name);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                if(ch == 2) {
                    System.out.println(" \n 👏 You selected List users \n ");
                    userController.listAllUsers();
                } 
                if(ch == 3) {
                    System.out.println(" \n 👏 Entering to User Cart \n ");
                    
                    int userId = ip.askForId("Enter User Id");
                    cartController.setUserId(userId);
                    cartMenu.performAction();
                }
            }
        }
    }
}
