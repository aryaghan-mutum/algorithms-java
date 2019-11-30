package com.algorithms.design_patterns.solid.srp.good;

import java.time.LocalDate;

public class ShipVoyage implements Printable {
	
	private String shipCode;
	private String envName;
	private LocalDate sailDate;
	
	public String getShip() { return shipCode; }
	public String getEnvName() { return envName; }
	public LocalDate getSailDate() { return sailDate; }
	public void setShip(String ship) { this.shipCode = ship; }
	public void setEnvName(String envName) { this.envName = envName; }
	public void setLocalDate(LocalDate sailDate) { this.sailDate = sailDate; }
    
    /**
     * Good:
     * You can create an interface called Printable, and use its object in a concrete class to call getContent() procedure.
     * Also all the printer related methods can be defined here.
     */
	public String getContent() {
		return shipCode;
	}
}
