package com.algorithms.numerical_computation;

import static java.lang.System.out;

public class PrimitiveOperators {
    
    public static void main(String[] args) {
        
        out.println("Sum of 2 integers Iteration: " + addIntIter(2, 3));
        out.println("Sum of 2 integers Recursion: " + addIntRec(2, 3));
        
        out.println("Mul of 2 integers Iteration: " + mulIntIter(2, 3));
        out.println("Mul of 2 integers Recursion: " + mulIntRec(2, 3));
    }
    
    /**
     * Add two integers using recursion
     */
    public static int addIntRec(int a, int b) {
        if (a == 0) {
            return b;
        } else {
            return addIntRec(sub1(a), add1(b));
        }
    }
    
    private static int sub1(int n) {
        return n - 1;
    }
    
    private static int add1(int n) {
        return n + 1;
    }
    
    /**
     * Add two integers using iteration
     */
    public static int addIntIter(int a, int b) {
        
        while (a != 0) {
            a = a - 1;
            b = b + 1;
        }
        return b;
    }
    
    /**
     * Multiply two integers using iteration
     */
    public static int mulIntIter(int a, int b) {
        
        int count = 0;
        
        while (b != 0) {
            b = b - 1;
            count = count + a;
        }
        return count;
    }
    
    /**
     * Multiply two integers using recursion
     */
    public static int mulIntRec(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a + mulIntRec(a, b - 1);
        }
    }
    
}
