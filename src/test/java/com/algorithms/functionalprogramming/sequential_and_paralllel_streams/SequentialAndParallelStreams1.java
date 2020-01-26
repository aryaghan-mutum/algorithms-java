package com.algorithms.functionalprogramming.sequential_and_paralllel_streams;

import java.util.stream.Stream;

import static com.algorithms.functionalprogramming.sequential_and_paralllel_streams.MeasurePerformance.measureSumPerformance;

/**
 * Using Stream.iterate()
 * <p>
 * define reduce(lst) {
 * return x
 * }
 */

/**
 * For instance, before Java 7, processing a collection of data in parallel was extremely cumbersome.
 * First, you needed to explicitly split the data structure containing your data into subparts.
 * Second, you needed to assign each of these subparts to a different thread.
 * Third, you needed to synchronize them opportunely to avoid unwanted race conditions,
 * wait for the completion of all threads, and finally combine the partial results.
 */
public class SequentialAndParallelStreams1 {
    
    public static long n = 10_000_000;
    
    public static void main(String[] args) {
        System.out.println("Sequential sum done in: " + measureSumPerformance(SequentialAndParallelStreams1::sequentialSum, n) + " msecs");
        System.out.println("Parallel sum done in: " + measureSumPerformance(SequentialAndParallelStreams1::parallelSum, n) + " msecs");
    }
    
    
    //86 msec
    public static long sequentialSum(final long n) {
        return Stream.iterate(1L, i -> i + 1)
                .limit(n)
                .reduce(0L, (i, j) -> Long.sum(i, j));  // Long.sum(i, j)
    }
    
    //114 msec
    public static long parallelSum(final long n) {
        return Stream.iterate(1L, i -> i + 1)
                .limit(n)
                .parallel()
                .reduce(0L, Long::sum);
    }
    
}
