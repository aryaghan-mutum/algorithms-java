package com.functiionalprogramming.streamsexamples.primitive_streams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class IntStreamEx1 {

    /**
     * Not Advised:
     */
    @Test
    public void testCountImperativeApproach() {
        
        List<String> lst = asList("a", "b", "c");
        int count = 0;
        for (int i = 1; i <= lst.size(); i++) {
            count = count + 1;
        }
        
        Assertions.assertEquals(count, 3);
    }
    
    /**
     * Advised:
     */
    @Test
    public void testCountDeclarativeApproach() {
        long count = Stream.of("a", "b", "c").count();
        Assertions.assertEquals(count, 3);
    }
}
