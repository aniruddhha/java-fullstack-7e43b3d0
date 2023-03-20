package com.ani.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemos {

    private String[] arr = { "abc", "xyz", "pqb", "wet", "qza", "opm", "nert", "bbc" };

    private List<String> names = new ArrayList<>(Arrays.asList(arr));

    public void demo1() {
        
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
        List<String> processed =  names.stream()
            .filter(el -> el.contains("a") || el.contains("b")) // processing
            .collect(Collectors.toList()); // collected the output

        System.out.println(names);
        System.out.println(processed);
    }
}
