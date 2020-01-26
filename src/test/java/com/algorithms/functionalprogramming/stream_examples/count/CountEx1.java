package com.algorithms.functionalprogramming.stream_examples.count;

import org.junit.jupiter.api.Test;

import static com.utils.Constants.numbers;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountEx1 {
    
    @Test
    public void testCountForNumsGreaterThan6() {
        long count = numbers.stream()
                .filter(number -> number > 4)
                .count();
    
        assertEquals(count, 6);
    }
    
    
}
