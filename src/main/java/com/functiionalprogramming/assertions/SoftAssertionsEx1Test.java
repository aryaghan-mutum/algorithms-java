package com.functiionalprogramming.assertions;

import com.google.common.collect.ImmutableMap;
import org.assertj.core.api.SoftAssertions;

public class SoftAssertionsEx1Test {

    public static void main(String[] args) {
        testUsingHashMapAndStreamsApproach1();
    }

    public static void testUsingHashMapAndStreamsApproach1() {
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

    private static ImmutableMap<String,Boolean> getBooleanStringImmutableMap() {
        return ImmutableMap.<String, Boolean>builder()
                    .put("P1", p1())
                    .put("P2", p2())
                    .build();
    }

    private static boolean p1() {
        return true;
    }

    private static boolean p2() {
        return true;
    }

}
