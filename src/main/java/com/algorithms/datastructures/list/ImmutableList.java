package com.algorithms.datastructures.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ImmutableList<T> {
    ArrayList<T> sharedStorage;
    long size;
    
    ImmutableList() {
        sharedStorage = new ArrayList<>();
        size = 0;
    }
    
    ImmutableList(T... args) {
        sharedStorage = new ArrayList<T>(Arrays.asList(args));
        size = sharedStorage.size();
    }
    
    ImmutableList(ArrayList<T> shared) {
        sharedStorage = shared;
        size = shared.size();
    }
    
    public ImmutableList<T> add(T item) {
        sharedStorage.add(item);
        
        return new ImmutableList<>(sharedStorage);
    }
    
    public T get(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException(String.format("Index %d exceeds size %s", index, size));
        }
        
        return sharedStorage.get(index);
    }
    
    public static void main(String[] args) {
        ImmutableList<String> list1 = new ImmutableList<>("Hello", "World");
        ImmutableList<String> list2 = list1.add("Goodbye");
        
        System.out.printf("list3: %s %s\n", list1.get(0), list1.get(1));
        
    }
}
