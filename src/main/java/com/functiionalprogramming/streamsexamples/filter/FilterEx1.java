package com.functiionalprogramming.streamsexamples.filter;

import com.google.common.collect.ImmutableList;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Algorithm:
 * The code is repeating in test1() an test2()
 * How do you reduce the repeated code using Predicate<T> functional interface and <lambda expressions
 */

public class FilterEx1 {
    final static ImmutableList<String> shipsList = ImmutableList.<String>builder()
            .add("Oasis of the Seas", "Allure of the Seas", "Anthem of the Seas", "Navigator of the Seas")
            .build();

    public static void main(String[] args) {
        testAnthemOfTheSeasIsPresent();
        testOasisOfTheSeasIsPresent();
        test3();
        test4();
    }

    // Not Advised ->
    public static void testAnthemOfTheSeasIsPresent() {
        boolean isShipPresent = shipsList.stream()
                .filter(ship -> ship.equals("Anthem of the Seas"))
                .findAny()
                .isPresent();
    
        assertEquals(isShipPresent, true);
    }

    public static void testOasisOfTheSeasIsPresent() {
        boolean isShipPresent = shipsList.stream()
                .filter(ship -> ship.equals("Oasis of the Seas"))
                .findAny()
                .isPresent();
    
        assertEquals(isShipPresent, true);
    }
    
    // Advised ->
    public static void test3() {
        helperMethod(ship -> ship.equals("Anthem of the Seas"));
    }

    public static void test4() {
        helperMethod(ship -> ship.equals("Oasis of the Seas"));
    }
    
    /**
     * .filter(predicate).findAny().isPresent() can be replaced by anyMatch()
     */
    private static void helperMethod(Predicate<String> predicate) {
        boolean isShipPresent = shipsList.stream()
                .filter(predicate)
                .findAny()
                .isPresent();
    
        assertEquals(isShipPresent, true);
    }
    
}

