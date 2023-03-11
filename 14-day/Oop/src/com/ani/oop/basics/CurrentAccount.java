package com.ani.oop.basics;

public class CurrentAccount extends Account {

    public CurrentAccount() {
        super(); 

        super.branch = "abc";
    }

    public void convertToCurrent() {
        super.activateAccount();
    }

    @Override
    public void activateAccount() {
        super.activateAccount();
    }
}
