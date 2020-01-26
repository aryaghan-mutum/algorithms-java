package com.algorithms.functionalprogramming.stream_examples.optional.optional_ex1;

// Refactor Try and Catch blocks using Streams Api with Optional

public class TestWithoutOptional {
    
    public String getCarInsuranceName1(Person person) {
        return person.getCar().getInsurance().getName();
    }
    
    public String getCarInsuranceName2(Person person) {
        if (person != null) {
            Car car = person.getCar();
            
            if (car != null) {
                Insurance insurance = car.getInsurance();
                
                if(insurance != null) {
                    return insurance.getName();
                }
            }
        }
        
        return  "unKnown";
    }
    
    public String getCarInsuranceName3(Person person) {
        if(person == null) return "unKnown";
        
        Car car = person.getCar();
        if(car == null) return  "unKnown";
        
        Insurance insurance = car.getInsurance();
        if(insurance == null) return  "unKnown";
        
        return insurance.getName();
    }
    
}





