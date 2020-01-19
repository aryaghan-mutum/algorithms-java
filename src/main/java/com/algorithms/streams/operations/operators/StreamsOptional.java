package com.algorithms.streams.operations.operators;

import java.util.List;
import java.util.Optional;

import static com.utils.Constants.doubleNumbersList;
import static com.utils.Constants.fruitsList;

/**
 * @author Anurag Muthyam
 */

public class StreamsOptional {
    
    public static void main(String[] args) {
        
        findFruitNameEndsWithLetter();
        
        mathOperation();
        
    }
    
    // find fruit ends with letter 'E' and 'X'
    public static void findFruitNameEndsWithLetter() {
        fruitName("e", fruitsList);
        fruitName("x", fruitsList);
    }
    
    public static void fruitName(String letter, List<String> fruitsList) {
        
        final Optional<String> fruitEndingLetter =
                fruitsList.stream()
                        .filter(fruit -> fruit.endsWith(letter))
                        .findFirst();
        
        System.out.println(String.format("Fruit: %s: %s",
                fruitEndingLetter,
                fruitEndingLetter.orElse("Fruit Not found")));
    }
    
    
    public static void mathOperation() {
        
        final Optional<Double> number =
                doubleNumbersList.stream()
                        .map(n -> Math.sqrt(n))
                        .filter(n -> n % 3 == 0)
                        .findAny();
        
        System.out.println("Number: " + number);
    }
    
    
}



