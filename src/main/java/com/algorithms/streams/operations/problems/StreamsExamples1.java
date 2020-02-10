package com.algorithms.streams.operations.problems;

import java.util.stream.Stream;

import static com.utils.Constants.citiesList;

public class StreamsExamples1 {
    
    public static void main(String[] args) {
        StreamsExamples1 filter = new StreamsExamples1();
        filter.streamsUsingList();
        filter.streamsUsingStream();
    }
    
    public void streamsUsingList() {
        citiesList.stream()
                .findFirst()
                .ifPresent(city -> System.out.println("First City: " + city));
    }
    
    public void streamsUsingStream() {
        Stream citiesList = Stream.of("miami", "columbus", "san francisco", "fargo");
        citiesList
                .findFirst()
                .ifPresent(city -> System.out.println("First City: " + city));
    }
    
    
}
