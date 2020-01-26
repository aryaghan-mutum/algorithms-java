package com.algorithms.functionalprogramming.sequential_and_paralllel_streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class SequentialAndParallelStreams0 {
    
    /**
     * list.stream() operates in a single thread.
     * list.parallelStream() method makes the println statement operate in multiple threads
     * <p>
     * Parallel stream leverage multicore processors, resulting in a substantial increase in performance.
     */
    @Test
    public void streamsExample() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        
        list.stream().forEach(System.out::println);
        
        System.out.println();
        
        list.stream().parallel().forEachOrdered(System.out::println);
    
    
    }
    
}
