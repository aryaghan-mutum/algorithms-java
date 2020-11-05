package com.functiionalprogramming.functionalinterfaces.ex2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;

import static java.lang.System.out;

public class ConsumerEx {
    
    //a1
//    @Override
//    public void accept(Integer integer) {
//        System.out.println("integer is: " + integer);
//    }
    
    public static void main(String[] args) {
        
        Consumer<Integer> consumer = i -> System.out.println("Integer is: " + i);
        
        approach2(consumer);
        approach3(consumer);
        
        imperativeApproach();
    }
    
    private static void approach2(Consumer<Integer> consumer) {
        consumer.accept(100);
    }
    
    private static void approach3(Consumer<Integer> consumer) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().forEach(consumer); //internal iterator
    }
    
    private static void imperativeApproach() {
        IntStream.rangeClosed(1, 5).forEach(i -> out.println("Imperative Approach: " + i));
    }
    
}

