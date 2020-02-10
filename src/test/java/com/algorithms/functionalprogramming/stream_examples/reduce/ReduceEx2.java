package com.algorithms.functionalprogramming.stream_examples.reduce;

import static java.lang.System.out;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static com.utils.Constants.doubleNumbersList;
import static com.utils.Constants.flowersList1;

/**
 * @author Anurag Muthyam
 */

/**
 * reduce() :
 * It takes two arguments and returns a scalar. Therefore is a terminal operator.
 */

public class ReduceEx2 {
    
    @Test
    public void getMax() {
        
        //functional approach 1:
        doubleNumbersList.stream()
                .reduce((a, b) -> (a >= b) ? a : b);
        
        //functional approach 2:
        out.println("Max in Functional approach: " + doubleNumbersList.stream()
                .reduce((Double::max)).get());
    }
    
    @Test
    public void getMin() {
        
        //functional approach 1:
        doubleNumbersList.stream()
                .reduce((a, b) -> (a <= b) ? a : b);
        
        //functional approach 2:
        out.println("Min Functional approach: " + doubleNumbersList.stream()
                .reduce((Double::min)));
    }
    
    @Test
    public void addCommasBetweenFlowers() {
        
        flowersList1.stream()
                .sorted()
                .reduce((s1, s2) -> s1 + ", " + s2)
                .ifPresent(out::println);   //angelonia, cyclamen, hollyhock, laceleaf, primrose, snapdragon
    }
    
    @Test
    public void addNumsBetween1To100() {
        out.println(
                IntStream.range(1, 100)
                        .reduce((x, y) -> x + y).getAsInt()); //4950
    }
    
}



