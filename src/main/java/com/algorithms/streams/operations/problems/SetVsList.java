package com.algorithms.streams.operations.problems;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static com.utils.Constants.numbersList;
import static com.utils.Constants.repeatedCitiesList;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SetVsList {
    
    public static void main(String[] args) {
        
        getUniqueListOfCitiesEndWithLetterS();
        getUniqueSetOfCitiesEndWithLetterS();
        
        getUniqueEvenNumsUsingDistinctOperation();
        getUniqueEvenNumsUsingSet();
        
    }
    
    // returns a list of unique strings
    public static void getUniqueListOfCitiesEndWithLetterS() {
        
        // functional approach:
        System.out.println("Unique list of city names ends with letter 'S' functional approach: " + repeatedCitiesList.stream()
                .distinct()
                .filter(city -> city.endsWith("s"))
                .collect(Collectors.toList()));
    }
    
    // // returns a set of unique strings
    public static void getUniqueSetOfCitiesEndWithLetterS() {
        
        // imperative approach:
        final Set<String> newSet = new HashSet<>();
        
        for (String city : repeatedCitiesList) {
            if (city.endsWith("s")) {
                newSet.add(city);
            }
        }
        System.out.println("Unique set of city names ends with letter 'S' imperative approach: " + newSet);
        
        
        // functional approach:
        System.out.println("Unique set of city names ends with letter 'S' functional approach: " + repeatedCitiesList.stream()
                .filter(city -> city.endsWith("s"))
                .collect(Collectors.toSet()));
    }
    
    // returns a list of unique even numbers
    public static List<Integer> getUniqueEvenNumsUsingDistinctOperation() {
        
        return numbersList.stream()
                .filter(n -> n % 2 == 0)
                .distinct()
                .collect(Collectors.toList());
    }
    
    // returns a set of unique even numbers
    private static void getUniqueEvenNumsUsingSet() {
        
        // imperative approach:
        final Set<Integer> newSet = new HashSet<Integer>();
        
        for (Integer num : numbersList) {
            if (num % 2 == 0) {
                newSet.add(num);
            }
        }
        System.out.println("Unique even numbers imperative approach: " + newSet);
        
        
        // functional approach:
        System.out.println("Unique even numbers functional approach: " + numbersList.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toSet()));
    }
    
    @Test
    public void testListSequence() {
        Set<Integer> numbersSet = new HashSet<>(asList(4, 3, 2, 1));
        
        List<Integer> sameOrder = numbersSet.stream().collect(toList());
        assertEquals(asList(1, 2, 3, 4), sameOrder); //pass
        assertEquals(asList(4, 3, 2, 1), sameOrder); //fails
    }
    
}
