package com.ani.shopping.cart;

import com.ani.shopping.input.CartDataInput;

public class CartMenu {
    
    private final CartDataInput ip;
    private final CartController controller;

    public CartMenu() {
        ip = new CartDataInput();
        controller = new CartController();
    }

    private void displayMenu() {
        StringBuilder builder = new StringBuilder();
        builder.append("🔥 Cart Menu 🔥")
        .append("\n")
        .append("-------------------")
        .append("\n")
        .append("Select Your Choice")
        .append("\n")
        .append("-------------------")
        .append("\n")
        .append("1. Add To Cart ")
        .append("\n")
        .append("2. Show Cart")
        .append("\n")
        .append("3. Remove From Item")
        .append("\n")
        .append("4. Cart Total")
        .append("\n")
        .append("5. Exit")
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

            if(ch >= 5 ) {
                System.out.println("\n 🙏 Thanks for using our services");
                break;
            }
            else {
                if(ch == 1) { 
                    System.out.println("\n 👏 Adding Item To Cart \n");
                    int itemId = ip.askForId("Enter Item Id1");
                    controller.addItemToCart(itemId);
                }
                if(ch == 2) { 
                    System.out.println("\n 👏 Displaying The Cart \n");
                    System.out.println(controller.cartItems(1));
                }
                if(ch == 3) {  }
                if(ch == 4) {  }
            }
        }
    }
    
}
