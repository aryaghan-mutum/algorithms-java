package com.algorithms.functionalprogramming.stream_examples.flatmap;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlatMapEx2 {
    
    @Test
    public void testFlatMap() {
        List<Integer> actualList = Stream.of(asList(1, 2), asList(3, 4))
                .flatMap(numbers -> numbers.stream())
                .collect(toList());
        
        assertEquals(actualList, asList(1, 2, 3, 4));
    }
    
}
