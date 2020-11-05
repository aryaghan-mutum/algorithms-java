package com.functiionalprogramming.sequentialandparalllelstreams;

import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import java.util.List;

import static java.util.Arrays.asList;

public class SequentialAndParallelStreams0 {
    
    /**
     * list.stream() operates in a single thread.
     * list.parallelStream() method makes the println statement operate in multiple threads
     * <p>
     * Parallel stream leverage multicore processors, resulting in a substantial increase in performance.
     */
    @Test
    public void streamsExample() {
        List<Integer> list = asList(1, 2, 3, 4, 5);
        
        list.stream().forEach(out::println);
        
        out.println();
        
        list.stream().parallel().forEachOrdered(out::println);
    
    
    }
    
}
