package com.ani.collection;

import java.util.Vector;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

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

    public void demo3() {
        // List<Integer> numbers = new ArrayList<>();
        // ArrayList<Integer> numbers = new ArrayList<>();
        // LinkedList<Integer> numbers = new LinkedList<>();
        Vector<Integer> numbers = new Vector<>();

        System.out.println("✅ Add");
        numbers.add(124);
        numbers.add(34);
        numbers.add(124);
        numbers.add(null);
        System.out.println(numbers);

        System.out.println("✅ Add At Index");
        numbers.add(3, 6666);
        System.out.println(numbers);

        System.out.println("✅ List Iterator");
        ListIterator<Integer> it = numbers.listIterator();
        while(it.hasNext()) {
            Integer el = it.next();
            Integer ind = it.nextIndex();
            System.out.println("👉 Ind "+ ind +" El "+ el);
        }

        System.out.println("✅ ith element");
        Integer el = numbers.get(2);
        System.out.println("👉 Element at 2nd Index "+ el);
        System.out.println(numbers);

        System.out.println("✅ Remove");
        boolean isOk = numbers.remove(Integer.valueOf(124));
        System.out.println(numbers);

        System.out.println("✅ Remove At Index");
        numbers.remove(2);
        System.out.println(numbers);

        System.out.println("✅ Set Element At Index");
        numbers.set(2, 678);
        System.out.println(numbers);

        Collection<Integer> subNums = new ArrayList<>();
        subNums.add(1);
        subNums.add(2);
        numbers.addAll(0, subNums);

        // System.out.println("✅ ArrayList ensureCapacity");
        // numbers.ensureCapacity(100);

        System.out.println(numbers);
    }

    public void demo4() {
        LinkedList<String> names = new LinkedList<>();

        System.out.println("✅ Deque Specific Add");
        names.add("fty");
        names.add("lmn");
        names.add("crt");
        names.addFirst("abc");
        names.addLast("pqr");
        System.out.println(names);

        System.out.println("✅ Stack Specific Add");
        names.push("stk1");
        names.push("stk2");
        names.push("stk3");
        System.out.println(names);

        System.out.println("✅ Deque Specific Remove");
        names.removeFirst();
        System.out.println(names);

        System.out.println("✅ Stack Specific Remove");
        names.pop();
        System.out.println(names);

        System.out.println("✅ Deque Specific Access");
        String el1 = names.getFirst();
        System.out.println(el1);

        System.out.println("✅ Stack Specific Access");
        String el2 = names.peek();
        System.out.println(el2);
    }

    public void demo5() {
        // Set<String> names = new HashSet<>();
        // HashSet<String> names = new HashSet<>();
        LinkedHashSet<String> names = new LinkedHashSet<>();

        System.out.println("✅ Add");
        names.add("xyz");
        names.add(null);
        names.add("abc");
        names.add("pqr");
        names.add("lmn");
        names.add("pqr");
        names.add(null);
       
        System.out.println(names);

        System.out.println("✅ Remove");
        names.remove("pqr");
        System.out.println(names);

        System.out.println("✅ Get");
        System.out.println("❌ we dont have this operation");

        System.out.println("✅ Iterate");
        Iterator<String> it = names.iterator();
        while(it.hasNext()) {
            String el = it.next();
            System.out.println(el);
        }

        System.out.println("✅ Update");
        System.out.println("❌ we dont have this operation");
    }

    public void demo6() {
        SortedSet<String> names = new TreeSet<>();

        System.out.println("✅ Add");
        names.add("xyz");
        names.add("abc");
        names.add("lmn");
        names.add("jkl");
        // names.add(null); // you will get null pointer exception
        names.add("123");
        names.add("abc");
        System.out.println(names);

        System.out.println("✅ Access Specific to SortedSet");
        String fst = names.first();
        System.out.println("First " + fst);
        String lst = names.last();
        System.out.println("Last "+ lst);

        System.out.println("✅ Sub set"); 
        SortedSet<String> sub1 = names.headSet("jkl");
        System.out.println(sub1);

        SortedSet<String> sub2 = names.subSet("abc", "lmn");
        System.out.println(sub2);
    }

    public void demo7() {
        TreeSet<Integer> names = new TreeSet<>();

        System.out.println("✅ Add");
        names.add(999);
        names.add(798);
        names.add(342);
        names.add(907);
        // names.add(null);
        names.add(325);
        names.add(219);
        names.add(89);
        names.add(798);
        names.add(291);
        System.out.println(names);

        System.out.println("✅ Access");
        int nm1 = names.last();
        System.out.println("Last "+ nm1);
        int nm2 = names.first();
        System.out.println("First "+ nm2);
        int nm4 = names.lower(657);
        System.out.println("Lower " + nm4);
        int nm5 = names.higher(657);
        System.out.println("Higher " + nm5);

        System.out.println("✅ Poll");
        int nm3 = names.pollFirst();
        System.out.println("Removed " + nm3);
        System.out.println(names);

        System.out.println("✅ Descending");
        NavigableSet<Integer> reversed = names.descendingSet();
        System.out.println(reversed);
    }

}
