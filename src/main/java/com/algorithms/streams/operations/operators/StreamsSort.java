package com.algorithms.streams.operations.operators;

import java.util.Comparator;

import static com.utils.Constants.citiesList;
import static com.utils.Constants.flowersList1;


/**
 * @author Anurag Muthyam
 */


public class StreamsSort {
    
    public static void main(String[] args) {
        
        sortCitiesList();
        
        convertCitiesToUppercase();
    }
    
    public static void sortCitiesList() {
        
        flowersList1
                .stream()
                .sorted()
                .forEach(System.out::println);
    }
    
    // converts cities in a list to uppercase
    public static void convertCitiesToUppercase() {
        
        // imperative approach:
        citiesList.sort(Comparator.naturalOrder());
        for (String city : citiesList) {
            System.out.println("Cities in uppercase imperative approach 1: " + city.toUpperCase());
        }
        
        // functional approach 2:
        citiesList.stream()
                .sorted()
                .forEach(city -> System.out.println("Cities in uppercase functional approach 2: " + city.toUpperCase()));
    }
    
}



