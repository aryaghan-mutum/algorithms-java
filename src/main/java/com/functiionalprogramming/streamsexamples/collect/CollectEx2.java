package com.functiionalprogramming.streamsexamples.collect;

import static java.lang.System.out;
import java.util.stream.Collectors;

import static com.utils.Constants.citiesList;
import static com.utils.Constants.numbers;
import static java.util.stream.Collectors.toList;

public class CollectEx2 {

    public static void main(String[] args) {
        func();
        func2();
    }

    public static void func() {
        numbers.stream()
                .filter(n -> n > 3)
                .map(n -> n * 2)
                .sorted()
                .collect(toList())
                .stream()
                .forEach(out::println); //[864, 1200, 1464, 2424, 2866, 86868648]
    }

    public static void func2() {
        out.println(citiesList.stream()
                .sorted()
                .map(String::toUpperCase)
                .collect(Collectors.groupingBy(String::hashCode)));
        
        //{159197032=[COLUMBUS], 66663967=[FARGO], -139784416=[SAN FRANCISCO], 73350785=[MIAMI]}
    }

    public static void func3() {
        out.println(numbers.stream()
                .sorted()
                .filter(n -> n > 3)
                .collect(Collectors.averagingInt(n -> n)));   //7239788.833333333
    }
    
}
