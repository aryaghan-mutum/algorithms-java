package com.algorithms.functionalprogramming.lambda_examples.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ShipHelper {
    
    /**
     * Approach 1:
     * getShipNameStartsWithLetterA() and getShipCapacityMoreThan5000() the Code is repeating.
     */
    public List<Ship> getShipNameStartsWithLetterA(List<Ship> shipList) {
        
        List<Ship> tempList = new ArrayList<>();
        
        for (Ship ship : shipList) {
            
            if (ship.getShipName().startsWith("A")) {
                tempList.add(ship);
            }
        }
        
        return tempList;
    }
    
    public List<Ship> getShipCapacityMoreThan5000(List<Ship> shipList) {
        
        List<Ship> tempList = new ArrayList<>();
        
        for (Ship ship : shipList) {
            
            if (ship.getCapacity() > 5000) {
                tempList.add(ship);
            }
        }
        
        return tempList;
    }
    
    
    /**
     * Approach 2: Using DRY Principle.
     * (predicate? x) -> t or f
     * (odd? x) -> t or f
     * (zero? x) -> t or f
     */
    public List<Ship> searchFor(List<Ship> shipList, Predicate<Ship> predicate) {
        return shipList.stream()
                .filter(ship -> predicate.test(ship))
                .collect(Collectors.toList());
    }
    
}
