package com.algorithms.functionalprogramming.stream_examples.miscellaneous;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * What are the results when the below methods are executed?
 * What are the differences between func, func2 and func3
 */
public class GeneralStreamsQuestions {
    
    static final List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
    
    public static void main(String[] args) {
        
        func();
        func2();
        func3();
    }
    
    /**
     * what is the result the method generates?
     */
    public static void func() {
        List<Integer> numList = numbers.stream()
                .filter(n -> n > 3)
                .map(n -> n * 2)
                .sorted()
                .collect(Collectors.toList());
        
        numList.forEach(System.out::println);
    }
    
    /**
     * what is the result the method generates?
     */
    public static void func2() {
        System.out.println(numbers.stream()
                .sorted()
                .filter(n -> n > 3)
                .collect(Collectors.averagingInt(n -> n)));
    }
    
    /**
     * what is the result the method generates?
     */
    public static void func3() {
        System.out.println(numbers.stream()
                .filter(number -> number > 2)
                .count());
        
    }
    
}
