package com.functiionalprogramming.streamsimplementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.lang.System.out;

/**
 * (define filter(T list, fn) {
 * ...
 * }
 */
public class FilterImplementation {

    public static void main(String[] args) {
        filter(Arrays.asList(1,2,3,4,5), n -> n % 2 == 0)
                .forEach(n -> out.println("numbers: " + n));
    }

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

}
