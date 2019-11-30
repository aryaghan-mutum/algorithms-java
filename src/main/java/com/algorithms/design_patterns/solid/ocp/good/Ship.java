package com.algorithms.design_patterns.solid.ocp.good;

public class Ship {
    
    private String shipName;
    private double shipPrice;
    
    public String getName() {
        return shipName;
    }
    
    public void setName(String shipName) {
        this.shipName = shipName;
    }
    
    public double getPrice() {
        return shipPrice;
    }
    
    public void setPrice(double shipPrice) {
        this.shipPrice = shipPrice;
    }
    
}
