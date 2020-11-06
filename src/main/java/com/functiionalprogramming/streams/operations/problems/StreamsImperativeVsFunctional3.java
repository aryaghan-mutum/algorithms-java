package com.functiionalprogramming.streams.operations.problems;

import java.util.function.Predicate;
import static java.lang.System.out;
import static com.utils.Constants.doubleNumbersList;

public class StreamsImperativeVsFunctional3 {
    
    public static void main(String[] args) {
        findOddNum();
    }
    
    private final static Predicate<Double> numberDivideByTwoAndNotEqualToZero = number -> number % 2 != 0;
    
    public static void findOddNum() {
        
        // imperative approach:
        for (Double number : doubleNumbersList) {
            if (number % 2 != 0) {
                out.println("Odd number imperative approach: " + number);
            }
        }
        // functional approach 1:
        doubleNumbersList.stream()
                .filter(numberDivideByTwoAndNotEqualToZero)
                .forEach(number -> out.println("Odd number functional approach 1: " + number));
        
        // functional approach 2:
        doubleNumbersList.stream()
                .filter(numberDivideByTwoAndNotEqualToZero)
                .map(number -> String.format("Odd number functional approach 3: %s", number))
                .forEach(out::println);
    }
    
}
