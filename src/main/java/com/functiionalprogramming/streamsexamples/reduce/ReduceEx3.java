package com.functiionalprogramming.streamsexamples.reduce;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReduceEx3 {
    
    final ImmutableList<Double> doubleNumbersList = ImmutableList.of(0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);
    
    @Test
    public void getTotalCountImperativeApproach() {
        int count = 0;
        for (int i = 0; i < doubleNumbersList.size(); i++) {
            doubleNumbersList.get(i);
            count = count + 1;
        }
        out.println("Total in Imperative approach: " + count);
    
        assertEquals(count, 10);
    }
    
    
    @Test
    public void getTotalCountFunctionalApproach() {
        int count = doubleNumbersList.stream()
                .map(d -> 1)
                .reduce(0, (a, b) -> a + b);
        
        out.println("count in Functional approach: " + count);
        assertEquals(count, 10);
    }
}
