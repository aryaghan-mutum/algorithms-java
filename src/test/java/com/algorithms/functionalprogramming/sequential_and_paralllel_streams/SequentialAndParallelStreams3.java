package com.algorithms.functionalprogramming.sequential_and_paralllel_streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Stream;

public class SequentialAndParallelStreams3 {
    
    Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    
    @Test
    public void sequentialStream() {
        printResult(Arrays.stream(integers).sequential());
    }
    
    @Test
    public void parallelStream() {
        printResult(Arrays.stream(integers).parallel());
    }
    
    public void printResult(Stream<Integer> stream) {
        stream.forEach(s -> System.out.println("value:" + s + " - thread: " + Thread.currentThread().getName()));
    }
}
