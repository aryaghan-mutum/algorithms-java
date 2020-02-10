package com.algorithms.functionalprogramming.functional_interfaces.ex2;

import com.algorithms.functionalprogramming.lambda_examples.ex2.Ship;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.lang.System.out;
import static java.util.stream.Collectors.toList;

public class FunctionEx {

//    //a1
//    @Override
//    public Double apply(Integer integer) {
//        return null;
//    }
    
    public static void main(String[] args) {
        
        //a2
        Function<Ship, String> function = (Ship ship) -> ship.getShipName();
        
        List<Ship> shipList = Arrays.asList(
                new Ship("AL", 41.9, 5484),
                new Ship("ES", 43.9, 3114),
                new Ship("AD", 43.9, 3118));
        
        out.println(getShipNameListImperativeApproach(shipList, function));
        out.println(getShipNameListFunctionalApproach(shipList));
        
        ex1();
    }
    
    private static void ex1() {
        
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5);
        
        numbersList.stream()
                .filter(predicate)
                .map(n -> n * 2.5)
                .forEach(System.out::println);
    }
    
    static Predicate<Integer> predicate = n -> n % 2 == 0;
    
    private static boolean isEven(Integer n) {
        return n % 2 == 0;
    }
    
    private static List<String> getShipNameListFunctionalApproach(List<Ship> shipList) {
        return shipList
                .parallelStream()
                .map(ship -> ship.getShipName())
                .collect(toList());
    }
    
    private static List<String> getShipNameListImperativeApproach(List<Ship> shipList, Function<Ship, String> function) {
        List<String> tempList = new ArrayList<>();
        
        for (Ship ship : shipList) {
            tempList.add(function.apply(ship));
        }
        return tempList;
    }
}
