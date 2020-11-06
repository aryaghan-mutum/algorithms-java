package com.functiionalprogramming.streams.operations.problems;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.lang.System.out;
import static java.util.Arrays.asList;

public class ListAndStreamConversion {
    
    public static void main(String[] args) {

        Stream<Integer> stream = asList(1, 432, 2, 732, 1433).stream();
        out.println("Stream to list :" + convertStreamToList(stream));
        
        List<Integer> list = asList(1, 432, 2, 732, 1433);
        out.println("Stream to list :" + convertLisToAStream(list));
    }

    public static List<String> convertStreamToList(Stream<Integer> stream) {
        return stream
                .filter(n -> n % 2 != 0)
                .map(n -> String.format("Odd number: %d", n))
                .collect(Collectors.toList());
    }

    // wip
    private static <T> Stream<T> convertLisToAStream(List<T> list) {
        return list.stream();
    }




}
