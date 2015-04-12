package com.reznikov.decorator;

import com.reznikov.decorator.impl.Cheese;
import com.reznikov.decorator.impl.Chiken;
import com.reznikov.decorator.impl.Meat;
import com.reznikov.decorator.pizza.Foodie;
import com.reznikov.decorator.pizza.Margarita;
import com.reznikov.decorator.pizza.Pizza;

public class Runner {

	public static void main(String[] args) {
		Pizza pizza = new Margarita();
		System.out.println(pizza.getDescription() + " " + pizza.cost() + " rub");
		
		Pizza pizza2 = new Foodie();
		pizza2 = new Cheese(pizza2);
		pizza2 = new Cheese(pizza2);
		pizza2 = new Meat(pizza2);
		System.out.println(pizza2.getDescription() + " " + pizza2.cost() + " rub");
		
		Pizza pizza3 = new Margarita();
		pizza3 = new Cheese(pizza3);
		pizza3 = new Meat(pizza3);
		pizza3 = new Chiken(pizza3);
		pizza3 = new Chiken(pizza3);
		System.out.println(pizza3.getDescription() + " " + pizza3.cost() + " rub");
	}

}
