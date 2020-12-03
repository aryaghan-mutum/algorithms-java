package com.algorithms.problems.numericalproblems;

/**
 * @author Anurag Muthyam
 */
public class Multiplication {

    /**
     * Multiply two numbers. Time Complexity : O(log n)
     * note: only works for positive number
     * @param n
     * @param m
     * @return
     */
    public static int multiply(int n, int m) {
        int ans = 0;
        int count = 0;
        while (m > 0) {
            if (m % 2 == 1)
                ans += n << count;
            count++;
            m /= 2;
        }
        
        return ans;
    }
}
