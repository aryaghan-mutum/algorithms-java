package com.functiionalprogramming.lambdaexamples.ex2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import static java.lang.System.out;
public class ShipTest {
    
    /**
     * ship -> ship.getShipName().startsWith("A") is similar to:
     * <p>
     * lambda(Ship ship) {
     * ship.getShipName().startsWith("A")
     * }
     */
    
    final static Predicate<Ship> predicateShipNameStartsWithA = ship -> ship.getShipName().startsWith("A");
    final static Predicate<Ship> predicateCapacityMoreThan5000 = ship -> ship.getCapacity() > 5000;
    
    public static void main(String[] args) {
        
        Ship alShip = new Ship("AL", 41.9, 5484);
        Ship esShip = new Ship("ES", 43.9, 3114);
        Ship adShip = new Ship("AD", 43.9, 3118);
        
        List<Ship> shipList = Arrays.asList(alShip, esShip, adShip);
        ShipHelper shipHelper = new ShipHelper();

//        approach 1:
//        List<Ship> shipNameList = shipHelper.getShipNameStartsWithLetterA(shipList);
//        List<Ship> shipCapacityList =shipHelper.getShipCapacityMoreThan5000(shipList);
        
        // approach 2:
        List<Ship> shipNameList = shipHelper.searchFor(shipList, predicateShipNameStartsWithA);
        List<Ship> shipCapacityList = shipHelper.searchFor(shipList, predicateCapacityMoreThan5000);
        
        shipNameList.stream().forEach(ship -> out.println("ship name starts with letter A: " + ship));
        shipCapacityList.stream().forEach(ship -> out.println("ship capacity more than 5000 : " + ship));
    }
    
}
