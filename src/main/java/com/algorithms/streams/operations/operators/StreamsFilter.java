package com.algorithms.streams.operations.operators;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamsFilter {
    
    public static void main(String[] args) {
        
        f();
        f2();
    }
    
    public static void f() {
        
        temp(city -> city.equals("columbus"));
    }
    
    public static void f2() {
        
        temp(city -> city.equals("fargo"));
    }
    
    public static void temp(Predicate<String> predicate) {
        List<String> citiesList = Arrays.asList("miami", "columbus", "san francisco", "fargo");
        
        System.out.println(citiesList.stream()
                .filter(predicate)
                .findAny()
                .isPresent());
    }
    
}
