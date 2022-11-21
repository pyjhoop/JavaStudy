package com.practice.model.vo;

public class Food {
	private String name;
	private int price;
	private boolean takeOut;
	
	public Food() {}

	public Food(String name, int price, boolean takeOut) {
		this.name = name;
		this.price = price;
		this.takeOut = takeOut;
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

	public boolean isTakeOut() {
		return takeOut;
	}

	public void setTakeOut(boolean takeOut) {
		this.takeOut = takeOut;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + ", takeOut=" + takeOut + "]";
	}
	
	
	
}
