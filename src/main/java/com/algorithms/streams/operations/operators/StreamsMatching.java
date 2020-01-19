package com.algorithms.streams.operations.operators;

import java.util.Arrays;
import java.util.List;

import static com.utils.Constants.doubleNumbersList;
import static com.utils.Constants.flowersList2;
import static com.utils.Constants.shipCodesList;
import static java.util.Arrays.asList;

/**
 * @author Anurag Muthyam
 */

/*
 * Short-circuiting functions: It doesn't process the entire stream to generate an output.
 *
 * Short-circuiting operators:
 * -> limit()
 * -> anyMatch()
 * -> allMatch()
 * -> noneMatch()
 *
 * anyMatch() :
 * It is a terminal operator and returns a boolean.
 */

public class StreamsMatching {
    
    public static void main(String[] args) {
        
        anyMatch();
        
        anyMatchEx();
        
        allMatchEx();
        
        noneMatchEx();
        
    }
    
    public static boolean anyMatch() {
        return doubleNumbersList.stream().anyMatch(n -> n > 5.0);  // true
    }
    
    public static boolean anyMatchEx() {
        return shipCodesList
                .stream()
                .map(String::toUpperCase)
                .anyMatch(ship -> ship.startsWith("S"));  //true
    }
    
    public static boolean allMatchEx() {
        return shipCodesList
                .stream()
                .map(String::toUpperCase)
                .allMatch(ship -> ship.startsWith("S"));  //false
    }
    
    
    public static boolean noneMatchEx() {
        return shipCodesList
                .stream()
                .map(String::toUpperCase)
                .noneMatch(flower -> flower.startsWith("x"));  //true
    }
    
    
}
