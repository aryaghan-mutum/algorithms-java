package com.functiionalprogramming.streamsexamples.reduce;

import static java.lang.System.out;

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

    public static void main(String[] args) {
        getMax();
        getMin();
        addCommasBetweenFlowers();
        addNumsBetween1To100();
    }

    public static void getMax() {
        
        //functional approach 1:
        doubleNumbersList.stream()
                .reduce((a, b) -> (a >= b) ? a : b);
        
        //functional approach 2:
        out.println("Max in Functional approach: " + doubleNumbersList.stream()
                .reduce((Double::max)).get());
    }

    public static void getMin() {
        
        //functional approach 1:
        doubleNumbersList.stream()
                .reduce((a, b) -> (a <= b) ? a : b);
        
        //functional approach 2:
        out.println("Min Functional approach: " + doubleNumbersList.stream()
                .reduce((Double::min)));
    }

    public static void addCommasBetweenFlowers() {
        flowersList1.stream()
                .sorted()
                .reduce((s1, s2) -> s1 + ", " + s2)
                .ifPresent(out::println);   //angelonia, cyclamen, hollyhock, laceleaf, primrose, snapdragon
    }

    public static void addNumsBetween1To100() {
        out.println(
                IntStream.range(1, 100)
                        .reduce((x, y) -> x + y).getAsInt()); //4950
    }
    
}



