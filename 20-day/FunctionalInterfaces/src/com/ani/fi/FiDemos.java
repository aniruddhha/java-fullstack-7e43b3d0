package com.ani.fi;

import java.util.Scanner;
import java.util.function.Function;

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
}
