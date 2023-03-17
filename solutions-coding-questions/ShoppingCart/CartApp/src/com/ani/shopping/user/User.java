package com.ani.shopping.user;

import com.ani.shopping.cart.Cart;

public class User {
    
    private int id;
    private String name;
    private Cart cart;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Cart getCart() {
        return cart;
    }
    
    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
