package com.algorithms.streams.operations.operators;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPeek {
    
    static List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5);
    
    public static void main(String[] args) {
        
        numbersList
                .stream()
                .peek(x -> System.out.println("from stream: " + x))
                .map(x -> x + 3)
                .peek(x -> System.out.println("after map: " + x))
                .filter(x -> x % 2 == 0)
                .peek(x -> System.out.println("after filter: " + x))
                .limit(3)
                .peek(x -> System.out.println("after limit: " + x))
                .collect(Collectors.toList());
    }
    
}
