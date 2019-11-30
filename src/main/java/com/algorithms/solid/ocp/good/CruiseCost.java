package com.algorithms.solid.ocp.good;

import java.util.List;

public class CruiseCost {
    
    public double calculateTotalOrder(List<Ship> shipsList) {
        
        double totalCruisesCost = 0;
        
        for (Ship ship : shipsList) {
            
            if (ship.getName().equals("allure of the seas")) {
                totalCruisesCost += ship.getPrice() + ship.getPrice() * 0.08;
            } else if (ship.getName().equals("adventure of the seas")) {
                totalCruisesCost += ship.getPrice() + ship.getPrice() * 0.08;
            } else if (ship.getName().equals("ovation of rhe seas")) {
                totalCruisesCost += ship.getPrice() * 1.60 * 1.18;
            }
        }
        
        return totalCruisesCost;
    }
}
