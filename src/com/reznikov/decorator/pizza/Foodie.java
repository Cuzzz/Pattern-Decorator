package com.reznikov.decorator.pizza;


public class Foodie extends Pizza {

	public Foodie() {
		description = "Foodie";
	}
	
	@Override
	public double cost() {
		return 560;
	}

}
