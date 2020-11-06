package com.functiionalprogramming.streams.operations.problems;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.utils.Constants.numbersList;
import static java.lang.System.out;

public class StreamsExamples3 {
    
    public static void main(String[] args) {
        doubleEvenNums();
        doubleEvenNumsAndSum();
        findSqrtOfEvenNums();
        findSqrtOfEvenNumsAndSum();
        func();
    }
    
    public static void doubleEvenNums() {
        numbersList.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .forEach(System.out::println);
    }
    
    public static void doubleEvenNumsAndSum() {
        out.println(numbersList.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * 2)
                .sum());
    }
    
    public static void findSqrtOfEvenNums() {
        numbersList.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> Math.sqrt(n))
                .forEach(out::println);
    }
    
    public static void findSqrtOfEvenNumsAndSum() {
        out.println(numbersList.stream()
                .filter(n -> n % 2 == 0)
                .mapToDouble(n -> Math.sqrt(n))
                .sum());
    }
    
    public static void func() {
        
        int res = 0;
        // imperative approach:
        ArrayList<Integer> newList = new ArrayList<>();
        
        for (int i = 0; i < numbersList.size(); i++) {
            if (i > 5 && i % 2 == 0) {
                res = i * 2;
                newList.add(i * 2);
            }
        }
        out.println("Imperative approach:" + newList);
        
        out.println(numbersList.stream()
                .filter(n -> n > 5 && n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList()));
        
        out.println(numbersList.stream()
                .filter(n -> n > 5 && n % 2 == 0)
                .map(n -> n * 2)
                .findAny());
        
        out.println(numbersList.stream()
                .filter(n -> n > 5 && n % 2 == 0)
                .map(n -> n * 2)
                .findAny());
        
        Stream x = Stream.iterate(100, n -> n + 1);
        out.println(x);
    }
    
    
}
