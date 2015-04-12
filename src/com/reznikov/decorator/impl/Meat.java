package com.reznikov.decorator.impl;

import com.reznikov.decorator.pizza.Pizza;

public class Meat extends CondimentDecorator {

	Pizza pizza;
	
	public Meat(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", extra meat";
	}

	@Override
	public double cost() {
		return 70 + pizza.cost();
	}

}
