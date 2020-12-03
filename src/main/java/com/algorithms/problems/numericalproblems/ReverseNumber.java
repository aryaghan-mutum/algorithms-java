package com.algorithms.problems.numericalproblems;

public class ReverseNumber {

    /**
     * Reverse an integer using Imperative approach
     *
     * @param num
     * @return
     */
    public static int reverseNumber(int num) {
        int reverse = 0;

        while (num != 0) {
            int a = num % 10;
            reverse = reverse * 10 + a;
            num = num / 10;
        }

        return reverse;
    }

}
