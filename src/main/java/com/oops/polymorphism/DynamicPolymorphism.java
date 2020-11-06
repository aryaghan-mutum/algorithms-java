package com.oops.polymorphism;

/**
 * @author Anurag Muthyam
 * Runtime polymorphism (dynamic polymorphism): Method Overriding
 * It a type of polymorphism which is resolved during runtime.
 * An example of runtime polymorphism is method overriding.
 *
 * Overriding:
 * - Occurs in 2 class: Super class and sub class. Ex: Inheritance is involved
 * - Both Name and paramters are same
 * - Return type is always same
 * - Method call is decided by JVM in run time
 */
public class DynamicPolymorphism {

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
    }

}

class Animal {

    void sound() {
        System.out.println("animal sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("bark");
    }
}
