package com.algorithms.numerical_computation;

public class MultiplicationTable {
    
    public static void main(String[] args) {
        int number = 7;
        
        printMultiplicationTable(number);
    }
    
    private static void printMultiplicationTable(int n) {
        System.out.println("Multiplication table for "+n);
        System.out.println("---------------------------");
        for(int i = 1; i<=10;i++) {
            System.out.format("%2d x %d = %3d\n", i,n,i*n);
        }
    }
    
}
