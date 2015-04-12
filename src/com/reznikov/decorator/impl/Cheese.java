package com.reznikov.decorator.impl;

import com.reznikov.decorator.pizza.Pizza;

public class Cheese extends CondimentDecorator {

	Pizza pizza;
	
	public Cheese(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", extra cheese";
	}

	@Override
	public double cost() {
		return 30 + pizza.cost();
	}

}
