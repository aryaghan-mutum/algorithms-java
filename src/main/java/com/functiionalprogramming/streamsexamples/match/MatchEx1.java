package com.functiionalprogramming.streamsexamples.match;

import com.google.common.collect.ImmutableList;
import org.assertj.core.api.SoftAssertions;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Algorithm: Write a method that checks is a particular ship is present in a list
 */
public class MatchEx1 {
    
    static ImmutableList<String> shipsList = ImmutableList.<String>builder()
            .add("Oasis of the Seas", "Allure of the Seas", "Anthem of the Seas", "Navigator of the Seas")
            .build();

    public static void main(String[] args) {
        testIsAnthemOfTheSeasPresentImperativeApproach();
        testIsAnthemOfTheSeasPresentFunctionalApproach1();
        testIsAnthemOfTheSeasPresentFunctionalApproach2();
    }

    /**
     * The procedure iterates each city in a list and when the city=fargo then return true, otherwise false.
     */
    public static void testIsAnthemOfTheSeasPresentImperativeApproach() {
    
        // imperative approach 1:
        boolean isShipFound = false;
        
        for (int i = 0; i < shipsList.size(); i++) {
            if (shipsList.get(i).equals("Anthem of the Seas")) {
                isShipFound = true;
                out.println("Ship found imperative approach 1 " + isShipFound);
            }
        }
    
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(isShipFound).isTrue();
        
        // imperative approach 2:
        out.println("Ship found imperative approach 2 " + shipsList.contains("Anthem of the Seas"));
        softAssertions.assertThat(shipsList.contains("Anthem of the Seas")).isTrue();
        
        softAssertions.assertAll();
    }

    public static void testIsAnthemOfTheSeasPresentFunctionalApproach1() {
        boolean isShipFound = shipsList.stream()
                .filter(city -> city.equals("Anthem of the Seas"))
                .findAny()
                .isPresent();
    
        assertEquals(isShipFound, true);
    }

    public static void testIsAnthemOfTheSeasPresentFunctionalApproach2() {
        boolean isShipFound = shipsList.stream().anyMatch(city -> city.equals("Anthem of the Seas"));
        assertEquals(isShipFound, true);
    }
    
    //  Prints the ship name:
    public static void printShipName() {
        shipsList.stream()
                .filter(city -> city.endsWith("Anthem of the Seas"))
                .findAny()
                .ifPresent(ship -> out.println("Ship found functional approach 4: " + ship));
    }
}
