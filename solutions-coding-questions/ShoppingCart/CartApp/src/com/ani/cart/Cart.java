package com.ani.cart;

import com.ani.cart.item.Item;
import com.ani.cart.user.User;

public class Cart { 
    private User user;
    private Item[] items;
    private double totalPrice;

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Item[] getItems() {
        return items;
    }
    public void setItems(Item[] items) {
        this.items = items;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }   
}
