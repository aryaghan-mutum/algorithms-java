package com.algorithms.streams.operations.problems;

import java.util.function.Predicate;

import static com.utils.Constants.citiesList;

public class StreamsImperativeVsFunctional1 {
    
    
    public static void main(String[] args) {
        
        getCities();
        getACityFromList();
    }
    
    public static void getCities() {
        
        // imperative approach:
        for (String city : citiesList) {
            if (city != citiesList.get(1))
                System.out.println("City - Imperative approach: " + city);
        }
        
        
        // functional approach with λ 1:
        citiesList.stream()
                .filter(city -> isNotColumbus(city))
                .forEach(city -> System.out.println("City - Functional approach 1: " + city));
        
        // functional approach without λ 2:
        citiesList.stream()
                .filter(StreamsImperativeVsFunctional1::isNotColumbus)
                .forEach(city -> System.out.println("City - Functional approach 2: " + city));
    
        /*
         When you hover over the new Predicate<String> interface, it says to replace with lambda.
         You can replace it with lambda by clicking Option+Enter in Mac or Alt+Enter in Windows.
         This is applied to forEach() too.
         functional approach without λ 3:
         */
        citiesList.stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String city) {
                        return isNotColumbus(city);
                    }
                }).forEach(city -> System.out.println("City - Functional approach 3: " + city));
        
    }
    
    public static boolean isNotColumbus(String city) {
        return !city.equals("columbus");
    }
    
    public static void getACityFromList() {
        
        // imperative approach 1:
        boolean found = false;
        for (int i = 0; i < citiesList.size(); i++) {
            if (citiesList.get(i).equals("fargo")) {
                found = true;
                System.out.println("City found imperative approach 1 " + found);
            }
        }
        
        // imperative approach 2:
        System.out.println("City found imperative approach 2 " + citiesList.contains("fargo"));
        
        
        // functional approach 1:
        System.out.println("City found functional approach 1: " + citiesList.stream()
                .filter(city -> city.equals("fargo"))
                .findAny()
                .isPresent());
        
        // functional approach 2:
        System.out.println("City found functional approach 2: " + citiesList.stream()
                .anyMatch(city -> city.equals("fargo")));
        
        // functional approach 3. Prints the city name:
        citiesList.stream()
                .filter(city -> city.endsWith("columbus"))
                .findAny()
                .ifPresent(city -> System.out.println("City found functional approach 4: " + city));
        
    }
    
    
}
