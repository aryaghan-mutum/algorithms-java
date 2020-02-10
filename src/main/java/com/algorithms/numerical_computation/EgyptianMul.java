package com.algorithms.numerical_computation;

import com.algorithms.datastructures.list.ImmutableList;

import java.util.HashMap;

public class EgyptianMul {
    
    public static void main(String[] args) {
        System.out.println(egyptianMultiplicationIteration(26, 12));
        System.out.println(egyptianMultiplicationRecursion(26, 12));
    }
    
    public static int egyptianMultiplicationRecursion(int a, int b) {
        if (a == 0) {
            return 0;
        } else if (isEven(a)) {
            return egyptianMultiplicationRecursion(halfNum(a), doubleNum(b));
        } else {
            return b + egyptianMultiplicationRecursion(halfNum(a), doubleNum(b));
        }
    }
    
    public static int egyptianMultiplicationIteration(int a, int b) {
        
        int countA = 1;
        int countB = b;
        
        HashMap mulMap = new HashMap();
        
        while ((doubleNum(countA) < a)) {
            countA = doubleNum(countA);
            countB = doubleNum(countB);
            mulMap.put(1, b);
            mulMap.put(countA, countB);
        }
        
        System.out.println();
        
        return -1;
    }
    
    private static int doubleNum(int n) {
        return n + n;
    }
    
    private static int halfNum(int n) {
        return (n / 2);
    }
    
    private static boolean isEven(int n) {
        return (n % 2 == 0);
    }
}
