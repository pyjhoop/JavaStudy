package com.practice.model.vo;

public class Beverage extends Food{
	private String size;
	private String temperature;
	
	public Beverage() {}
	

	public Beverage(String name, int price) {
		super(name, price);
	}
	
	

	public Beverage(String name, int price, String size, String temperature) {
		super(name, price);
		this.size = size;
		this.temperature = temperature;
	}


	@Override
	public String toString() {
		return super.toString();
	}

	
	
	
	
}
