package com.algorithms.problems.numericalproblems;

/**
 * @author Anurag Muthyam
 */
public class Factorial {

    /**
     * Factorial using recurisve process
     *
     * @param n
     * @return
     */
    public static int factorialRecursiveProcess(int n) {
        if (n == 1)
            return 1;
        else
            return n * factorialRecursiveProcess(n - 1);
    }

    /**
     * Factorial using iterative process
     *
     * @param n
     * @return
     */
    public static int factorialIterativeProcess(int n) {
        return factIter(1, 1, n);
    }

    private static int factIter(int product, int count, int maxCount) {
        if (count > maxCount) {
            return product;
        } else {
            int z = count * product;
            count++;
            return factIter(z, count, maxCount);
        }
    }

}

