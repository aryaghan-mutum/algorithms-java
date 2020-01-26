package com.algorithms.functionalprogramming.stream_examples.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Question:
 * The below procedure converts a list of cities into uppercase and sorts in ascending order using imperative style of programming
 * Write a procedure that iterates each city in a list and sort it in ascending order using functional programming
 */
public class SortEx1 {
    
    final List<String> shipsList = Arrays.asList("Oasis of the Seas", "Allure of the Seas", "Anthem of the Seas", "Navigator of the Seas");
    
    @Test
    public void testConvertShipsToUppercaseImperativeApproach() {
        
        shipsList.sort(Comparator.naturalOrder()); // or can also be used: Collections.sort(shipsList);
        
        for (String city : shipsList) {
            System.out.println("Ships in uppercase imperative approach: " + city.toUpperCase());
        }
    }
    
    @Test
    public void testConvertCitiesToUppercaseFunctionalApproach() {
        shipsList.stream()
                .sorted()
                .forEach(city -> System.out.println("Cities in uppercase functional approach: " + city.toUpperCase()));
    }
    
}



