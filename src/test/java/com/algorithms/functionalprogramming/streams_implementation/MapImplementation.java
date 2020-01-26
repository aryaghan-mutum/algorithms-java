package com.algorithms.functionalprogramming.streams_implementation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * (define map(T list, fn) {
 *     ... return R list
 * }
 */
public class MapImplementation {
    
    @FunctionalInterface
    public interface Function<T, R> {
        R apply(T t);
    }
    
    public static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        
        List<R> results = new ArrayList<>();
        
        for(T t : list) {
            results.add(function.apply(t));
        }
        
        return results;
    }
    
    @Test
    public void testMap() {
        
        List<Integer> list = map(Arrays.asList("Lambdas", "are", "amazing"), s -> s.length());
        
        list.forEach(System.out::println);
    }
    
    

}
