package com.algorithms.functionalprogramming.miscellaneous;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class StreamGenerateVsIterate {
    
    @Test
    public void generate() {
        Stream.generate(() -> "Allure of the Seas")
                .limit(4)
                .forEach(System.out::println);
    }
    
    @Test
    public void iterate() {
        Stream.iterate(0, n -> n + 1)
                .limit(4)
                .forEach(System.out::println);
    }
    
}
