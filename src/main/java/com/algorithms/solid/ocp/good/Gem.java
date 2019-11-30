package com.algorithms.solid.ocp.good;

public class Gem extends Product{

	@Override
	public double calculateTaxIncludedPrice() {
		
		return getBasePrice();
	}

}
