package com.algorithms.functionalprogramming.stream_examples.sort;

import org.junit.jupiter.api.Test;

import static com.utils.Constants.flowersList1;


/**
 * @author Anurag Muthyam
 */

public class SortEx2 {
    
    @Test
    public void sortCitiesList() {
        flowersList1
                .stream()
                .sorted()
                .forEach(System.out::println);
    }
}



