package com.functiionalprogramming.streamsexamples.theory;

public class StreamsTheoryQuestAndAns {
    
    /**
     * Question:
     * What do you mean by saying Stream is lazy?
     *
     * Answer:
     * Streams are lazy because intermediate operations are not evaluated unless terminal operation is invoked.
     * Each intermediate operation creates a new stream, stores the provided operation and returns the new stream.
     *
     * Example:
     * -> Create the stream.
     * -> Apply zero or more intermediate operators to transform the initial stream into new streams.
     * -> Apply a terminal operation to generate a result or a side-effect.
     *
     * laziness only work when it reaches the terminal operator on the Stream and finish as soon as it finds
     * the data they are looking for rather than scanning through the entire set of data
     */
    
    
    
    /**
     * Question:
     * What Is a Lambda Expression and What Is It Used For
     *
     * Answer:
     * It is a feature of Functional Programming in Jav 8. Lambda methods are anonymous methods which means
     * it doesn't have a name and it useful to pass functions as arguments, return functions as values while using Stream API.
     * It is also used for referencing a method without invoking it
     * Ex: o -> o.toString();
     */
    
    
    
    /**
     * Question:
     * Name some of the intermediate and terminal operators in streams
     *
     * Answer:
     * Intermediate methods: map(), flatMap(), filter()
     * Terminal methods: collect() forEach allMatch() reduce()
     */
    
    
    
    /**
     * Question:
     * What is the difference between intermediate and terminal operation on Stream?
     *
     * Answer:
     * Intermediate operators: The intermediate operators return another Stream which means you can  call other methods of Stream class to compose a pipeline.
     * Terminal operators: cannot call other methods of Stream or reuse the Stream.
     */
    
    
    
    /**
     * Question:
     * What is the difference between Collection and Stream?
     *
     * Answer:
     * Collection API stores data but Strem API is a designed to process the data and return when it reaches the terminal operator. Streams do not store data.
     */
    
    
    
    /**
     * Question:
     * What does the filter() method do? when you use it?
     *
     * Answer:
     * It satisfy a particular condition which is specified using Predicate function.
     * A predicate function is a function which takes an Object and returns a boolean.
     * For example, if you have a list of Integer and you want a list of even integers use filter() to achieve this.
     * filter() also reduces the length of the list due to its conditional concept.
     */
    
    
    
    /**
     * Question:
     * What is difference between flatMap() and map() functions?
     *
     * Answer:
     * flatMap() If you have a list but you want to combine all elements of lists into just one list. In this case, you use flatMap() for flattening.
     * map(): It allows you to transform one type of object to other by applying a function.
     */
}
