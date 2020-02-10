package com.algorithms.functionalprogramming.method_reference;

import com.algorithms.functionalprogramming.lambda_examples.ex2.Ship;
import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.function.Supplier;
import static java.lang.System.out;

public class ConstructorReference {
    
    @Test
    public void testConstructorForNoArg() {
        Supplier<Ship> shipSupplier = Ship::new;
        Ship ship = shipSupplier.get();
    }
    
    @Test
    public void testConstructorFor1Arg() {
       
       //Ship ship = new Ship(100);
    
        //for 1 args using MR
        Function<Integer, Ship> shipFunction = Ship::new;
        
        // for 1args using lambda
        Function<Integer, Ship> shipFunction2 = s -> new Ship(s);
        Ship s = shipFunction2.apply(100);
        
        out.println();
        
    }
}
    

