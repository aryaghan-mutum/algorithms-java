package com.functiionalprogramming.streamsexamples.map;

import static java.lang.System.out;
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

    public static void main(String[] args) {
        printListOfFlowersInUpperCase();
    }

    public static void printListOfFlowersInUpperCase() {
        flowersList1
                .stream()
                .sorted()
                .map(String::toUpperCase)
                .forEach(out::println);
    }
    
}
