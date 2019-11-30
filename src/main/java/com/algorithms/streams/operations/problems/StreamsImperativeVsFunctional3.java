package com.algorithms.streams.operations.problems;

import java.util.function.Predicate;

import static utils.Constants.doubleNumbersList;

public class StreamsImperativeVsFunctional3 {
    
    public static void main(String[] args) {
        
        findOddNum();
    }
    
    private final static Predicate<Double> numberDivideByTwoAndNotEqualToZero = number -> number % 2 != 0;
    
    public static void findOddNum() {
        
        // imperative approach:
        for (Double number : doubleNumbersList) {
            if (number % 2 != 0) {
                System.out.println("Odd number imperative approach: " + number);
            }
        }
        // functional approach 1:
        doubleNumbersList.stream()
                .filter(numberDivideByTwoAndNotEqualToZero)
                .forEach(number -> System.out.println("Odd number functional approach 1: " + number));
        
        // functional approach 2:
        doubleNumbersList.stream()
                .filter(numberDivideByTwoAndNotEqualToZero)
                .map(number -> String.format("Odd number functional approach 3: %s", number))
                .forEach(System.out::println);
        
    }
    
}
