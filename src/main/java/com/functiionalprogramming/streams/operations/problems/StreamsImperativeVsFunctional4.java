package com.functiionalprogramming.streams.operations.problems;

import java.util.ArrayList;
import java.util.List;

import static com.utils.Constants.citiesList;
import static com.utils.Constants.doubleNumbersList;
import static java.lang.System.out;
import static java.util.stream.Collectors.toList;

public class StreamsImperativeVsFunctional4 {
    
    public static void main(String[] args) {
        deleteEmptyString();
        
        getSquares();
        getSum();
    }
    
    public static void deleteEmptyString() {
        
        // imperative approach:
        List<String> newList = new ArrayList<String>();
        
        for (String city : citiesList) {
            if (!city.isEmpty()) {
                newList.add(city);
            }
        }
        
        out.println("delete empty String in imperative approach: " + newList);
        
        //functional approach:
        out.println("delete empty String in functional approach: " + citiesList
                .stream()
                .filter(city -> !city.isEmpty())
                .collect(toList()));
    }
    
    
    private static void getSquares() {
        
        // imperative approach:
        List<Double> squaresList = new ArrayList<Double>();
        
        for (Double number : doubleNumbersList) {
            Double square = new Double(number.intValue() * number.intValue());
            
            if (!squaresList.contains(square)) {
                squaresList.add(square);
            }
        }
        out.println("Square the numbers in imperative approach: " + squaresList);
        
        
        //functional approach:
        out.println("Square the numbers in functional approach: " + doubleNumbersList.stream()
                .map(num -> num * num)
                .distinct()
                .collect(toList()));
    }
    
    
    public static void getSum() {
        
        // imperative approach:
        double sum = 0;
        for (int i = 0; i < doubleNumbersList.size(); i++) {
            
            if (!doubleNumbersList.isEmpty()) {
                sum = sum + doubleNumbersList.get(i);
            }
        }
        out.println("sum the numbers imperative approach: " + sum);
        
        
        // functional approach 1:
        out.println("Sum in Functional approach 1: " + doubleNumbersList.stream()
                .mapToDouble(n -> n)
                .sum());
        
        // functional approach 2:
        out.println("Sum in Functional approach 2: " + doubleNumbersList.stream()
                .reduce(0.0, (total, n) -> Double.sum(total, n)));
        
        // functional approach 3:
        out.println("Sum in Functional approach 3: " + doubleNumbersList.stream()
                .reduce((a, b) -> a + b));
        
        // functional approach 4:
        out.println("Sum in Functional approach 4: " + doubleNumbersList.stream()
                .reduce(0.0, Double::sum));
    }
    
}
