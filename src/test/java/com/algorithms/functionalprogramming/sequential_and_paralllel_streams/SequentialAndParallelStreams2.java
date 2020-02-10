package com.algorithms.functionalprogramming.sequential_and_paralllel_streams;

import java.util.stream.LongStream;
import static java.lang.System.out;
import static com.algorithms.functionalprogramming.sequential_and_paralllel_streams.MeasurePerformance.measureSumPerformance;

/**
 * Using LongStream.rangeClosed()
 */
public class SequentialAndParallelStreams2 {
    
    public static long n = 10000000;
    
    public static void main(String[] args) {
        out.println("Sequential Ranged Sum: " + measureSumPerformance(s -> sequentialRangedSum(s), n) + " msecs");
        out.println("Parallel Ranged Sum: " + measureSumPerformance(s -> parallelRangedSum(s), n) + " msecs");
    }
    
    //range(1, 10) -> 1 to 9
    // rangeClosed(1, 10) -> 1 to 10;
    // ~5 msec
    public static long sequentialRangedSum(long n) {
        return LongStream.rangeClosed(1, n)
                .sequential()
                .reduce(0L, Long::sum);
    }
    
    //!0 msces
    public static long parallelRangedSum(long n) {
        return LongStream.rangeClosed(1, n)
                .parallel()
                .reduce(0L, Long::sum);
    }
    
}
