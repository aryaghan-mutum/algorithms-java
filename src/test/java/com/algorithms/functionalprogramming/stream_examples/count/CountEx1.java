package com.algorithms.functionalprogramming.stream_examples.count;

import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static com.utils.Constants.citiesList;
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
    
    @Test
    public void testCountImperativeApproach() {
        int count = 0;
        for (String city : citiesList) {
            if (!city.isEmpty()) {
                count = count + 1;
            }
        }
        out.println("find count imperative approach: " + count);
        assertEquals(count, 4);
    }
    
    @Test
    public void testCountFunctionalApproach() {
        long count = citiesList
                .stream()
                .filter(city -> !city.isEmpty())
                .count();
    
        out.println("find count functional approach: " + count);
        assertEquals(count, 4);
    }
    
}
