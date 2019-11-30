package com.algorithms.streams.operations.operators;

import java.util.stream.IntStream;

import static utils.Constants.doubleNumbersList;
import static utils.Constants.flowersList1;

/**
 * @author Anurag Muthyam
 */

public class StreamsReduce {
    
    /**
     * reduce() :
     * It takes two arguments and returns a scalar. Therefore is a terminal operator.
     */
    public static void main(String[] args) {
        
        StreamsReduce.getMax();
        StreamsReduce.getMin();
        StreamsReduce.getSum();
        StreamsReduce.getTotalNum();
        StreamsReduce.addCommasBetweenFlowers();
        StreamsReduce.addNumsBetween1To100();
        
    }
    
    public static void getMax() {
        
        //functional approach 1:
        doubleNumbersList.stream()
                .reduce((a, b) -> (a >= b) ? a : b);
        
        //functional approach 2:
        System.out.println("Max in Functional approach: " + doubleNumbersList.stream()
                .reduce((Double::max)));
    }
    
    public static void getMin() {
        
        //functional approach 1:
        doubleNumbersList.stream()
                .reduce((a, b) -> (a <= b) ? a : b);
        
        //functional approach 2:
        System.out.println("Min Functional approach: " + doubleNumbersList.stream()
                .reduce((Double::min)));
    }
    
    public static void getSum() {
        
        // imperative approach:
        double sum = 0;
        for (int i = 0; i < doubleNumbersList.size(); i++) {
            
            if (!doubleNumbersList.isEmpty()) {
                sum = sum + doubleNumbersList.get(i);
            }
        }
        System.out.println("Sum in Imperative approach: " + sum);
        
        // functional approach 1:
        System.out.println("Sum in Functional approach 1: " + doubleNumbersList.stream()
                .reduce(0.0, (total, n) -> Double.sum(total, n)));
        
        // functional approach 2:
        System.out.println("Sum in Functional approach 2: " + doubleNumbersList.stream()
                .reduce(0.0, Double::sum));
        
        // functional approach 3:
        System.out.println("Sum in Functional approach 3: " + doubleNumbersList.stream()
                .reduce((a, b) -> a + b));
        
        //  functional approach 4:
        System.out.println("Sum in Functional approach 4: " + doubleNumbersList.stream()
                .mapToDouble(n -> n)
                .sum());
        
    }
    
    public static void getTotalNum() {
        
        //imperative approach:
        int count = 0;
        for (int i = 0; i < doubleNumbersList.size(); i++) {
            doubleNumbersList.get(i);
            count = count + 1;
        }
        System.out.println("Total in Imperative approach: " + count);
        
        
        //functional approach:
        System.out.println("Total in Functional approach: " + doubleNumbersList.stream()
                .map(n -> 1)
                .reduce(0, (a, b) -> a + b));
    }
    
    public static void addCommasBetweenFlowers() {
        
        flowersList1
                .stream()
                .sorted()
                .reduce((s1, s2) -> s1 + ", " + s2)
                .ifPresent(System.out::println);   //angelonia, cyclamen, hollyhock, laceleaf, primrose, snapdragon
    }
    
    public static void addNumsBetween1To100() {
        
        System.out.println(
                IntStream.range(1, 100)
                        .reduce((x, y) -> x + y).getAsInt()); //4950
    }
    
}



