package com.algorithms.functionalprogramming.stream_examples.map;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Algorithm:
 * Given a list of numbers, how would you return a list of the square of each number?
 * For example, given [1, 2, 3, 4, 5] you should return [1, 4, 9, 16, 25].
 */
public class MapEx2 {
    
    final ImmutableList<Integer> numbersList = ImmutableList.of(1, 2, 3, 4, 5, 6);
    
    @Test
    public void testDoubleTheNumbers() {
        List<Integer> integerList = doubleTheNumbers();
        integerList.forEach(System.out::println);
        assertEquals(integerList, ImmutableList.of(1, 4, 9, 16, 25, 36));
    }
    
    
    public List<Integer> doubleTheNumbers() {
        return numbersList.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }
    
}
