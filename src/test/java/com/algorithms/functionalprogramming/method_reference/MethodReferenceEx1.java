package com.algorithms.functionalprogramming.method_reference;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import static com.google.common.primitives.Ints.asList;
import static java.lang.System.out;

/**
 * Case 1: Reference to Static method: Use class name to call a static method. Ex: ClassName::staticMethod
 * Case 2: Reference to Instance method: Use this keyword to call an instance method Ex: object::instanceMethod
 * Case 3: Reference to Constructor: Use super keyword to call an instance method
 */

public class MethodReferenceEx1 {
    
    final List<String> shipList = Arrays.asList("al", "ad", "oa", "sy");
    final static List<Integer> numbersList = asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    
    @Test
    public void testShipList() {
        shipList.stream().forEach(n -> System.out.println(n));
        shipList.stream().forEach(System.out::println);
    }
    
    @Test
    public void methodRef() {
        
        numbersList.parallelStream()
                .filter(MethodReferenceEx1::numbersGreaterThan3)  //inter
                .filter(MethodReferenceEx1::isEven)
                .map(this::doubleNumber)  //inter
                .sorted(Comparator.reverseOrder()) //inter
                .forEach(out::println);  //terminal
    }
    
    private static boolean numbersGreaterThan3(int n) {
        return n > 3;
    }
    
    private static boolean isEven(int n) {
        return n % 2 == 0;
    }
    
    Predicate<Integer> predicate = n -> n % 2 == 0;
    
    private int doubleNumber(int n) {
        return n * 2;
    }
    
}
