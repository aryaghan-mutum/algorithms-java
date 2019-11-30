package com.algorithms.streams.operations.problems.str;

import java.util.ArrayList;
import java.util.List;

public class CustomerHelperTest {
    
    
    public static void main(String[] args){
        
        List<Customer> inputCustomerList = new ArrayList<>();
        
        Customer c1 = new Customer("John","45243524",43);
        Customer c2 = new Customer("Peter","9742342342",33);
        Customer c3 = new Customer("Adam","41234341",13);
        
        inputCustomerList.add(c1);
        inputCustomerList.add(c2);
        inputCustomerList.add(c3);
        
        CustomerHelper ch = new CustomerHelper();
        List<Customer> output1List = ch.searchCustomer(inputCustomerList, cust -> cust.getAge()>30);
        List<Customer> output2List = ch.searchCustomer(inputCustomerList, cust -> cust.getName().startsWith("A"));
        
        
        
        System.out.println("Customer age greater than 30");
        for(Customer cust : output1List){
            System.out.println(cust);
        }
        
        System.out.println("Customer name starts with A");
        for(Customer cust : output2List){
            System.out.println(cust);
        }
        
    }
}
