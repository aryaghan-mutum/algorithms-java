package com.algorithms.functionalprogramming.stream_examples.flatmap;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapEx4 {
    
    final static List<Integer> numbersList1 = Arrays.asList(1, 2, 3);
    final static List<Integer> numbersList2 = Arrays.asList(3, 4);
    
    @Test
    public void test1() {
        getPairsOfNumbers();
    }
    
    /**
     * Given two lists of numbers, how would you return all pairs of numbers?
     * For example, given a list [1, 2, 3] and a list [3, 4] you should return [(1, 3), (1, 4), (2, 3), (2, 4), (3, 3), (3, 4)].
     * For simplicity, you can represent a pair as an array with two elements.
     */
    public List<int[]> getPairsOfNumbers() {
        
        List<int[]> resultList = numbersList1.stream()
                .flatMap(i -> numbersList2.stream().map(j -> new int[]{i, j}))
                .peek(e -> System.out.println(" " + e))
                .collect(Collectors.toList());
        
        return resultList;
    }
    
    @Test
    public void test2() {
        getPairsOfNumbersSumIsDividedBy3();
    }
    
    /**
     * How would you extend the previous example to return only pairs whose sum is divisible by 3? For example, (2, 4) and (3, 3) are valid.
     */
    public List<int[]> getPairsOfNumbersSumIsDividedBy3() {
        List<int[]> resultList = numbersList1.stream()
                .flatMap(i -> numbersList2.stream()
                        .filter(j -> (i + j) % 3 == 0)
                        .map(j -> new int[]{i, j}))
                .collect(Collectors.toList());
        
        return resultList;
    }
    
}
