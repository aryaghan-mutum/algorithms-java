package com.algorithms.functionalprogramming.build_streams;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class BuildStreams {
    
    @Test
    public void streamsContainValues() {
        Stream<String> stream = Stream.of("Royal", "caribbean ", "cruise ", "miami");
        stream.map(String::toUpperCase).forEach(System.out::println);
    }
    
    @Test
    public void streamsFromArrays() {
        int[] numbers = {4, 53, 4, 31, 32, 43};
        double sum = stream(numbers).sum();
        System.out.println(sum);
    }
    
}
