package com.functiionalprogramming.buildstreams;

import java.util.stream.Stream;
import static java.lang.System.out;
import static java.util.Arrays.stream;

public class BuildStreams {

    public static void main(String[] args) {
        streamsContainValues();
        streamsFromArrays();

    }
    public static void streamsContainValues() {
        Stream<String> stream = Stream.of("Royal", "caribbean ", "cruise ", "miami");
        stream.map(String::toUpperCase).forEach(System.out::println);
    }

    public static void streamsFromArrays() {
        int[] numbers = {4, 53, 4, 31, 32, 43};
        double sum = stream(numbers).sum();
        out.println(sum);
    }
    
}
