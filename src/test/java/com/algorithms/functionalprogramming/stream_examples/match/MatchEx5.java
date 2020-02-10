package com.algorithms.functionalprogramming.stream_examples.match;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class MatchEx5 {
    
    @Test
    public void testBothApproaches() {
        
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(imperativeApproach()).isEqualTo(functionalApproach());
        softAssertions.assertAll();
    }
    private boolean imperativeApproach() {
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                return true;
            }
        }
        return false;
    }
    
    private boolean functionalApproach() {
        return IntStream.rangeClosed(1, 5).anyMatch(i -> i % 2 == 0);
    }
    
}
