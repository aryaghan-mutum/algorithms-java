package com.algorithms.functionalprogramming.stream_examples.foreach;

import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.IntStream;

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
    
    @Test
    public void testForEachImperativeApproach() {
        
        // imperative approach 1:
        for (int i = 0; i < citiesList.size(); i++) {
            System.out.println("Using Imperative approach with For: " + citiesList.get(i));
        }
        
        // imperative approach 2:
        for (String city : citiesList) {
            System.out.println("Using Imperative approach with ForEach: " + city);
        }
    }
    
    @Test
    public void testForEachFunctionalApproach() {
        
        // functional approach 1:
        citiesList.forEach(new Consumer<String>() {
            @Override
            public void accept(String city) {
                System.out.println("Using functional approach 1: " + city);
            }
        });
        
        // functional approach 2:
        citiesList
                .stream()
                .forEach(((String ship) -> System.out.println("Using functional approach 2: " + ship)));
        
        // functional approach 3:
        citiesList
                .stream()
                .forEach(((ship) -> System.out.println("Using functional approach 3: " + ship)));
        
        // functional approach 4:
        citiesList
                .stream()
                .forEach((ship -> System.out.println("Using functional approach 4: " + ship)));
        
        // functional approach 5:
        citiesList
                .stream()
                .forEach(System.out::println);
    }
}
