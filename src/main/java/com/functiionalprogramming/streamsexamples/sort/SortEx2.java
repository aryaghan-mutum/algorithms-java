package com.functiionalprogramming.streamsexamples.sort;

import static com.utils.Constants.flowersList1;
import static java.lang.System.out;

/**
 * @author Anurag Muthyam
 */

public class SortEx2 {

    public static void main(String[] args) {
        sortCitiesList();
    }

    public static void sortCitiesList() {
        flowersList1
                .stream()
                .sorted()
                .forEach(out::println);
    }
}



