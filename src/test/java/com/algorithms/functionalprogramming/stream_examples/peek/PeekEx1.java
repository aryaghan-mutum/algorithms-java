package com.algorithms.functionalprogramming.stream_examples.peek;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import java.util.stream.Collectors;

public class PeekEx1 {
    
    final ImmutableList<Integer> numbersList = ImmutableList.of(1, 2, 3, 4, 5);
    
    @Test
    public void testPeek() {
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
