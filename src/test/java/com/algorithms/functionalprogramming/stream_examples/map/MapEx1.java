package com.algorithms.functionalprogramming.stream_examples.map;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Below is the method that squares(doubles) each number in a list using traditional approach
 * Write a method in functional style to achieve the same result using map() operator
 */
public class MapEx1 {
    
    final ImmutableList<Double> actualNumbersList = ImmutableList.of(0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);
    final ImmutableList<Double> expectedNumbersList = ImmutableList.of(0.0, 1.0, 4.0, 9.0, 16.0, 25.0, 36.0, 49.0, 64.0, 81.0);
    /**
     * Not Advised: Iterative Approach
     */
    @Test
    public void testSquaresImperativeApproach() {
        
        List<Double> squaresList = new ArrayList<>();
        
        for (Double number : actualNumbersList) {
            
            Double square = new Double(number.intValue() * number.intValue());
            
            if (!squaresList.contains(square)) {
                squaresList.add(square);
            }
        }
        System.out.println("Square the numbers in imperative approach: " + squaresList);
        assertEquals(squaresList, expectedNumbersList);
    }
    
    /**
     * Advised: Functional Approach
     */
    @Test
    public void testSquaresFunctionalApproach() {
        List<Double> squaresList = actualNumbersList.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());
    
        System.out.println("Square the numbers in functional approach:");
        squaresList.forEach(num -> System.out.print(" " + num));
    
        assertEquals(squaresList, expectedNumbersList);
    }
    
}
