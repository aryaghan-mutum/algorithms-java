package com.functiionalprogramming.streamsexamples.peek;

import com.google.common.collect.ImmutableList;

import static java.lang.System.out;
import java.util.stream.Collectors;

public class PeekEx1 {
    
    final static ImmutableList<Integer> numbersList = ImmutableList.of(1, 2, 3, 4, 5);

    public static void main(String[] args) {
        testPeek();
    }

    public static void testPeek() {
        numbersList
                .stream()
                .peek(x -> out.println("from stream: " + x))
                .map(x -> x + 3)
                .peek(x -> out.println("after map: " + x))
                .filter(x -> x % 2 == 0)
                .peek(x -> out.println("after filter: " + x))
                .limit(3)
                .peek(x -> out.println("after limit: " + x))
                .collect(Collectors.toList());
    }
    
}
