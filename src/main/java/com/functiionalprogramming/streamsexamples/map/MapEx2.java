package com.functiionalprogramming.streamsexamples.map;

import com.google.common.collect.ImmutableList;

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

    public static void main(String[] args) {
        testDoubleTheNumbers();
    }

    public static void testDoubleTheNumbers() {
        List<Integer> integerList = doubleTheNumbers();
        integerList.forEach(out::println);
        assertEquals(integerList, ImmutableList.of(1, 4, 9, 16, 25, 36));
    }
    
    
    public static List<Integer> doubleTheNumbers() {
        return ImmutableList.of(1, 2, 3, 4, 5, 6)
                .stream()
                .map(n -> n * n)
                .collect(toList());
    }
    
}
