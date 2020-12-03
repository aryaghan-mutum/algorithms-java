package com.algorithms.problems.numericalproblems;

/**
 * @author Anurag Muthyam
 */
public class Division {

    /**
     * Driver program without using / operator
     *
     * @param num1
     * @param num2
     * @return
     */
    public static int division(int num1, int num2) {
        if (num1 == 0)
            return 0;
        if (num2 == 0)
            return Integer.MAX_VALUE;

        boolean negResult = false;

        // Handling negative numbers
        if (num1 < 0) {
            num1 = -num1;
            if (num2 < 0)
                num2 = -num2;
            else
                negResult = true;
        } else if (num2 < 0) {
            num2 = -num2;
            negResult = true;
        }

        // if num1 is greater than equal to num2
        // subtract num2 from num1 and increase
        // quotient by one.
        int quotient = 0;
        while (num1 >= num2) {
            num1 = num1 - num2;
            quotient++;
        }

        // checking if neg equals to 1 then making
        // quotient negative
        if (negResult)
            quotient = -quotient;
        return quotient;
    }


}
