package com.functiionalprogramming.streamsexamples.optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OptionalEx5 {
    
    final static Optional<String> emptyShip = Optional.empty();
    final static Optional<String> shipName = Optional.of("Adventure of the Seas");

    public static void main(String[] args) {
        optionalOperators();
        testOptionalNullable();
        testOptionalOf();
        testOptionalUsingIFPresent();
        optionalUsingIsPresent();
        optionalUsingFilter();
    }

    public static void optionalOperators() {
        out.println("Non-Empty Optional : " + shipName);  //Non-Empty Optional : Optional[Adventure of the Seas]
        out.println("Non-Empty Optional: shipName value : " + shipName.get());  //Non-Empty Optional: shipName value : Adventure of the Seas
        out.println("Empty Optional: " + Optional.empty()); //Empty Optional: Optional.empty
        out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable("AD")); //ofNullable on Non-Empty Optional: Optional[AD]
        out.println("ofNullable on Empty Optional: " + Optional.ofNullable(null));  //ofNullable on Empty Optional: Optional.empty
    }
    
    /**
     * Optional.ofNullable() doesn't throw an exception
     */
    public static void testOptionalNullable() {
        Optional<String> optionalS = Optional.ofNullable("AD");
        
        assertEquals(Optional.ofNullable("AD"), optionalS);  //pass
        assertEquals(optionalS.get(), "AD");  //pass
        
        assertEquals(optionalS.isPresent(), true);  //pass
        
        Optional<String> optionalS2 = Optional.ofNullable(null);
        System.out.println(optionalS2);   //Optional.empty
    }
    
    /**
     * Optional.of() throws an exception: java.lang.NullPointerException
     * The Optional structure is a container for a value, which can be pulled out with get()
     * <p>
     * Optional container can represent an absent(null) value, there’s also a factory method
     * called empty, and you can convert a nullable value into an Optional using the ofNullable method
     * along with the use of the isPresent method (which indicates whether the Optional is holding a value).
     */
    public static void testOptionalOf() {
        Optional<String> stringOptional = Optional.of(null);
        out.println("Optional.of() Empty: " + stringOptional);  //throws an exception
        
        Optional<String> optionalStr = Optional.of("AD");
        out.println("Optional.of() Non Empty: " + optionalStr);  //Optional[AD]
        
        String stringOptional1 = Optional.of("AD").get();
        out.println("Optional.of().get() Non Empty: " + stringOptional1);  //"AD"
        
        assertEquals(optionalStr.isPresent(), true);  //pass
    }

    public static void testOptionalUsingIFPresent() {
        
        shipName.ifPresent(ship -> System.out.println("Ship name is: " + ship));
        
        //without output
        emptyShip.ifPresent(ship -> System.out.println("Ship name is: " + ship));
        
        // with output
        String ship = emptyShip.orElse("No Ship");
        out.println(ship);
    }
    
    /**
     * One approach to using Optional is to guard any call to get() by checking isPre
     * sent(). A neater approach is to call the orElse method, which provides an alternative
     * value in case the Optional is empty. If creating an alternative value is computationally
     * expensive, the orElseGet method should be used. This allows you to pass in a Suppli
     * er that is called only if the Optional is genuinely empty. Both of these methods are
     * demonstrated
     */
    @Test
    public void optionalElseOrElse() {
        assertEquals("b", emptyShip.orElse("No Ship"));
        assertEquals("c", emptyShip.orElseGet(() -> "No Ship"));
    }
    
    public static void optionalUsingIsPresent() {
        if (shipName.isPresent()) {
            out.println("Ship is Present");
        } else {
            out.println("Ship is not Present");
        }
    }

    public static void optionalUsingFilter() {
        out.println(shipName.filter(ship -> ship.equals("Adventure of the Seas"))); //Optional.empty
        out.println(emptyShip.filter(ship -> ship.equalsIgnoreCase("MALE"))); //Optional.empty
    }
    
}
