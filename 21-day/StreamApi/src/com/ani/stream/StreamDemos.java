package com.ani.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
}
