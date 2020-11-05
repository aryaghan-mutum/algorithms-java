package com.functiionalprogramming.streamsimplementation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 *
 * (define map(T list, fn) {
 *     ... return R list
 * }
 */
public class MapImplementation {

    public static void main(String[] args) {
        map(asList("Lambdas", "are", "amazing"), s -> s.length()).forEach(System.out::println);
    }

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
}
