package com.algorithms.functionalprogramming.stream_examples.map;

import org.junit.jupiter.api.Test;

import static com.utils.Constants.flowersList1;

/**
 * @author Anurag Muthyam
 */

/**
 * map() ->
 * 1. Intermediate operator
 * 2. It transforms a stream of input to a stream of output without altering the size of the stream.
 * 3. A map takes a function as argument. The function is applied to each element, mapping into a new element.
 * 4. It doesn't modify the stream, but instead creates a new list.
 */

public class MapEx3 {
    
    @Test
    public void printListOfFlowersInUpperCase() {
        
        flowersList1
                .stream()
                .sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
    
}
