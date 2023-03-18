package com.ani.fi;

public class Eq {

    private String st1;
    private String st2;
    
    public Eq(String st1, String st2) {
        this.st1 = st1;
        this.st2 = st2;
    }

    public String concat() {
        return st1 + " is a " + st2;
    }
}
