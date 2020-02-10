package com.algorithms.numerical_computation;

public class Factorial {
    
    public static void main(String[] args) {
        
        System.out.println(linearIterativeFactorial(6));
        System.out.println(linearRecursiveFactorial(6));
    }
    
    public static int linearRecursiveFactorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * linearRecursiveFactorial(n - 1);
        }
    }
    
    public static int linearIterativeFactorial(int n) {
        
        return factIter(1, 1, n);
    }
    
    private static int factIter(int product, int count, int maxCount) {
        if(count > maxCount) {
            return product;
        }
        else {
            int z  = count * product;
            count++;
            return factIter(z, count, maxCount);
        }
    }
    
}

