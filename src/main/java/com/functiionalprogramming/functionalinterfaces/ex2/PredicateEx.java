package com.functiionalprogramming.functionalinterfaces.ex2;

import java.util.Arrays;
import java.util.function.Predicate;

import static java.lang.System.out;

/**
 * list = (1,2,3,4,5) total 5
 * filter(list) < 5
 */

/**
 * SRP
 * if (condtion) {
 * consequent
 * }
 * else {
 * alternative
 * }
 */

public class PredicateEx implements Predicate<Integer> {
 
    //a1
    @Override
    public boolean test(Integer integer) {
        if (integer % 2 == 0) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        
        Predicate<Integer> predicate1 = i -> i % 2 == 0;
        
        approach1();
        approach2();
        approach3(predicate1);
        
        predicateExample1(predicate1);
        predicateExample2();
    }
    
    private static void approach1() {
        Predicate<Integer> predicate = new PredicateEx();
        out.println(predicate.test(40));
        out.println(predicate.test(41));
    }
    
    private static void approach2() {
        Predicate<Integer> integerPredicate = i -> {
            if (i % 2 == 0) {
                return true;
            }
            return false;
        };
        
        out.println(integerPredicate.test(40));
        out.println(integerPredicate.test(41));
    }
    
    private static void approach3(Predicate<Integer> predicate1) {
        out.println(predicate1.test(40));
        out.println(predicate1.test(41));
    }
    
    private static void predicateExample1(Predicate<Integer> predicate1) {
        Arrays.asList(1, 2, 3, 4, 5).stream()
                .filter(predicate1)
                .forEach(x -> System.out.println("Even #: " + x));
    }
    
    private static void predicateExample2() {
        Arrays.asList(1, 2, 3, 4, 5).stream()
                .filter(i -> i % 2 == 0)
                .forEach(x -> System.out.println("Even #: " + x));
    }
}


