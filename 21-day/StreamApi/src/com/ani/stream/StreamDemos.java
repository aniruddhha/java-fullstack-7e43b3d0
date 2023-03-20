package com.ani.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemos {

    public void demo1() {
        
        String[] arr = { "abc", "xyz", "pqb", "wet", "qza", "opm", "nert", "bbc" };
        List<String> names = new ArrayList<>(Arrays.asList(arr));

        List<String> processed = new ArrayList<>(); // collected output here

        for (String nm : names) {
            if(nm.contains("a") || nm.contains("b")) { // processing
                processed.add(nm);
            }
        }

        System.out.println(names);
        System.out.println(processed);
    }

    public void demo2() {
            
        String[] arr = { "abc", "xyz", "pqb", "wet", "qza", "opm", "nert", "bbc" };
        List<String> names = new ArrayList<>(Arrays.asList(arr));

        List<String> processed =  names.stream() //names.parallelStream() // 1. create the stream
            //2. Perform an Intermidiate operation i.e filter
            .filter(el -> el.contains("a") || el.contains("b")) // processing
            // 3. Collect using terminal operation
            .collect(Collectors.toList()); // collected the output

        System.out.println(names);
        System.out.println(processed);
    }

    public void demo3() {
        String[] arr = { "abc", "xyz", "pqb", "wet", "qza", "opm", "nert", "bbc" };
        List<String> names = new ArrayList<>(Arrays.asList(arr));

        List<String> processed = new ArrayList<>();
        for ( String nm : names ) {
            processed.add(nm.toUpperCase());
        }   

        System.out.println(names);
        System.out.println(processed);
    }

    public void demo4() {
        String[] arr = { "abc", "xyz", "pqb", "wet", "qza", "opm", "nert", "bbc" };
        List<String> names = new ArrayList<>(Arrays.asList(arr));

        List<String> processed = names.stream()
                                        .map( el -> el.toUpperCase() )
                                        .collect(Collectors.toList());
        System.out.println(names);
        System.out.println(processed);
    }

    public void demo5() {

        // first filter and then upper case.

        String[] arr = { "abc", "xyz", "pqb", "wet", "qza", "opm", "nert", "bbc" };
        List<String> names = new ArrayList<>(Arrays.asList(arr));

        List<String> processed1 = new ArrayList<>(); // collected output here

        for (String nm : names) {
            if(nm.contains("a") || nm.contains("b")) { // processing
                processed1.add(nm);
            }
        }

        List<String> processed2 = new ArrayList<>();

        for (String nm : processed1) {
            processed2.add(nm.toUpperCase());
        }

        System.out.println(names);
        System.out.println(processed1);
        System.out.println(processed2);
    }   

    public void demo6() {
         // first filter and then upper case.

         String[] arr = { "abc", "xyz", "pqb", "wet", "qza", "opm", "nert", "bbc" };
         List<String> names = new ArrayList<>(Arrays.asList(arr));

         Stream<String> stream1 = names.stream();
         Stream<String> stream2 = stream1.filter( el -> el.contains("a") || el.contains("b"));
         Stream<String> stream3 =  stream2.map(el -> el.toUpperCase());
         List<String> processed = stream3.collect(Collectors.toList());


        List<String> processed1 = names.stream()
                .filter(el -> el.contains("a") || el.contains("b"))
                .map(el -> el.toUpperCase())
                .collect(Collectors.toList());
    }

    public void demo7() {
        int[] arr = { 1, 2, 3, 4, 5 }; // sum -> 15
        
        int sum = Arrays.stream(arr).reduce(0, (a, b) -> {
            System.out.println("a = "+ a + " b = " +b);
            return a + b;
        });

        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
    }
}
