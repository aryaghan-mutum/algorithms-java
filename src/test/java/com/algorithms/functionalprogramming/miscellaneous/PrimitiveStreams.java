package com.algorithms.functionalprogramming.miscellaneous;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;


public class PrimitiveStreams {
    
    List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    
    @Test
    public void testSumWithMapToInt() {
        
        int sum = numbersList.stream().mapToInt(x -> x * 2).sum();
        Assertions.assertEquals(sum, 90);
    }
    
    @Test
    public void testMaxWithMapToInt() {
        OptionalInt max = numbersList.stream().mapToInt(x -> x * 2).max();
        Assertions.assertEquals(max.getAsInt(), 18);
    }
    
    @Test
    public void testMinWithMapToInt() {
        int min = numbersList.stream().mapToInt(x -> x * 2).min().getAsInt();
        Assertions.assertEquals(min, 2);
    }
    
    @Test
    public void testAvgWithMapToInt() {
        OptionalDouble avg = numbersList.stream().mapToInt(x -> x * 2).average();
        
        double avg2 = avg.orElse(-1);
        
        Assertions.assertEquals(avg.getAsDouble(), 10.0);
    }
    
  
}
