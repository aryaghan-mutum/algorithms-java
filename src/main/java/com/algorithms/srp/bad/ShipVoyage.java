package com.algorithms.srp.bad;

import java.time.LocalDate;

public class ShipVoyage {
    
    private String shipCode;
    private String envName;
    private LocalDate sailDate;
    
    public String getShip() { return shipCode; }
    public String getEnvName() { return envName; }
    public LocalDate getSailDate() { return sailDate; }
    
    public void setShip(String ship) { this.shipCode = ship; }
    public void setEnvName(String envName) { this.envName = envName; }
    public void setLocalDate(LocalDate sailDate) { this.sailDate = sailDate; }
    
    public void printShipCode() {
        System.out.println(shipCode);
    }
    
    
}
