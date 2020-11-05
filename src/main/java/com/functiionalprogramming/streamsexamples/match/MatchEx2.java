package com.functiionalprogramming.streamsexamples.match;

import static com.utils.Constants.doubleNumbersList;
import static com.utils.Constants.shipCodesList;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Anurag Muthyam
 */

/**
 * Short-circuiting functions: It doesn't process the entire stream to generate an output.
 * <p>
 * Short-circuiting operators:
 * -> limit()
 * -> anyMatch()
 * -> allMatch()
 * -> noneMatch()
 * <p>
 * anyMatch() :
 * It is a terminal operator and returns a boolean.
 */

public class MatchEx2 {

    public static void main(String[] args) {
        anyMatchEx1();
        anyMatchEx2();
        allMatchEx();
        noneMatchEx();
    }

    public static void anyMatchEx1() {
        boolean b = doubleNumbersList.stream().anyMatch(n -> n > 5.0);
        assertEquals(b, true);
    }

    public static void anyMatchEx2() {
        boolean b = shipCodesList
                .stream()
                .map(String::toUpperCase)
                .anyMatch(ship -> ship.startsWith("S"));
        
        assertEquals(b, true);
    }

    public static void allMatchEx() {
        boolean b = shipCodesList
                .stream()
                .map(String::toUpperCase)
                .allMatch(ship -> ship.startsWith("S"));
    
        assertEquals(b, false);
    }

    public static void noneMatchEx() {
        boolean b = shipCodesList
                .stream()
                .map(String::toUpperCase)
                .noneMatch(flower -> flower.startsWith("x"));
        
        assertEquals(b, true);
    }
    
    
}
