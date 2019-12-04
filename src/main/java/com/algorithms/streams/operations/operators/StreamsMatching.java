package com.algorithms.streams.operations.operators;

import static com.utils.Constants.doubleNumbersList;
import static com.utils.Constants.flowersList2;

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
        
        boolean x = doubleNumbersList.stream()
                .anyMatch(n -> n > 5.0);
        
        System.out.println(x);
        return x;
    }
    
    public static void anyMatchEx() {
        flowersList2
                .stream()
                .map(String::toUpperCase)
                .anyMatch(flower -> flower.startsWith("S"));  //true
    }
    
    public static void allMatchEx() {
        flowersList2
                .stream()
                .map(String::toUpperCase)
                .anyMatch(flower -> flower.startsWith("S"));  //false
    }
    
    
    public static void noneMatchEx() {
        flowersList2
                .stream()
                .map(String::toUpperCase)
                .noneMatch(flower -> flower.startsWith("x"));  //true
    }
    
  
}
