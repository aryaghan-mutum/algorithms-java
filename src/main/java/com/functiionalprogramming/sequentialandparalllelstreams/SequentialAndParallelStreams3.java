package com.functiionalprogramming.sequentialandparalllelstreams;

import static java.lang.System.out;
import static java.util.Arrays.stream;

import java.util.stream.Stream;

public class SequentialAndParallelStreams3 {

    public void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        sequentialStream(integers);
        parallelStream(integers);
    }


    public static void sequentialStream(Integer[] integers) {
        printResult(stream(integers).sequential());
    }

    public static void parallelStream(Integer[] integers) {
        printResult(stream(integers).parallel());
    }
    
    public static void printResult(Stream<Integer> stream) {
        stream.forEach(s -> out.println("value:" + s + " - thread: " + Thread.currentThread().getName()));
    }
}
