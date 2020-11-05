package com.functiionalprogramming.sequentialandparalllelstreams;

import java.util.function.Function;

public class MeasurePerformance {
    
    /**
     * Measuring performance of a function summing the first n numbers
     */
    public static long measureSumPerformance(Function<Long, Long> function, long n) {
        
        long fastest = Long.MAX_VALUE;
        
        for (int i = 0; i < 10; i++) {
            
            long start = System.nanoTime();
            long sum = function.apply(n);
            long duration = (System.nanoTime() - start) / 1_000_000;
            
            // System.out.println("Result: " + sum);
            
            if (duration < fastest) {
                fastest = duration;
            }
        }
        return fastest;
    }
    
}
