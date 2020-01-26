package com.algorithms.functionalprogramming.stream_examples.foreach;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class ForEachEx3 {
    
    private String str = "Hello world";
    
    /**
     * chars() method returns a stream of Integers rather than a stream of Characters.
     */
    @Test
    public void iteratingChars1() {
        str.chars().forEach(c -> System.out.print(" " + c));
    }
    
    /**
     * chars() method returns a stream of Characters.
     */
    @Test
    public void iteratingChars2() {
        str.chars()
                .mapToObj(c -> Character.valueOf((char) c))
                .forEach(c -> System.out.print(" " + c));
    }
    
    @Test
    public void printNumbersFrom10To20() {
        IntStream.range(10, 20)
                .filter(number -> number % 2 == 1)
                .forEach(System.out::println);  //13 15 17 19
    }
}
