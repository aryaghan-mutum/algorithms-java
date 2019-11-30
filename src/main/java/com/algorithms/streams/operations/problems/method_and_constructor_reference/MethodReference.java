package com.algorithms.streams.operations.problems.method_and_constructor_reference;

import java.util.Comparator;

import static utils.Constants.citiesList;
import static utils.Constants.numbersList;

/**
 * While using method reference, make sure that Class or object comes before :: operator
 * A static or instance method comes after the :: operator
 * <p>
 * Three essential circumstances:
 * 1. object::instanceMethod Ex: System.out::println or (city -> System.out.println(city)
 * 2. Class:staticMethod     Ex: math::pow or (a, b) -> math.pow(a, b)
 * 3. Class::instanceMethod  Ex: String::toLowerCase or (a, b) -> a.toLowerCase(b)
 */

class Number {
    
    public int quadrupleTheNum(int n) {
        return n * 4;
    }
}

public class MethodReference extends Number {
    
    public static void main(String[] args) {
        
        printCities();
        
        // invoking static method
        methodReferenceOnStaticMethod();
        
        // invoking instance method
        new MethodReference().methodReferenceOnInstanceMethod();
        
        // invoking instance method inheriting from Number class
        new MethodReference().methodReferenceOnInstanceMethodUsingSuper();
    }
    
    /**
     * print cities using lambda expressions and method reference
     */
    public static void printCities() {
        // using lambda expression:
        citiesList.stream().forEach((city -> System.out.println(city)));
        
        // using method reference:
        citiesList.stream().forEach(System.out::println);
    }
    
    /**
     * Using class name: MethodReference to invoke a static method: doubleTheNum
     */
    public static void methodReferenceOnStaticMethod() {
        numbersList.stream()
                .sorted(Comparator.reverseOrder())
                .filter(n -> n > 3)
                .filter(n -> n % 2 == 0)
                .map(MethodReference::doubleTheNum) // .map(n -> doubleTheNum(n))
                .forEach(System.out::println);
    }
    
    /**
     * Using this to invoke an instance method (non-static method): tripleTheNum
     */
    public void methodReferenceOnInstanceMethod() {
        numbersList.stream()
                .sorted(Comparator.reverseOrder())
                .filter(n -> n > 3)
                .filter(n -> n % 2 == 0)
                .map(this::tripleTheNum)   // .map(n -> tripleTheNum(n))
                .forEach(System.out::println);
    }
    
    /**
     * Using super to invoke an instance method (non-static method): quadrupleTheNum
     */
    public void methodReferenceOnInstanceMethodUsingSuper() {
        numbersList.stream()
                .sorted(Comparator.reverseOrder())
                .filter(n -> n > 3)
                .filter(n -> n % 2 == 0)
                .map(super::quadrupleTheNum)   // .map(n -> quadrupleTheNum(n))
                .forEach(System.out::println);
    }
    
    public static int doubleTheNum(int n) {
        return n * 2;
    }
    
    public int tripleTheNum(int n) {
        return n * 3;
    }
    
    
}
