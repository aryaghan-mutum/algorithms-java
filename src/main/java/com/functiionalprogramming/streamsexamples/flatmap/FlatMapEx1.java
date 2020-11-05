package com.functiionalprogramming.streamsexamples.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;
import static com.utils.Constants.numbersList;
import static java.util.stream.Collectors.toSet;

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
    
    static List<String> upperCaseShipsList = Arrays.asList(new String[]{"ANTHEM OF THE SEAS", "OASIS OF THE SEAS", "NAVIGATOR OF THE SEAS"});

    public static void main(String[] args) {
        getUniqueCharsFromListOfShipsFunc1();
        getUniqueCharsFromListOfShipsFunc2();
        getNumberPairsFromTwoLists();
    }

    /**
     * Question: Why The below program doesn't print the unique characters?
     * Answer: The method doesn't print the unique characters because the map returns an array of String[] for each fruit.
     * But we need it to return a Stream<String> of unique characters
     */
    public static void getUniqueCharsFromListOfShipsFunc1() {
        out.println("Unique Chars From list Of Ships :" + upperCaseShipsList.stream()
                .map(fruit -> fruit.split(""))
                .collect(toSet()));
    }
    
    /**
     * use flatMap() function to map each array not with the stream but with the contents of the stream.
     * It flattens the array of stream
     * Arrays::stream takes an array and returns a stream
     */
    public static void getUniqueCharsFromListOfShipsFunc2() {
        out.println("Unique Chars From list Of Ships :" + upperCaseShipsList.stream()
                .map(fruit -> fruit.split(""))
                .flatMap(fruit -> Arrays.stream(fruit))
                .collect(toSet()));
    }

    public static void getNumberPairsFromTwoLists() {
        List<Integer> numbersList2 = Arrays.asList(11, 13, 15);
        
        out.println("math functions with two lists: " + numbersList.stream()
                .flatMap(x -> numbersList2.stream()
                        .filter(y -> (x + y) % 3 == 0)
                        .map(y -> new int[]{x, y}))
                .collect(Collectors.toList()));
    }
    
}



