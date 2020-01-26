package com.algorithms.functionalprogramming.stream_examples.collect;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.google.common.primitives.Ints.asList;
import static com.utils.Constants.numbers;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectEx1 {
    
    final List<Integer> expectedList = Arrays.asList(864, 1464, 2866, 86868648, 2424, 1200);
    
    /**
     * Not Advised -> Imperative Approach: Iterates each element and collects elements in a new list
     */
    @Test
    public void testCollectNumbersImperativeApproach() {
        List<Integer> actualList = new ArrayList<>();
        for (Integer n : numbers) {
            if (n > 3) {
                n = n * 2;
                actualList.add(n);
            }
        }
        
        assertEquals(actualList, expectedList);
    }
    
    /**
     * Advised -> Functional Approach: Doesn't need a new list to store data.
     */
    @Test
    public void testCollectNumbersFunctionalApproach() {
        
        assertEquals(numbers.stream()
                        .filter(n -> n > 3)
                        .map(n -> n * 2)
                        .collect(Collectors.toList()),
                expectedList);
    }
    
    
}
