package com.functiionalprogramming.miscellaneous;

import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;


public class PrimitiveStreams {

    static List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    public static void main(String[] args) {
        testSumWithMapToInt();
        testMaxWithMapToInt();
        testMinWithMapToInt();
        testAvgWithMapToInt();
    }


    public static void testSumWithMapToInt() {
        int sum = numbersList.stream()
                .mapToInt(x -> x * 2)
                .sum();
        
        Assertions.assertEquals(sum, 90);
    }

    public static void testMaxWithMapToInt() {
        OptionalInt max = numbersList.stream()
                .mapToInt(x -> x * 2)
                .max();
        
        Assertions.assertEquals(max.getAsInt(), 18);
    }

    public static void testMinWithMapToInt() {
        int min = numbersList.stream()
                .mapToInt(x -> x * 2)
                .min()
                .getAsInt();
        
        Assertions.assertEquals(min, 2);
    }

    public static void testAvgWithMapToInt() {
        OptionalDouble avg = numbersList.stream()
                .mapToInt(x -> x * 2)
                .average();
        
        double avg2 = avg.orElse(-1);
        
        Assertions.assertEquals(avg.getAsDouble(), 10.0);
    }
}
