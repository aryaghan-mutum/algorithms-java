package com.algorithms.solid.ocp.good;

public class Food extends Product{

	@Override
	public double calculateTaxIncludedPrice() {
		
		return getBasePrice()*1.08;
	}

}
