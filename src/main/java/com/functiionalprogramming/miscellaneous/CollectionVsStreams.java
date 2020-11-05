package com.functiionalprogramming.miscellaneous;

import org.junit.jupiter.api.Test;

/**
 * Collection API
 * - exists since Java 1.2
 * - stores data in diverse data structures
 * - stores finite number of items in data structures
 * - eager evaluation
 * - Collection APIs support iteration and consumption of elements multiple times.
 * <p>
 * Streams API:
 * - exists since Java 8
 * - doesn't store data, but used for computation of data on a large set of objects
 * - process data that can contain infinite number of elements.
 * - lazy evaluation
 * - With Stream API we can consume or iterate elements only once.
 */
public class CollectionVsStreams {
    
    /**
     * Note:, similar to iterators, a stream can be traversed only once. After that a stream is said to be consumed.
     * You can get a new stream from the initial data source to traverse it again just like for an iterator
     */
    @Test
    public void collectionVsStream() {
    
    }
    
    
}
