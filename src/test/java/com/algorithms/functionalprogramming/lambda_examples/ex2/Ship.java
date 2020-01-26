package com.algorithms.functionalprogramming.lambda_examples.ex2;

public class Ship {
    
    private String shipName;
    private int capacity;
    private double length;
    
    public Ship(String shipName, double length, int capacity) {
        this.shipName = shipName;
        this.capacity = capacity;
        this.length = length;
    }
    
    public Ship() {
        this.shipName = "OA";
        this.capacity = 9000;
        this.length = 41.56;
    }
    
    public Ship(Integer length) {
        this.length = length;
    }
    
    public Ship(String shipName, Integer length) {
        this.shipName = shipName;
        this.length = length;
    }
    
    public String getShipName() {
        return shipName;
    }
    
    public int getCapacity() {
        return capacity;
    }
    
    public double getLength() {
        return length;
    }
    
    @Override
    public String toString() {
        return "Ship{" +
                "shipName='" + shipName + '\'' +
                ", cpacity=" + capacity +
                ", length=" + length +
                '}';
    }
}
