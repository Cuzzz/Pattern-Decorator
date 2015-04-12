package com.reznikov.decorator.impl;

import com.reznikov.decorator.pizza.Pizza;

public class Chiken extends CondimentDecorator {

	Pizza pizza;
	
	public Chiken(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", extra chiken";
	}

	@Override
	public double cost() {
		return 50 + pizza.cost();
	}

}
