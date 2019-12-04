package com.algorithms.streams.operations.operators;

import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.IntStream;

import static com.utils.Constants.citiesList;


/**
 * @author Anurag Muthyam
 */

/*
 * This class introduces sorted() & forEach() operations.
 * sorted() -> Intermediate operator
 * limit() -> Intermediate operator
 * forEach() -> Terminal operator
 */

public class StreamsForEach {
    
    public static void main(String[] args) {
        
        usingFor();
        
        getFiveRandNumbers();
        
        iteratingChars();
    
        printNumbersFrom10To20();
        
    }
    
    public static void usingFor() {
        
        // imperative approach 1:
        for (int i = 0; i < citiesList.size(); i++) {
            System.out.println("Using Imperative approach with For: " + citiesList.get(i));
        }
        
        // imperative approach 2:
        for (String city : citiesList) {
            System.out.println("Using Imperative approach with ForEach: " + city);
        }
        
        // functional approach 1:
        citiesList.forEach(new Consumer<String>() {
            @Override
            public void accept(String city) {
                System.out.println("Using functional approach 1: " + city);
            }
        });
        
        // functional approach 2:
        citiesList
                .stream()
                .forEach(((String city) -> System.out.println("Using functional approach 2: " + city)));
        
        // functional approach 3:
        citiesList
                .stream()
                .forEach(((city) -> System.out.println("Using functional approach 3: " + city)));
        
        // functional approach 4:
        citiesList
                .stream()
                .forEach((city -> System.out.println("Using functional approach 4: " + city)));
        
        // functional approach 5:
        citiesList
                .stream()
                .forEach(System.out::println);
    }
    
    public static void getFiveRandNumbers() {
        
        // imperative approach:
        for (int i = 0; i < 5; i++) {
            double randNum = ((Math.random()));
            
            System.out.println("Rand # imperative approach: " + randNum);
        }
        
        
        // functional approach:
        Random random = new Random();
        random.doubles()
                .limit(5)
                .forEach(randNum -> System.out.println("Rand # functional approach: " + randNum));
    }
    
    
    public static void iteratingChars() {
        String str = "Hello world";
        
        // chars() method returns a stream of Integers rather than a stream of Characters.
        str.chars()
                .forEach(c -> System.out.print(" " + c));
        
        System.out.println(" ");
        
        // chars() method returns a stream of Characters.
        str.chars()
                .mapToObj(c -> Character.valueOf((char) c))
                .forEach(c -> System.out.print(" " + c));
    }
    
    public static void printNumbersFrom10To20() {
        IntStream.range(10, 20)
                .filter(number -> number % 2 == 1)
                .forEach(System.out::println);  //13 15 17 19
    }
    
    
}
