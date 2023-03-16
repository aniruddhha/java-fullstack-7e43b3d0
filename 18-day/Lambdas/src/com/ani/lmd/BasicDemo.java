package com.ani.lmd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class BasicDemo {
    
    public void demo1() {

        // Runnable runnable = some object
        Runnable runnable = new Runnable() {
            @Override
            public void run() { }
        };
        // can I assign funtion
    }

    public void demo2() {
        // Runnable runnable = some function
        Runnable runnable1 = () -> { }; // lambda

        Runnable runnable2 = this::someFunction; // method reference
    }

    // public void run() { }
    public void someFunction() {}

    public void demo3() {
        ArrayList<String> names = new ArrayList<>();
        names.add("xyz");
        names.add("abc");
        names.add("pqr");
        names.add("lmn");
        names.add("ret");
        names.add("opt");
        names.add("tiu");

        // too mechanical, with external tool
        for (int i = 0; i < names.size(); i++) { } 
        // less mechanical, but with external tool
        for( String nm : names) { } 
        // iterator come along with collection, not dev friendly
        Iterator<String> it = names.iterator();
        while(it.hasNext()) {
            String nm = it.next();
        }
    }

    public void demo4() {
        ArrayList<String> names = new ArrayList<>();
        names.add("xyz");
        names.add("abc");
        names.add("pqr");
        names.add("lmn");
        names.add("ret");
        names.add("opt");
        names.add("tiu");

        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        });
    }
    public void demo5() {
        ArrayList<String> names = new ArrayList<>();
        names.add("xyz");
        names.add("abc");
        names.add("pqr");
        names.add("lmn");
        names.add("ret");
        names.add("opt");
        names.add("tiu");

        names.forEach(( String t ) ->  System.out.println(t));
        names.forEach(t ->  System.out.println(t));
        names.forEach(this::ajhfgjahsdfg);
        names.forEach(System.out::println);
    }
    public void ajhfgjahsdfg(String t) {
        System.out.println(t);
    }
}
