package com.ani.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.sound.midi.Soundbank;

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

    public void demo8() {
        IntStream stream = IntStream.of(1, 2, 3, 4, 5);
        stream.forEach(n -> System.out.println(n));

        List<Integer> list = new ArrayList<>(Arrays.asList( 1, 2, 3, 4, 5  ));
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void demo9() {
        Map<Integer, String> mp = new HashMap<>();
        mp.put(1, "acx");
        mp.put(2, "tuv");
        mp.put(3, "xyz");
        mp.put(4, "oop");
        mp.put(5, "btu");
    }

    public void demo10() {
        Integer[][] arr = {
            { 1, 2 , 3 }, // 0 th
            { 4, 5, 6 }, // 1 st
            { 7, 8 , 9} // 2 nd 
        };

        int sum = 0;
        for ( int i = 0; i < arr.length; i++ ) {
            for (int j = 0; j < arr[i].length; j++ ) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }

    public void demo11() {
        Integer[][] arr = {
            { 1, 2 , 3 }, // 0 th
            { 4, 5, 6 }, // 1 st
            { 7, 8 , 9} // 2 nd 
        };

        Arrays.stream(arr).map(ar -> ar).forEach( el -> System.out.println(el));;
        Optional<Integer> opInt =  Arrays.stream(arr)
                                        .map(ar -> Arrays.stream(ar).reduce(0, (a, b) -> a + b ))
                                        .findFirst();
        System.out.println(opInt.get());

        Arrays.stream(arr)
                .map(ar -> Arrays.stream(ar).reduce(0, (a, b) -> a + b ))
                .forEach( el -> System.out.println(el));

      
        int sum = Arrays.stream(arr)
                .map(ar -> Arrays.stream(ar).reduce(0, (a, b) -> a + b ))
                .reduce(0, (a, b) -> a + b);
        System.out.println(" Final Answer " +sum);
    }

    public void demo12() {
        Integer[][] arr = {
            { 1, 2 , 3 }, // 0 th
            { 4, 5, 6 }, // 1 st
            { 7, 8 , 9} // 2 nd 
        };

        Arrays.stream(arr)
            .map( (Integer[] ar) -> ar) // here map is returing an array
            .forEach( el -> System.out.println(Arrays.toString(el)));

        int sum = Arrays.stream(arr)
                        .flatMap((Integer[] ar) -> Stream.of(ar))
                        .reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }

    public void demo13() {
        int[][] arr = {
            { 1, 2 , 3 }, // 0 th
            { 4, 5, 6 }, // 1 st
            { 7, 8 , 9} // 2 nd 
        };

        int sum = Arrays.stream(arr)
                .flatMapToInt(ar -> Arrays.stream(ar))
                .sum();

        IntStream is = IntStream.of(1, 2, 3);
        System.out.println(is.sum());
        
        IntStream is1 = Arrays.stream(arr[0]);
        IntStream is2 = Arrays.stream(arr[1]);
        IntStream is3 = Arrays.stream(arr[2]);

        System.out.println(is1.sum() + is2.sum() + is3.sum());

        int[] a = Arrays.stream(arr)
        .flatMapToInt(ar -> Arrays.stream(ar))
       .toArray();

       System.out.println(Arrays.toString(a));
            
    }
}
