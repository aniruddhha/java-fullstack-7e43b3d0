package com.ani.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {

    public void demo1() {
        String[] arr = {};
    }

    public void demo2() {
        Collection<String> coll = new ArrayList<>();
        coll.add("abc");
        coll.add("pqr");
        coll.add("xyz");
        coll.add("xyz");
        coll.add("xyz");
        coll.add("lmn");
        coll.add(null);
        coll.add("tuv");
        coll.add(null);
        System.out.println(coll);

        // Iterating over the collection using iterator
        Iterator<String> it = coll.iterator();
        while(it.hasNext()) {
            String el = it.next();
            System.out.println(el);
        }

        // Iterating over the collection using enhanced for
        for(String el : coll) {
            System.out.println(el);
        }

        // unfortunately we dont have a method to get element at ith location

        // remove perticular element
        coll.remove("xyz");

        for(String el : coll) {
            System.out.println(el);
        }

        String xyzSts =  coll.contains("xyz") ? "It contains xyz" : "It does not contains xyz";
        System.out.println(xyzSts);

        Collection<String> subColl = new ArrayList<>();
        subColl.add("xyz");
        subColl.add("790");

        coll.addAll(subColl);
        coll.removeAll(subColl);
        coll.containsAll(subColl);
        coll.retainAll(subColl);

        
    }
}
