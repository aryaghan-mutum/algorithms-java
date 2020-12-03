package com.algorithms.problems.numericalproblems;

import static java.lang.String.format;
import static java.lang.System.out;

public class SquareRoot {

    /**
     * Square root a number version 1
     * @param n
     * @return
     */
    public static double sqrtRootMethod1(double n) {
        
        double low = 0;
        double high = n;
        double mid = 0;
        
        for (int i = 0; i <= 10; i++) {
            
            mid = (low + high) / 2;
            
            if (mid * mid == n)
                return mid;
            if (mid * mid > n)
                high = mid;
            else
                low = mid;
            
            out.println(format("low: %s  high: %s mid: %s", low, high, mid));
        }

        return mid;
    }

    /**
     * Square root a number version 2
     * @param n
     * @return
     */
    public static double sqrtRootMethod2(double n) {
        double start = 0;
        double end = n;
        
        while (start + 1 < end) {
            
            double mid = average(start, (end - start));
            
            if (mid * mid == n)
                return mid;
            else if (mid * mid < n)
                start = mid;
            else
                end = mid;
            
            out.println(format("low: %s  high: %s mid: %s", start, end, mid));
        }
        
        if (end * end == n) return end;

        return start;
    }
    
    private static double average(double x, double y) {
        return x + y / 2;
    }
    
}
