package com.algorithms.functionalprogramming.functional_interfaces.ex2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierEx implements Supplier<String> {
    
    //a1
    @Override
    public String get() {
        return "print something";
    }
    
    public static void main(String[] args) {
        
        Supplier<String> supplier1 = () -> "print something";
        
        approach2();
        approach3(supplier1);
        
        supplierExample1(supplier1);
        supplierExample2(supplier1);
    }
    
    private static void approach2() {
        Supplier<String> supplier = new SupplierEx();
        System.out.println("Approach 2: " + supplier.get());
    }
    
    private static void approach3(Supplier<String> supplier1) {
        System.out.println("Approach 3: " + supplier1.get());
    }
    
    private static void supplierExample1(Supplier<String> supplier) {
        List<String> list = Arrays.asList("x", "y", "z");
        System.out.println("Ex1: " + list.stream().findAny().orElseGet(supplier));
    }
    
    
    private static void supplierExample2(Supplier<String> supplier) {
        List<String> list = Arrays.asList();
        System.out.println("Ex2: " + list.stream().findAny().orElseGet(supplier));
    }
    
}
