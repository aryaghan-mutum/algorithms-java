package com.functiionalprogramming.methodreference;

import com.functiionalprogramming.lambdaexamples.ex2.Ship;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReference {

    public static void main(String[] args) {
        testConstructorForNoArg();
        testConstructorFor1Arg();
    }

    public static void testConstructorForNoArg() {
        Supplier<Ship> shipSupplier = Ship::new;
        Ship ship = shipSupplier.get();
    }

    public static void testConstructorFor1Arg() {
       
       //Ship ship = new Ship(100);
    
        //for 1 args using MR
        Function<Integer, Ship> shipFunction = Ship::new;
        
        // for 1args using lambda
        Function<Integer, Ship> shipFunction2 = s -> new Ship(s);
        Ship s = shipFunction2.apply(100);
    }
}
    

