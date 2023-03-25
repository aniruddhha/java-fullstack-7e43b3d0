package com.ani.solid;

public class Srp {
    
}
// Bad Example
class Customer {
    public void createNewAccount() {
        throw new UnsupportedOperationException();
    }

    public void sendEmail() {
        throw new UnsupportedOperationException();
    }
}

// Good Example
class CustomerAccount {
    public void createNewAccount() {
        throw new UnsupportedOperationException();
    }
}

// Good Example
class CustomerEmail {
    public void sendEmail() {
        throw new UnsupportedOperationException();
    }
}
