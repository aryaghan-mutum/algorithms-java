package com.algorithms.problems.numericalproblems;

import java.util.stream.IntStream;

public class CreateMultiplicationTable {
    
    public static void main(String[] args) {
        int tableSize = 128;
        printMultiplicationTable(tableSize);
    }
    
    public static void printMultiplicationTable(int tableSize) {
        // first print the top header row
        System.out.format("      ");
        IntStream.range(1, tableSize).forEach(i -> System.out.format("%4d", i));
        System.out.println();
        System.out.println("------------------------------------------");
        
        for (int i = 1; i <= tableSize; i++) {
            // print left most column first
            System.out.format("%4d |", i);
            for (int j = 1; j <= tableSize; j++) {
                System.out.format("%4d", i * j);
            }
            System.out.println();
        }
    }
}
