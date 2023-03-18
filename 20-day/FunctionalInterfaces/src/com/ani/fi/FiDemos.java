package com.ani.fi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FiDemos {
    public void demo1() {
        Clickable clk = () -> 10; // ✅ function are assigned to variables
        clk.click();
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

    public void demo5() {

        Function<Integer, String> fnImp = new DayFunction();

        Function<Integer, String> fnAno = new Function<Integer,String>() {
            @Override
            public String apply(Integer day) {
                if(day == 1) return "MON";
                if(day == 2) return "TUE";
                if(day == 3) return "WED";
                if(day == 4) return "THU";
                if(day == 5) return "FRI";
                if(day == 6) return "SAT";
                if(day == 7) return "SUN";
                return "Invalid Day";
            }
        };

        // after java 8
        Function<Integer, String> fn1 = (day) -> {
            if(day == 1) return "MON";
            if(day == 2) return "TUE";
            if(day == 3) return "WED";
            if(day == 4) return "THU";
            if(day == 5) return "FRI";
            if(day == 6) return "SAT";
            if(day == 7) return "SUN";
            return "Invalid Day";
        };
        
        Scanner sc = new Scanner(System.in);
        System.out.print("👉 Enter Day : ");
        int dy = sc.nextInt();
        System.out.println("Day  " + dy +" : " + fn1.apply(dy));

        System.out.println("Day 5 " + fn1.apply(5));
        System.out.println("Day 500 " + fn1.apply(500));
        // System.out.println("Day 500 " + fn1.apply(89.90));

        Function<Boolean, String> fn2 = (Boolean jvhjvhfhgj) -> jvhjvhfhgj ? "ABC" : "abc";
        System.out.println("Fn2 " + fn2.apply(true));
        System.out.println("Fn2 " + fn2.apply(false));
    }

    public void demo6(int kjhkjhgjkgjkh) { }

    public void demo7() {
        Supplier<LocalDate> sup1 = new Supplier<LocalDate>() {
            @Override
            public LocalDate get() {
                return LocalDate.now();
            }
        };
        sup1.get();

        // returns one value, but accepts nothing
        Supplier<LocalDate> sup2 = () -> LocalDate.now();
        sup2.get();
    

        Consumer<String> con1 = new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        };

        // accepts one value but returns nothing.
        Consumer<String> con2 = ( str) -> System.out.println(str);

        List<String> arr = new ArrayList<>();
        arr.forEach(str -> System.out.println(str));
        arr.forEach(con1);
    }

    public void demo8() {
        List<String> arr = new ArrayList<>();

        arr.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String t) {
                return t.length() > 5;
            }
        });

        arr.removeIf( t -> t.length() > 5);
    }

    public void demo9() {
        UnaryOperator<Car> un1 = new UnaryOperator<Car>() {
            @Override
            public Car apply(Car t) {
                Car crImv = new Car(
                    t.getId(), 
                    t.getName().toUpperCase()
                );
                
                return crImv;
            }
        };

        Car c = new Car(10, "abc");
        System.out.println(c);

        System.out.println(un1.apply(c));

        UnaryOperator<Car> un2 = t -> new Car(
            t.getId(), 
            t.getName().toUpperCase()
        );
        System.out.println(un2.apply(c));


        Integer[] arr = { 4, 6, 7, 1, 2, 3, 9 };
        List<Integer> lst = new ArrayList<>(Arrays.asList(arr));

        UnaryOperator<Integer> sqOp = n -> n * n;

        System.out.println(lst);
        lst.replaceAll(sqOp);
        System.out.println(lst);
    }

    public void demo10() {

        Function<Integer, String> fn = new Function<Integer,String>() {
            @Override
            public String apply(Integer t) {
                return "Square is " + (t*t);
            }
        };
        Function<Integer, String> fn1 = num -> " Square is " + (num*num);
        System.out.println(fn1.apply(10));

        BiFunction<Integer, Integer, String> biFn= new BiFunction<Integer, Integer, String>() {
            @Override
            public String apply(Integer t, Integer u) {
                return "Addition is "+ (t + u);
            }
        };
        System.out.println(biFn.apply(10, 12)); 

        BiFunction<Integer, Integer, String> biFn1 = (num1, num2) -> "Addition is "+(num1+num2);
        System.out.println(biFn1.apply(10, 12)); 

        BiFunction<String, String, String> concat = (s1, s2) -> s1 + " is an " + s2;

        String str = concat.apply("android", "os");
        System.out.println("Concated String "+ str);
    }

    public void demo11() {

        BiConsumer<String, Integer> biCon1 = new BiConsumer<String,Integer>() {
            @Override
            public void accept(String t, Integer u) {
                System.out.println(t.repeat(u));
            }
        };
        biCon1.accept("*", 10);
        
        BiConsumer<String, Integer> biCon2 = (String str, Integer num) -> System.out.println(str.repeat(num));
        biCon2.accept("*", 20);
        
    }
}
