package com.algorithms.streams.operations.operators;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static utils.Constants.citiesList;

/**
 * @author Anurag Muthyam
 */

/*
    This class introduces filter() & collect() operations.
    
    filter() ->
    1. Intermediate operator
    2. It takes as argument a predicate and returns a stream with all elements that match the predicate.
    
    collect() ->
    1. Terminal operator
    2. It is a reducer.
    3. The toList() is a static method on the Collectors class.
    
 */

public class StreamsFilterWithCollect {
    
    public static void main(String[] args) {
        
        printListOfCitiesUsingForEach();
        printListOfCitiesUsingCollect();
        
        final List<King> king = Arrays.asList(
                new King("Rob", 27),
                new King("Ned", 48),
                new King("Tywin", 65),
                new King("Joffrey", 17));
        
        System.out.println("list of Kings sorted by age: " + king.stream()
                .sorted((king1, king2) -> king1.ageDifference(king2))
                .collect(Collectors.toList()));
    }
    
    public static class King {
        
        private String name;
        private int age;
        
        public King(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        public String getName() {
            return name;
        }
        
        public int getAge() {
            return age;
        }
        
        public int ageDifference(King kingAge) {
            return age - kingAge.age;
        }
        
        public String toString() {
            return String.format("%s - %d", name, age);
        }
    }
    
    /**
     * The method sorts(), filters() and prints() the list of cities
     */
    public static void printListOfCitiesUsingForEach() {
        
        // imperative approach:
        Collections.sort(citiesList);
        for (int i = 0; i < citiesList.size(); i++) {
            System.out.println("list of cities imperative approach: " + citiesList.get(i));
        }
        
        // functional approach:
        citiesList.stream()
                .filter(city -> !city.isEmpty())
                .sorted()
                .forEach(city -> System.out.println("list of cities functional approach: " + city));
    }
    
    /**
     * The method filters(), and collects the list of cities and prints()
     */
    public static void printListOfCitiesUsingCollect() {
        
        // imperative approach:
        for (int i = 0; i < citiesList.size(); i++) {
            if (!citiesList.isEmpty()) {
                Collections.sort(citiesList, String::compareToIgnoreCase);
            }
        }
        System.out.println("list of cities using collect() imperative approach: " + citiesList);
        
        
        // functional approach:
        System.out.println("list of cities using collect() functional approach: " + citiesList.stream()
                .filter(city -> !city.isEmpty())
                .sorted()
                .collect(Collectors.toList()));
    }
    
}
