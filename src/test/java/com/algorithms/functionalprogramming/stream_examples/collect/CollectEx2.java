package com.algorithms.functionalprogramming.stream_examples.collect;

import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import java.util.stream.Collectors;

import static com.utils.Constants.citiesList;
import static com.utils.Constants.numbers;
import static java.util.stream.Collectors.toList;

public class CollectEx2 {
    
    @Test
    public void func() {
        numbers.stream()
                .filter(n -> n > 3)
                .map(n -> n * 2)
                .sorted()
                .collect(toList())
                .stream()
                .forEach(out::println); //[864, 1200, 1464, 2424, 2866, 86868648]
    }
    
    @Test
    public void func2() {
        out.println(citiesList.stream()
                .sorted()
                .map(String::toUpperCase)
                .collect(Collectors.groupingBy(String::hashCode)));
        
        //{159197032=[COLUMBUS], 66663967=[FARGO], -139784416=[SAN FRANCISCO], 73350785=[MIAMI]}
    }
    
    @Test
    public void func3() {
        out.println(numbers.stream()
                .sorted()
                .filter(n -> n > 3)
                .collect(Collectors.averagingInt(n -> n)));   //7239788.833333333
    }
    
}
