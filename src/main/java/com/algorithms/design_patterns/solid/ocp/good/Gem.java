package com.algorithms.design_patterns.solid.ocp.good;

public class Gem extends Product{

	@Override
	public double calculateTaxIncludedPrice() {
		
		return getBasePrice();
	}

}
