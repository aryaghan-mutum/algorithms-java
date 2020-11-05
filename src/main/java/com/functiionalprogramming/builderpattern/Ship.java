package com.functiionalprogramming.builderpattern;

import java.util.function.Consumer;

public class Ship {
    
    private String shipName;
    private double length;
    private int capacity;
    
    public Ship(String shipName, double length, int capacity) {
        this.shipName = shipName;
        this.length = length;
        this.capacity = capacity;
    }
}

class ShipBuilder {
    
    private String shipName;
    private double length;
    private int capacity;
    
    public ShipBuilder buildShipName(String shipName) {
        this.shipName = shipName; //set
        return this;
    }
    
    public ShipBuilder buildShipLength(double length) {
        this.length = length; //set
        return this;
    }
    
    public ShipBuilder buildShipCapacity(int capacity) {
        this.capacity = capacity; //set
        return this;
    }
    
    public Ship buildShip() {
        return new Ship(shipName, length, capacity);
    }
    
    //using Consumer function interface:
    public ShipBuilder with(Consumer<ShipBuilder> function)  {
        function.accept(this);
        return this;
    }
}

class ShipTest {

    public static void main(String[] args) {
        shipTest();
        shipTest2();
    }

    public static void shipTest() {
        Ship ship1 = new ShipBuilder()
                .buildShipName("AL") //..
                .buildShipLength(343) //..
                .buildShipCapacity(4000) //intermediate operators
                .buildShip(); //terminal operation
    }

    public static void shipTest2() {
        Ship ship1 = new ShipBuilder()
                .with(ship -> ship.buildShipName("AD"))
                .buildShipLength(432)
                .buildShipCapacity(3000)
                .buildShip();
    }
}

