package com.algorithms.functionalprogramming.stream_examples.flatmap;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * flatMap() :
 * 1. flatMap() is a mix of map() and flat() functions.
 * 2. It transforms and flattens the items in a stream
 *
 * Here is the Input: List("ANTHEM OF THE SEAS", "OASIS OF THE SEAS", "NAVIGATOR OF THE SEAS")
 * Get the unique chars Output: [ , A, E, F, G, H, I, M, N, O, R, S, T, V]
 
 */

// What is the difference between these two methods?
public class FlatMapEx1 {
    
    List<String> upperCaseShipsList = Arrays.asList(new String[]{"ANTHEM OF THE SEAS", "OASIS OF THE SEAS", "NAVIGATOR OF THE SEAS"});
    
    /**
     * Question: Why The below program doesn't print the unique characters?
     * Answer: The method doesn't print the unique characters because the map returns an array of String[] for each fruit.
     * But we need it to return a Stream<String> of unique characters
     */
    @Test
    public void getUniqueCharsFromListOfShipsFunc1() {
        System.out.println("Unique Chars From list Of Ships :" + upperCaseShipsList.stream()
                .map(fruit -> fruit.split(""))
                .collect(Collectors.toSet()));
    }
    
    /**
     * use flatMap() function to map each array not with the stream but with the contents of the stream.
     * It flattens the array of stream
     * Arrays::stream takes an array and returns a stream
     */
    @Test
    public void getUniqueCharsFromListOfShipsFunc2() {
        System.out.println("Unique Chars From list Of Ships :" + upperCaseShipsList.stream()
                .map(fruit -> fruit.split(""))
                .flatMap(fruit -> Arrays.stream(fruit))
                .collect(Collectors.toSet()));
    }
    
}



