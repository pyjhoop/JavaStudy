package com.practice.model.vo;

public abstract class Restaurant implements Basic{
	private String name;
	private int price;
	private String[] food;
	
	public Restaurant() {}

	public Restaurant(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "name : " + name + ", price : " + price;
	}
	
	
	
	
}
