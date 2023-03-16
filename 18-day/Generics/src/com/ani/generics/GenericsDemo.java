package com.ani.generics;

import java.util.Date;

public class GenericsDemo {
    
    public void demo1() {
        Box bx = new Box();
        // bx.setAnything(new String());
        bx.setAnything(new Date());
        // bx.setAnything(new StringBuffer());

        String ob = (String)bx.getAnything();
    }

    public void demo2() {
        DynamicBox<String> db = new DynamicBox<String>();
        db.setAnything("abc");

        String nm = db.getAnything();
    }
}
