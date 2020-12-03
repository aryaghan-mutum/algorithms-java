package com.algorithms.problems.numericalproblems;

import static java.lang.System.out;
import static java.util.Arrays.asList;

/**
 * Exercise 1.3. Define a procedure that takes three numbers as arguments and returns the sum of the
 * squares of the two larger numbers.
 */
public class SumOfSquaresLarger {
    
    public static void main(String[] args) {
        out.println(sumoOfSquaresLargerMethod1(2, 3, 4));
        out.println(sumoOfSquaresLargerMethod2(2, 3, 4));
    }
    
    /**
     * Squares all the three nums and adds the sum
     * Finds the min values from the the three nums and square the num
     * Subtracts the value of the sum with the the min val that is squared
     */
    public static int sumoOfSquaresLargerMethod1(int x, int y, int z) {
        int sumOfThreeSqrs = square(x) + square(y) + square(z);
        int minNum = getMinNum(x, y, z);
        int squaredMinNum = square(minNum);
        int sumOfSqrsOfLargerNumbers = sumOfThreeSqrs - squaredMinNum;
        return sumOfSqrsOfLargerNumbers;
    }
    
    public static int sumoOfSquaresLargerMethod2(int x, int y, int z) {
        int minNum = getMinNum(x, y, z);
        
        if (minNum == x)
            return sumOfSqrs(y, z);
        else if (minNum == y)
            return sumOfSqrs(x, z);
        else if (minNum == z)
            return sumOfSqrs(x, y);
        
        return -1;
    }
    
    public static int square(int n) {
        return n * n;
    }
    
    public static int sumOfSqrs(int sq1, int sq2) {
        return square(sq1) + square(sq2);
    }
    
    private static int getMinNum(int x, int y, int z) {
        return asList(x, y, z)
                .stream()
                .min(Integer::compare)
                .get();
    }
    
    
}

