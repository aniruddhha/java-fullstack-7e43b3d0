package com.ani.lmd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

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

        Consumer<String> cns = ( String t ) ->  System.out.println(t);
        names.forEach(cns); 
        names.forEach(( String t ) ->  System.out.println(t));
        names.forEach(t ->  System.out.println(t));
        names.forEach(this::ajhfgjahsdfg);
        names.forEach(System.out::println);
    }

    public void ajhfgjahsdfg(String t) {
        System.out.println(t);
    }

    public void demo6() {
       
        Addable ad1 = (int a, int b) -> {
            System.out.println("A "+a +" B "+ b);
            return a + b;
        };

        System.out.println(ad1.add(10, 12));

        Addable ad2 = new Addable() {
            public int add(int num1, int num2) {
                return num1 + num2;
            };
        };
        System.out.println(ad2.add(10, 12));
    }

    public void demo7() {
        Map<Integer, String> mp = new HashMap<>();
        mp.put(2, "pwq");
        mp.put(1, "Abc");
        mp.put(3, "btrt");
        mp.put(9, "bopl");

        Set<Map.Entry<Integer, String>> entries = mp.entrySet();
        for (Map.Entry<Integer, String> ent : entries) {
            System.out.println("Key "+ent.getKey() + " Val " + ent.getValue());
        }

        mp.forEach(new BiConsumer<Integer,String>() {
            int i = 10;
            @Override
            public void accept(Integer key, String value) {
                i = 10;
                System.out.println("Key "+ key + " Val " + value);                
            }
        });

        final int i = 10;
        mp.forEach(( k, v ) ->  {
             System.out.println("Key "+ k + " Val " + v) ;
            // i = 20;
        });
    }

    public void demo8() {

        Integer[] arr = {1, 90, 51, 0 ,23, 45, 21, 10};

        List<Integer> numbers = new ArrayList<>(); // constant
        numbers.addAll(Arrays.asList(arr)); // n + n = 2n = n 
        
        // Arrays.stream(arr).toList();

        System.out.println(numbers);

        boolean sts1 = numbers.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer t) {
                return t > 40;
            }
        });
        System.out.println("Is Removed "+ sts1);

        myDt(45, new Predicate<Integer>() {
            @Override
            public boolean test(Integer t) {
                return t > 40;
            }
        }); 

        System.out.println(numbers);
    }

    public boolean myDt(int t, Predicate<Integer> pd) {
        return pd.test(t);
    }

    public void demo9() {
        Integer[] arr = {1, 90, 51, 0 ,23, 45, 21, 10};

        List<Integer> numbers = new ArrayList<>(); // constant
        numbers.addAll(Arrays.asList(arr)); // n + n = 2n = n 
        System.out.println(numbers);

        boolean sts = numbers.removeIf( n -> n > 40);
        ajhfgjahsdfg("abc");

        myDt(10, t -> t > 40);
        
        System.out.println("Is Removed "+ sts);
        System.out.println(numbers);   

        numbers.replaceAll(null);
    }

    public void demo10() {
        Integer[] arr1 = {1, 90, 51, 0 ,23, 45, 21, 10};
        ArrayList<Integer> set1 = new ArrayList<>(Arrays.asList(arr1));

    }
}
