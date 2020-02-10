package com.algorithms.functionalprogramming.miscellaneous;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.google.common.primitives.Ints.asList;
import static java.lang.System.out;

/**
 * Boxing: primitive type into a reference type.
 * Unboxing: reference type into primitive type.
 */
public class BoxingUnBoxingAutoBoxing {
    
    public interface IntPredicate {
        
        boolean test(int t);
    }
    
    public static void main(String[] args) {
        
        int x = 43;
        Integer y = x; // boxing
        
        Integer a = 43;
        int b = a;  //unboxing
        
        Integer i = new Integer(43);
        int t = i;  //unboxing
        
        // no boxing
        IntPredicate evenNumbers = (int n) -> n % 2 == 0;
        out.println(evenNumbers.test(100));
        
        Predicate<Integer> oddNumbers = (Integer n) -> n % 2 == 1;
        out.println(oddNumbers.test(100));
        
        highPerformanceCostImperativeMethod();
        
    }
    
    private static void highPerformanceCostImperativeMethod() {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 300; i <= 500; i++) {
            list.add(i);
        }
    }
    
    @Test
    public void f() {
        asList(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .stream()
                .filter((Integer n) -> n % 2 == 0)
                .collect(Collectors.toList())
                .stream()
                .forEach(System.out::println);
    }
    
    @Test
    public void g() {
        asList(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .stream()
                .mapToInt(n -> n) //Integer -> int //unboxing
                .filter((int n) -> n % 2 == 0)
                .boxed() //int -> Integer // boxing
                .collect(Collectors.toList())
                .stream()
                .forEach(System.out::println);
    }
}
