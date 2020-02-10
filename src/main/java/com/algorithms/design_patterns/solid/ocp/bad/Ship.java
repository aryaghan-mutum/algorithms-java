package com.algorithms.design_patterns.solid.ocp.bad;

public class Ship {
    
    private String shipName;
    private double shipPrice;
    
    public String getName() {
        return shipName;
    }
    
    public Ship setName(String shipName) {
        this.shipName = shipName;
        return this;
    }
    
    public double getPrice() {
        return shipPrice;
    }
    
    public Ship setPrice(double shipPrice) {
        this.shipPrice = shipPrice;
        return this;
    }
    
}
