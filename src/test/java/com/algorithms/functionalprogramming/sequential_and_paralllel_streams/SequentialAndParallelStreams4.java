package com.algorithms.functionalprogramming.sequential_and_paralllel_streams;

import com.algorithms.functionalprogramming.lambda_examples.ex2.Ship;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SequentialAndParallelStreams4 {
    
    static List<Ship> shipsList = Arrays.asList(
            new Ship("AL", 12.32, 4500),
            new Ship("AD", 323.32, 5200),
            new Ship("OA", 231.43, 4000));
    
    public static void main(String[] args) {
      //  sequentialStream();
        parallelStream();
    }
    
    //60msec
    private static void sequentialStream() {
        Long start = System.currentTimeMillis();
        
        List<Ship> shipList = shipsList.stream()
                .sorted(Comparator.comparing(Ship::getShipName))
                        .collect(Collectors.toList());
    
        Long end = System.currentTimeMillis();
        
        System.out.println("Sorted using sequential stream:");
        System.out.println("Total time: " + (end - start) + "msec");
    }
    
    //53sec
    private static void parallelStream() {
        Long start = System.currentTimeMillis();
    
        List<Ship> shipList = shipsList.parallelStream()
                .sorted(Comparator.comparing(Ship::getShipName))
                .collect(Collectors.toList());
    
        Long end = System.currentTimeMillis();
    
        System.out.println("Sorted using parallel stream:");
        System.out.println("Total time: " + (end - start) + "msec");
    }
    
}

