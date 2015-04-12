package com.reznikov.decorator.pizza;


public class Margarita extends Pizza {

	public Margarita() {
		description = "Margarita";
	}
	
	@Override
	public double cost() {
		return 450;
	}

}
