package com.algorithms.functionalprogramming.streams_implementation;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 *
 * (define foreach(fn) {
 *     return void;
 * }
 */
public class ForEachImplementation {
    
    @FunctionalInterface
    public interface Consumer<T> {
        
        void accept(T t);
    }
    
    public static <T> void foreach(List<T> list, Consumer<T> consumer) {
        
        for (T t : list) {
            consumer.accept(t);
        }
    }
    
    @Test
    public void testForeach() {
        foreach(Arrays.asList(1, 2, 3, 4, 5), i -> System.out.println(i));
    }
}
