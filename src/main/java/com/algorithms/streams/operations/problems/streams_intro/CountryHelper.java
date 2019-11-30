package com.algorithms.streams.operations.problems.streams_intro;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CountryHelper {
    
    
//    public list<Country> getCountryNameStartsWithC(list<Country> countryList) {
//
//        list<Country> countryNameList = new ArrayList<>();
//
//        for (Country country : countryList) {
//            if (country.getCountryName().startsWith("C")) {
//                countryNameList.add(country);
//            }
//        }
//
//        return countryNameList;
//    }
//
//    public list<Country> getCountryPopulationMoreThan100Million(list<Country> countryList) {
//
//        list<Country> countryPopulationList = new ArrayList<>();
//
//        for (Country country : countryList) {
//            if (country.getPopulation() > 100000000) {
//                countryPopulationList.add(country);
//            }
//        }
//
//        return countryPopulationList;
//    }
    
    public List<Country> searchCountry(List<Country> countryList, Predicate<Country> predicate) {
    
        List<Country> countrySavedList = new ArrayList<>();
        
        for (Country country : countryList) {
            if (predicate.test(country)) {
                countrySavedList.add(country);
            }
        }
    
        return countrySavedList;
    }
    
    
}
