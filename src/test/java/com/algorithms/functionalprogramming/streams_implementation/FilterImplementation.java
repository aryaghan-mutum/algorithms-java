package com.algorithms.functionalprogramming.streams_implementation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * (define filter(T list, fn) {
 * ...
 * }
 */
public class FilterImplementation {
    
    @FunctionalInterface
    public interface Predicate<T> {
        
        boolean test(T t);
    }
    
    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> results = new ArrayList<>();
        
        for (T t : list) {
            if (predicate.test(t)) {
                results.add(t);
            }
        }
        
        return results;
    }
    
    @Test
    public void testFilter() {
        filter(Arrays.asList(1,2,3,4,5), n -> n % 2 == 0)
                .forEach(n -> System.out.println("numbers: " + n));
    }
    
}
