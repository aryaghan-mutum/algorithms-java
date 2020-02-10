package com.algorithms.functionalprogramming.stream_examples.map;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.lang.System.out;
import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Algorithm:
 * Given a list of numbers, how would you return a list of the square of each number?
 * For example, given [1, 2, 3, 4, 5] you should return [1, 4, 9, 16, 25].
 */
public class MapEx2 {
    
    @Test
    public void testDoubleTheNumbers() {
        List<Integer> integerList = doubleTheNumbers();
        integerList.forEach(out::println);
        assertEquals(integerList, ImmutableList.of(1, 4, 9, 16, 25, 36));
    }
    
    
    public List<Integer> doubleTheNumbers() {
        return ImmutableList.of(1, 2, 3, 4, 5, 6)
                .stream()
                .map(n -> n * n)
                .collect(toList());
    }
    
}
