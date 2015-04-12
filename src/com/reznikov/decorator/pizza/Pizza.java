package com.reznikov.decorator.pizza;

public abstract class Pizza {
	String description = "Unknow Pizza";
	
	public String getDescription()
	{
		return description;
	}
	
	public abstract double cost();
	
}
