package com.algorithms.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex1 {

    public static void main(String[] args) {

        //using a for loop

        //using list
        List<Integer> lst = Arrays.asList(1,2,3,4,5,6);
        lst.stream()
                .filter(value -> value >= 4)
                .forEach(value -> System.out.println(value));

        System.out.println("---");

        //using Streams using an array
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        Arrays.stream(numbers)
                .filter(value ->  value >= 3)
                .sorted()
                .forEach(value -> System.out.println(value));

        System.out.println("---");

        //using Streams
        Stream.of(331,2,13,4,15,6)
                .filter(value -> value >= 4)
                .map(value -> value * value)
                .sorted()
                .forEach(value -> System.out.println(value));

        System.out.println("---");

    }
}
