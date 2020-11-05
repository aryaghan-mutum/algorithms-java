package com.functiionalprogramming.streamsexamples;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

/**
 * @author Anurag Muthyam
 */

/**
 * This class introduces sorted(), mapToInt() operations.
 * <p>
 * mapToInt() ->
 */

public class StreamsLesson5 {
    
    public static void main(String[] args) {
        
        final List<King> kingList = Arrays.asList(
                new King("Rob", 27),
                new King("Ned", 48),
                new King("Tywin", 65),
                new King("Joffrey", 17));
        
        
        sortByName(kingList);
        sortByAge(kingList);
        
        // Total kings:
        System.out.println("Total kings: " + kingList.stream()
                .mapToInt(King::getAge).count());
        
        OptionalInt age = kingList.stream()
                .mapToInt(King::getAge)
                .max();
        
        System.out.println("Max: " + age);
    }
    
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class King {
        
        private String name;
        private int age;
        
        public int ageDifference(King kingAge) {
            return age - kingAge.age;
        }
    }
    
    public static void sortByName(List<King> kingList) {
        
        // get name
        kingList.stream()
                .map(King::getName)
                .forEach(k -> System.out.println("King's name: " + k));
        
        kingList.stream()
                .sorted((king1, king2) -> king1.getName().compareTo(king2.getName()))
                .forEach(k -> System.out.println("King's names: approach 1: " + k));
        
        kingList.stream()
                .sorted(Comparator.comparing(King::getName))
                .forEach(k -> System.out.println("King's names: approach 2:" + k));
        
        // sort names using Collectors.groupingBy
        System.out.println("Age of Kings using groupingBy() 2: " + kingList.stream()
                .collect(
                        Collectors.groupingBy(King::getAge,
                                Collectors.mapping(King::getName,
                                        Collectors.toList()))));
    }
    
    public static void sortByAge(List<King> kingList) {
        
        // sort
        kingList.stream()
                .sorted(King::ageDifference)
                .forEach(k -> System.out.println("King's age difference approach 1: " + k));
        
        // sort
        kingList.stream()
                .sorted((king1, king2) -> king1.ageDifference(king2))
                .forEach(k -> System.out.println("King's age difference approach 2: " + k));
        
        
        // sort the ages in descending order
        Comparator<King> compareAscending = (king1, king2) -> king1.ageDifference(king1);
        kingList.stream()
                .sorted(compareAscending)
                .forEach(k -> System.out.println("Sorted in a ascending:" + k));
        
        // sort the ages in descending order
        Comparator<King> compareDescending = compareAscending.reversed();
        kingList.stream()
                .sorted(compareDescending)
                .forEach(k -> System.out.println("Sorted in descending order:" + k));
        
        // sort ages using Collectors.groupingBy
        System.out.println("Age of Kings using groupingBy(): " + kingList.stream()
                .filter(age -> age.getAge() > 20)
                .collect(Collectors.groupingBy(King::getAge)));
        
        
        // get age
        kingList.stream()
                .map(King::getAge)
                .forEach(k -> System.out.println("King's age: " + k));
        
        // Sum of all the ages of the kings
        System.out.println("Sum of all the ages of the kings: " + kingList.stream()
                .mapToInt(King::getAge).sum());
        
        // Max age of the king:
        System.out.println("Max age of the king: " + kingList.stream()
                .mapToInt(King::getAge).max());
        
        // Min age of the king:
        System.out.println("Min age of the king: " + kingList.stream()
                .mapToInt(King::getAge).min());
        
    }
    
}
