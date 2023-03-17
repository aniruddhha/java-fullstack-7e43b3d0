package com.ani.anno;

import java.util.List;
import java.util.ArrayList;

public class Tiger extends Animal {

    @Checker
    private int speed;

    @Checker
    private int color;

    @Override
    public void walk() {
    }

    @SuppressWarnings("Dont Show Warning")
    public void run() {
        List lst = new ArrayList();
        lst.add("abc");
    }

    @Deprecated
    public void runFast() {

    }
}
