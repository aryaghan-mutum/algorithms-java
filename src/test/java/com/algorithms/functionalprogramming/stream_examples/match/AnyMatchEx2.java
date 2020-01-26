package com.algorithms.functionalprogramming.stream_examples.match;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

public class AnyMatchEx2 {
    
    @Test
    public void anyMatchEx1() {
        boolean b = doubleNumbersList.stream().anyMatch(n -> n > 5.0);
        assertEquals(b, true);
    }
    
    @Test
    public void anyMatchEx2() {
        boolean b = shipCodesList
                .stream()
                .map(String::toUpperCase)
                .anyMatch(ship -> ship.startsWith("S"));
        
        assertEquals(b, true);
        
    }
    
    @Test
    public void allMatchEx() {
        boolean b = shipCodesList
                .stream()
                .map(String::toUpperCase)
                .allMatch(ship -> ship.startsWith("S"));
    
        assertEquals(b, false);
    }
    
    @Test
    public void noneMatchEx() {
        boolean b = shipCodesList
                .stream()
                .map(String::toUpperCase)
                .noneMatch(flower -> flower.startsWith("x"));
        
        assertEquals(b, true);
    }
    
    
}
