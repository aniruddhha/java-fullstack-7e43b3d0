package com.ani.solid;

public class Ocp { }

// Bad example - this class is not closed for modification
class Product {
    public void applyDiscount(double amt, String item) {
        throw new UnsupportedOperationException();
    }
}

// Good example - using an interface to make the class open for extension
interface Discountable {
    public void applyDiscount(double amt);
}

class DiscountedProduct implements Discountable {
    @Override
    public void applyDiscount(double amt) {
        throw new UnsupportedOperationException();
    }
}


