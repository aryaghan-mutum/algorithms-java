package com.functiionalprogramming.streamsexamples.optional.optioanl_ex2;

import java.util.Optional;

//using: java.util.Optional<T>

/**
 *
 * list = [1,2,3 [4, 5 [6, 7]]]
 * list = 1,2,3,4,5,6,7
 * Advantages of Java 8 Optional:
 *
 * 1. Null checks are not required
 * 2. No need to use Null pointer Exception in runtime
 * 3. No more b boiler polate code
 */
public class TestOptional {

    public String getCarInsuranceName(Optional<Person> person) {
        
        return person.flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("unKnown");
    }
    
//    public String getCarInsuranceName2(Optional<Person> person) {
//
//        Optional<Person> optionalPerson = Optional.of(person);
//
//        return optionalPerson.map(Person::getCar)
//                .map(Car::getInsurance)
//                .map(Insurance::getName)
//                .orElse("unKnown");
//    }

}
