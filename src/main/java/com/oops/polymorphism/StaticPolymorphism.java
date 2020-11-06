package com.oops.polymorphism;

/**
 * @author Anurag Muthyam
 *
 * Compile polymorphism (static polymorphism): Method Overloading
 * It is a a type of polymorphism that occurs at compile time.
 * An example of compile-time polymorphism is method overloading.
 *
 * Overloading:
 * - Occurs within 1 class
 * - Name of the method is same but paramters are different
 * - Return type can be same or different
 * - Compiler decides which method is called
 */
public class StaticPolymorphism {

    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(add(2, 3, 4));
    }

    static int add(int x, int y) {
        return x + y;
    }

    static int add(int x, int y, int z) {
        return x + y + z;
    }
}
