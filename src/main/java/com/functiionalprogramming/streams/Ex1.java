package com.functiionalprogramming.streams;

import java.util.stream.Stream;

import static java.lang.System.out;

import static java.util.Arrays.asList;
import static java.util.Arrays.stream;

public class Ex1 {
    
    public static void main(String[] args) {
        
        //using a for loop
        
        //using list
        asList(1, 2, 3, 4, 5, 6).stream()
                .filter(value -> value >= 4)
                .forEach(value -> System.out.println(value));
        
        out.println("---");
        
        //using Streams using an array
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        stream(numbers)
                .filter(value -> value >= 3)
                .sorted()
                .forEach(value -> out.println(value));
        
        out.println("---");
        
        //using Streams
        Stream.of(331, 2, 13, 4, 15, 6)
                .filter(value -> value >= 4)
                .map(value -> value * value)
                .sorted()
                .forEach(value -> out.println(value));
        
        out.println("---");
    }
}
