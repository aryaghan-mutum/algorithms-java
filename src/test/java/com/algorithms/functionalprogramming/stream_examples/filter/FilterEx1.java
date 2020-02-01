package com.algorithms.functionalprogramming.stream_examples.filter;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Algorithm:
 * The code is repeating in test1() an test2()
 * How do you reduce the repeated code using Predicate<T> functional interface and <lambda expressions
 */

public class FilterEx1 {
    final ImmutableList<String> shipsList = ImmutableList.<String>builder()
            .add("Oasis of the Seas", "Allure of the Seas", "Anthem of the Seas", "Navigator of the Seas")
            .build();
    
    // Not Advised ->
    @Test
    public void testAnthemOfTheSeasIsPresent() {
        boolean isShipPresent = shipsList.stream()
                .filter(ship -> ship.equals("Anthem of the Seas"))
                .findAny()
                .isPresent();
    
        assertEquals(isShipPresent, true);
    }
    
    @Test
    public void testOasisOfTheSeasIsPresent() {
        boolean isShipPresent = shipsList.stream()
                .filter(ship -> ship.equals("Oasis of the Seas"))
                .findAny()
                .isPresent();
    
        assertEquals(isShipPresent, true);
    }
    
    // Advised ->
    
    @Test
    public void test3() {
        helperMethod(ship -> ship.equals("Anthem of the Seas"));
    }
    
    @Test
    public void test4() {
        helperMethod(ship -> ship.equals("Oasis of the Seas"));
    }
    
    /**
     * .filter(predicate).findAny().isPresent() can be replaced by anyMatch()
     */
    private void helperMethod(Predicate<String> predicate) {
        boolean isShipPresent = shipsList.stream()
                .filter(predicate)
                .findAny()
                .isPresent();
    
        assertEquals(isShipPresent, true);
    }
    
}

