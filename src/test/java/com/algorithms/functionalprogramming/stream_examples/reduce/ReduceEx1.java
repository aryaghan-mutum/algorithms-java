package com.algorithms.functionalprogramming.stream_examples.reduce;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Question:
 * Write a procedure which sums the numbers in a list using reduce operator in
 * imperative and functional approaches
 */

public class ReduceEx1 {
    
    final ImmutableList<Double> doubleNumbersList = ImmutableList.of(0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);
    
    @Test
    public void testGetSumImperativeApproach() {
        
        double sum = 0;
        for (int i = 0; i < doubleNumbersList.size(); i++) {
            
            if (!doubleNumbersList.isEmpty()) {
                sum = sum + doubleNumbersList.get(i);
            }
        }
        System.out.println("Sum in Imperative approach: " + sum);
        
        assertEquals(sum, 45.0);
    }
    
    @Test
    public void testSumFunctionalApproach1() {
        double sum = doubleNumbersList.stream().reduce(0.0, (total, n) -> Double.sum(total, n));
        System.out.println("Sum in Functional approach 1: " + sum);
        assertEquals(sum, 45.0);
    }
    
    @Test
    public void testSumFunctionalApproach2() {
        double sum = doubleNumbersList.stream().reduce(0.0, Double::sum);
        System.out.println("Sum in Functional approach 2: " + sum);
        assertEquals(sum, 45.0);
    }
    
    @Test
    public void testSumFunctionalApproach3() {
        double sum = doubleNumbersList.stream().reduce((a, b) -> a + b).get();
        System.out.println("Sum in Functional approach 3: " + sum);
        assertEquals(sum, 45.0);
    }
    
    @Test
    public void testSumFunctionalApproach4() {
        double sum = doubleNumbersList.stream().mapToDouble(n -> n).sum();
        System.out.println("Sum in Functional approach 4: " + sum);
        assertEquals(sum, 45.0);
    }
    
    @Test
    public void testSumFunctionalApproach5() {
        double sum = Stream.of(0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0).reduce(0.0, (e1, e2) -> e1 + e2);
        System.out.println("Sum in Functional approach 5: " + sum);
        assertEquals(sum, 45.0);
    }
    
}



