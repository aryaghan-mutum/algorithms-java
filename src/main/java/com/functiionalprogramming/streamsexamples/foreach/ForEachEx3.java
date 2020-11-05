package com.functiionalprogramming.streamsexamples.foreach;

import java.util.stream.IntStream;
import static java.lang.System.out;

public class ForEachEx3 {
    
    private static String str = "Hello world";

    public static void main(String[] args) {
        iteratingChars1();
        iteratingChars2();
        printNumbersFrom10To20();
    }

    /**
     * chars() method returns a stream of Integers rather than a stream of Characters.
     */
    public static void iteratingChars1() {
        str.chars().forEach(c -> out.print(" " + c));
    }
    
    /**
     * chars() method returns a stream of Characters.
     */
    public static void iteratingChars2() {
        str.chars()
                .mapToObj(c -> Character.valueOf((char) c))
                .forEach(c -> out.print(" " + c));
    }

    public static void printNumbersFrom10To20() {
        IntStream.range(10, 20)
                .filter(number -> number % 2 == 1)
                .forEach(out::println);  //11 13 15 17 19
    }
}
