package com.algorithms.functionalprogramming.stream_examples.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * reduce() :
 * It takes two arguments and returns a scalar (single value). Therefore is a terminal operator.
 */
public class AnswerStreamsReduce {
    
    public static final List<Double> doubleNumbersList = Arrays.asList(0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);
    
    public static void main(String[] args) {
        getSumFunctionalApproach1();
        getSumFunctionalApproach2();
        getSumFunctionalApproach3();
        getSumFunctionalApproach4();
        getSumFunctionalApproach5();
    }
    
    public static void getSumFunctionalApproach1() {
        System.out.println("Sum in Functional approach 1: " + doubleNumbersList.stream()
                .reduce(0.0, (total, n) -> Double.sum(total, n)));
    }
    
    public static void getSumFunctionalApproach2() {
        System.out.println("Sum in Functional approach 2: " + doubleNumbersList.stream()
                .reduce(0.0, Double::sum));
    }
    
    public static void getSumFunctionalApproach3() {
        System.out.println("Sum in Functional approach 3: " + doubleNumbersList.stream()
                .reduce((a, b) -> a + b));
    }
    
    public static void getSumFunctionalApproach4() {
        System.out.println("Sum in Functional approach 4: " + doubleNumbersList.stream()
                .mapToDouble(n -> n)
                .sum());
    }
    
    public static void getSumFunctionalApproach5() {
        int sum = Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
                .reduce(0, (e1, e2) -> e1 + e2);
        
        System.out.println(sum);
    }
    
    
}
