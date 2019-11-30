package com.algorithms.design_patterns.solid.ocp.good;

public class Food extends Product{

	@Override
	public double calculateTaxIncludedPrice() {
		
		return getBasePrice()*1.08;
	}

}
