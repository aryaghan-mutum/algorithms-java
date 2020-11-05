package com.functiionalprogramming.streamsexamples.optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.Properties;

public class OptionalEx3 {

    @Test
    public void testKeyValuePairs() {
        Properties properties = new Properties();
        
        properties.setProperty("a", "5");
        properties.setProperty("b", "true");
        properties.setProperty("c", "-3");
        
        Assertions.assertEquals(5, method1(properties, "a"));
        Assertions.assertEquals(0, method1(properties, "b"));
        Assertions.assertEquals(0, method1(properties, "c"));
    }
    
    private int method1(Properties properties, String name) {
        String value = properties.getProperty(name);
        
        if (value != null) {
            try {
                int i = Integer.parseInt(value); //flatMap
                
                if (i > 0) {  //filter()
                    return i;
                }
            } catch (NumberFormatException e) {
                //log
            }
        }
        
        return 0;
    }
    
    @Test
    public void testKeyValuePairsUsingOptional() {
        Properties properties = new Properties();
        
        properties.setProperty("a", "5");
        properties.setProperty("b", "true");
        properties.setProperty("c", "-3");
        
        Assertions.assertEquals(5, method2(properties, "a"));
        Assertions.assertEquals(0, method2(properties, "b"));
        Assertions.assertEquals(0, method2(properties, "c"));
    }
    
    private int method2(Properties properties, String name) {
        return Optional.ofNullable(properties.getProperty(name))
                .flatMap(OptionalEx3::stringToInt)
                .filter(i -> i > 0)
                .orElse(0);
        
    }
    
    private static Optional<Integer> stringToInt(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (Exception e) {
            return Optional.empty();
        }
    }
    
}

