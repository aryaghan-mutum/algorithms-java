package com.algorithms.functionalprogramming.stream_examples.foreach;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

import static com.utils.Constants.citiesList;


/**
 * @author Anurag Muthyam
 */

/*
 * This class introduces sorted() & forEach() operations.
 * sorted() -> Intermediate operator
 * limit() -> Intermediate operator
 * forEach() -> Terminal operator
 */

public class ForEachEx2 {
    
    ImmutableList<String> shipsList = ImmutableList.<String>builder()
            .add("Oasis of the Seas", "Allure of the Seas", "Anthem of the Seas", "Navigator of the Seas")
            .build();
    
    @Test
    public void testForEachImperativeApproach() {
        
        // imperative approach 1:
        for (int i = 0; i < shipsList.size(); i++) {
            System.out.println("Using Imperative approach with For: " + shipsList.get(i));
        }
        
        // imperative approach 2:
        for (String ship : shipsList) {
            System.out.println("Using Imperative approach with ForEach: " + ship);
        }
    }
    
    @Test
    public void testForEachFunctionalApproach() {
        
        // functional approach 1:
        shipsList.forEach(new Consumer<String>() {
            @Override
            public void accept(String ship) {
                System.out.println("Using functional approach 1: " + ship);
            }
        });
        
        // functional approach 2:
        shipsList.stream()
                .forEach(((String ship) -> System.out.println("Using functional approach 2: " + ship)));
        
        // functional approach 3:
        shipsList.stream()
                .forEach(((ship) -> System.out.println("Using functional approach 3: " + ship)));
        
        // functional approach 4:
        shipsList.stream()
                .forEach((ship -> System.out.println("Using functional approach 4: " + ship)));
        
        // functional approach 5:
        shipsList.stream()
                .forEach(System.out::println);
    }
}
