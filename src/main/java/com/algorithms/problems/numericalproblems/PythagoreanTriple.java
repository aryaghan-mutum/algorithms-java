package com.algorithms.problems.numericalproblems;

/**
 * @author Anurag Muthyam
 * triplet: a^2 + b^2 = c^2
 */
public class PythagoreanTriple {

    public static void main(String args[]) {
        pythagoreanTriplets(20);
    }

    public static void pythagoreanTriplets(int limit) {
        int a, b, c = 0;

        int m = 2;
        while (c < limit) {

            for (int n = 1; n < m; ++n) {
                a = m * m - n * n;
                b = 2 * m * n;
                c = m * m + n * n;

                if (c > limit)
                    break;

                System.out.println(a + " " + b + " " + c);
            }
            m++;
        }
    }
}
