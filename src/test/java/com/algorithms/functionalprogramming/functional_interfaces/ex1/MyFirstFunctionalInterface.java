package com.algorithms.functionalprogramming.functional_interfaces.ex1;

@FunctionalInterface
public interface MyFirstFunctionalInterface {
    
    void hello();
    
    boolean equals(Object obj);
    String toString();
    
   default void myD1() {
   
   }
   
   default void myD2() {
   
   }
   
}

//interface MySecondFunctionalInterface extends MyFirstFunctionalInterface{
//
//    @Override
//    void hello();
//
//}





