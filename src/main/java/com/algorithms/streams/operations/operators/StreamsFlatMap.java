package com.algorithms.streams.operations.operators;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.utils.Constants.numbersList;
import static com.utils.Constants.upperCaseFruitsList;

/**
 * @author Anurag Muthyam
 */

/*
    flatMap() :
    1. flatMap() is a mix of map() and flat() functions.
    2. It transforms and flattens the items in a stream
*/

public class StreamsFlatMap {
    
    public static void main(String[] args) {
        
        getUniqueCharsFromListOfFruits();
        
        getNumberPairsFromTwoLists();
        
    }
    
    public static void getUniqueCharsFromListOfFruits() {
    
        /*
            The below program doesn't work because the map returns an array of String[] for each fruit.
            But we need it to return a Stream<String> of unique characters
         */
        System.out.println("Unique Chars From list Of Fruits :" + upperCaseFruitsList.stream()
                .map(fruit -> fruit.split(""))
                .collect(Collectors.toSet()));
        
        /*  use flatMap() function to map each array not with the stream but with the contents of the stream.
            It flattens the array of stream
            Arrays::stream takes an array and returns a stream
         */
        System.out.println("Unique Chars From list Of Fruits :" + upperCaseFruitsList.stream()
                .map(fruit -> fruit.split(""))
                .flatMap(fruit -> Arrays.stream(fruit))
                .collect(Collectors.toSet()));
        
    }
    
    public static void getNumberPairsFromTwoLists() {
        
        List<Integer> numbersList2 = Arrays.asList(11, 13, 15);
        
        System.out.println("math functions with two lists: " + numbersList.stream()
                .flatMap(x -> numbersList2.stream()
                        .filter(y -> (x + y) % 3 == 0)
                        .map(y -> new int[]{x, y}))
                .collect(Collectors.toList()));
    }
    
    
}



