package com.algorithms.functionalprogramming.assertions;

import com.google.common.collect.ImmutableMap;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

public class SoftAssertionsEx1Test {
    
    @Test
    public void testUsingHashMapAndStreamsApproach1() {
        SoftAssertions softAssertions = new SoftAssertions();
    
        getBooleanStringImmutableMap()
                .entrySet()
                .stream()
                .forEach(x -> softAssertions
                        .assertThat(x.getValue())
                        .as(x.getKey())
                        .isEqualTo(true));
        
        softAssertions.assertAll();
    }
    
    private ImmutableMap<String,Boolean> getBooleanStringImmutableMap() {
        return ImmutableMap.<String, Boolean>builder()
                    .put("P1", p1())
                    .put("P2", p2())
                    .build();
    }
    
    private boolean p1() {
        return true;
    }
    
    private boolean p2() {
        return true;
    }
    
}
