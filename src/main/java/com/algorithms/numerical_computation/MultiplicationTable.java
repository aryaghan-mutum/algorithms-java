package com.algorithms.numerical_computation;

import java.util.stream.IntStream;

public class MultiplicationTable {
    
    public static void main(String[] args) {
        int number = 7;
        printMultiplicationTable(number);
    }
    
    private static void printMultiplicationTable(int n) {
        System.out.println("Multiplication table for " + n);
        System.out.println("---------------------------");
        IntStream.rangeClosed(1, 10).forEach(i -> System.out.format("%2d x %d = %3d\n", i, n, i * n));
    }
    
}
