package com.algorithms.problems.numericalproblems;

/**
 * @author Anurag Muthyam
 */
public class Fibonacci {

    /**
     *
     * @param n
     * @return
     * @throws Exception
     */
    public static int fibonacci(int n) throws Exception {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else if (n < 0) {
            throw new Exception("The series must be (n > 1)");
        } else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}


