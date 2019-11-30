package com.algorithms.streams.operations.problems.streams_intro;

import java.util.ArrayList;
import java.util.List;

public class CountryTest {
    
    public static void main(String[] args) {
        
        Country countryObj1 = new Country("Japan", "Tokyo", 126440000);
        Country countryObj2 = new Country("Czech Republic", "Prague", 10610947);
        Country countryObj3 = new Country("Canada", "Ottawa", 37412852);
    
        List<Country> countryList = new ArrayList<>();
        
        countryList.add(countryObj1);
        countryList.add(countryObj2);
        countryList.add(countryObj3);
        
        CountryHelper countryHelper = new CountryHelper();
    
//         approach 1:
//         list<Country> countryNamesList = countryHelper.getCountryNameStartsWithC(countryList);
//         list<Country> countryPopulationList = countryHelper.getCountryPopulationMoreThan100Million(countryList);
        
        // approach 2:
        List<Country> countryNamesList = countryHelper.searchCountry(countryList, country -> country.getCountryName().startsWith("C"));
        List<Country> countryPopulationList = countryHelper.searchCountry(countryList, country -> country.getPopulation() > 100000000);
        
        for(Country country : countryNamesList) {
            System.out.printf("Country Names Starts With Letter C: %s \n", country);
        }

        for(Country country : countryPopulationList) {
            System.out.printf("Country Names MORE Than 100 Million %s \n", country);
        }
    }
}



