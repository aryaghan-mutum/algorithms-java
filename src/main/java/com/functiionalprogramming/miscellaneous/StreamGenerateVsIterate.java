package com.functiionalprogramming.miscellaneous;

import java.util.stream.Stream;

public class StreamGenerateVsIterate {

    public static void main(String[] args) {
        generate();
        iterate();
    }

    public static void generate() {
        Stream.generate(() -> "Allure of the Seas")
                .limit(4)
                .forEach(System.out::println);
    }

    public static void iterate() {
        Stream.iterate(0, n -> n + 1)
                .limit(4)
                .forEach(System.out::println);
    }
    
}
