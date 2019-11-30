package com.algorithms.streams.operations.operators;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static utils.Constants.citiesList;
import static utils.Constants.numbers;

public class StreamsCollect {
    
    public static void main(String[] args) {
    
        func();
        func2();
        func3();
    
        collectNumbersImperativeApproach();
        collectNumbersFunctionalApproach();
    
    }
    
    public static void func() {
        
        List<Integer> numList = numbers.stream()
                .filter(n -> n > 3)
                .map(n -> n * 2)
                .sorted()
                .collect(Collectors.toList());
    
        numList.forEach(System.out::println); //[864, 1200, 1464, 2424, 2866, 86868648]
    }
    
    public static void func2() {
    
        System.out.println(citiesList.stream()
                .sorted()
                .map(String::toUpperCase)
                .collect(Collectors.groupingBy(String::hashCode)));
        
        //{159197032=[COLUMBUS], 66663967=[FARGO], -139784416=[SAN FRANCISCO], 73350785=[MIAMI]}
    }
    
    public static void func3() {
    
        System.out.println(numbers.stream()
                .sorted()
                .filter(n -> n > 3)
                .collect(Collectors.averagingInt(n -> n)));   //7239788.833333333
    }
    
    // Not Advised -> Imperative Approach: Iterates each element and collects elements in a new list
    private static List<Integer> collectNumbersImperativeApproach() {
        List<Integer> tempList = new ArrayList<>();
        for (Integer n : numbers) {
            if (n > 3) {
                n = n * 2;
                tempList.add(n);
            }
        }
        return tempList;
    }
    
    // Advised -> Functional Approach: Doesn't need a new list to store data.
    public static List<Integer> collectNumbersFunctionalApproach() {
        return numbers.stream()
                .filter(n -> n > 3)
                .map(n -> n * 2)
                .collect(Collectors.toList());
    }
    
    
}
