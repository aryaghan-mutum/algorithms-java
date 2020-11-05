package com.functiionalprogramming.streamsexamples.sort;

import java.util.Comparator;
import java.util.List;
import static java.lang.System.out;
import static java.util.Arrays.asList;

/**
 * Question:
 * The below procedure converts a list of cities into uppercase and sorts in ascending order using imperative style of programming
 * Write a procedure that iterates each city in a list and sort it in ascending order using functional programming
 */
public class SortEx1 {
    
    final static List<String> shipsList = asList("Oasis of the Seas", "Allure of the Seas", "Anthem of the Seas", "Navigator of the Seas");

    public static void main(String[] args) {
        testConvertShipsToUppercaseImperativeApproach();
        testConvertShipsToUppercaseFunctionalApproach();
    }

    public static void testConvertShipsToUppercaseImperativeApproach() {
        
        shipsList.sort(Comparator.naturalOrder()); // or can also be used: Collections.sort(shipsList);
        
        for (String ship : shipsList) {
            out.println("Ships in uppercase imperative approach: " + ship.toUpperCase());
        }
    }

    public static void testConvertShipsToUppercaseFunctionalApproach() {
        shipsList.stream()
                .sorted()
                .forEach(ship -> out.println("Cities in uppercase functional approach: " + ship.toUpperCase()));
    }
    
}



