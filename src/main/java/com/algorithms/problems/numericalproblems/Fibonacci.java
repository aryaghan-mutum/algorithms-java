package com.algorithms.problems.numericalproblems;

public class Fibonacci {
    
    public static void main(String[] args) {
        System.out.println(fibonacci(99));
    }
    
    private static int fibonacci(int n) {
        if (n==0) {
            return 0;
        }
        else if (n==1) {
            return 1;
        }
        else if (n < 0) {
            System.out.println("The series must be (n > 1)");
            return n;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}


