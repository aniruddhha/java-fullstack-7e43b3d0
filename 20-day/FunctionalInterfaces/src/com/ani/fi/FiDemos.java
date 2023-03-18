package com.ani.fi;

public class FiDemos {
    public void demo1() {
        Clickable clk = () -> 10; // ✅ function are assigned to variables
    }

    public Clickable demo2() { // ✅ functions can be returned from another function
        return () -> 10;
    }

    public void demo3(Clickable clk) { 
         demo2().click();
    }

    public void demo4() {
        demo3( () -> 10 ); // ✅ functions can be passed as parameters to another function
    }
}
