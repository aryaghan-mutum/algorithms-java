package com.algorithms.functionalprogramming.assertions;

import com.google.common.collect.ImmutableMap;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

public class SoftAssertionsEx1Test {
    
    @Test
    public void testUsingHashMapAndStreams() {
        ImmutableMap<Boolean, String> map = ImmutableMap.<Boolean, String>builder()
                .put(p1(), "P1")
                .put(p2(), "P2")
                .build();
        
        SoftAssertions softAssertions = new SoftAssertions();
        
        map.entrySet().stream().forEach(x ->
                softAssertions.assertThat(x.getKey())
                        .as("some desc").isEqualTo(true));
        
        softAssertions.assertAll();
    }
    
    private boolean p1() {
        return true;
    }
    
    private boolean p2() {
        return true;
    }
    
}
