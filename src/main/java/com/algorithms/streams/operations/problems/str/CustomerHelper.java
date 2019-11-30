package com.algorithms.streams.operations.problems.str;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CustomerHelper {
    
    
//    public list<Customer> searchCustomerByNameStartsWithA(list<Customer> customerList){
//        list<Customer> customerSavedlist = new ArrayList<>();
//        for(Customer cust : customerList){
//            if(cust.getName().startsWith("A")){
//                customerSavedlist.add(cust);
//            }
//        }
//
//        return  customerSavedlist;
//    }
//
//
//    public list<Customer> searchCustomerByAgeGreaterThan30(list<Customer> customerList){
//        list<Customer> customerSavedlist = new ArrayList<>();
//        for(Customer cust : customerList){
//            if(cust.getAge()>30){
//                customerSavedlist.add(cust);
//            }
//        }
//
//        return  customerSavedlist;
//    }
//
public List<Customer> searchCustomer(List<Customer> customerList, Predicate<Customer> predicate){
    List<Customer> customerSavedlist = new ArrayList<>();
    for(Customer cust : customerList){
        if(predicate.test(cust)){
            customerSavedlist.add(cust);
        }
    }
    
    return  customerSavedlist;
}


    
    
    
}
