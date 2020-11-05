package com.functiionalprogramming.streamsexamples.match;

import org.assertj.core.api.SoftAssertions;

import java.util.stream.IntStream;

public class MatchEx5 {

    public static void main(String[] args) {
        testBothApproaches();
        imperativeApproach();
        functionalApproach();
    }

    public static void testBothApproaches() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(imperativeApproach()).isEqualTo(functionalApproach());
        softAssertions.assertAll();
    }
    private static boolean imperativeApproach() {
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                return true;
            }
        }
        return false;
    }
    
    private static boolean functionalApproach() {
        return IntStream.rangeClosed(1, 5).anyMatch(i -> i % 2 == 0);
    }
    
}
