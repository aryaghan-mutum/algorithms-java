package com.algorithms.functionalprogramming.stream_examples.flatmap;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static java.lang.System.out;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * flatMap() :
 * 1. flatMap() is a mix of map() and flat() functions.
 * 2. It transforms and flattens the items in a stream
 *
 * Flatten a nested list
 */

public class FlatMapEx3 {
    
    final List<List<Integer>> oddAndEvenNumsList = asList(asList(1, 3, 5), asList(2, 4, 6, 8));
    final List<Integer> expectedResultList = asList(1, 3, 5, 2, 4, 6, 8);
    
    @Test
    public void testFlatMapListsImperativeApproach() {
        
        List<Integer> tempList = new ArrayList<>();
        for (List<Integer> numbersList : oddAndEvenNumsList) {
            for (Integer number : numbersList) {
                tempList.add(number);
            }
        }
        assertEquals(tempList, expectedResultList);
    }
    
    @Test
    public void testFlatMapListFunctionalApproach1() {
        oddAndEvenNumsList.stream()
                .flatMap(lst -> lst.stream())  //Collection::stream
                .collect(toList());
        
        List<Integer> actualList = oddAndEvenNumsList
                .stream()
                .flatMap(lst -> lst.stream())
                .collect(toList());
        
        actualList.forEach(e -> out.print(" " + e));
        
        assertEquals(actualList, expectedResultList);
    }
    
    @Test
    public void testFlatMapListFunctionalApproach2() {
        List<Integer> actualList = flattenListOfListsStream(oddAndEvenNumsList);
        actualList.forEach(e -> out.print(" " + e));
        assertEquals(actualList, expectedResultList);
    }
    
    private <T> List<T> flattenListOfListsStream(List<List<T>> list) {
        return list.stream()
                .flatMap(Collection::stream)
                .collect(toList());
    }
    
}

    




