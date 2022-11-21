package com.practice.model.vo;

public class Dessert extends Food{
	private boolean spoon;
	
	public Dessert() {}

	public Dessert(String name, int price, boolean takeOut, boolean spoon) {
		super(name, price, takeOut);
		this.spoon = spoon;
	}

	public boolean isSpoon() {
		return spoon;
	}

	public void setSpoon(boolean spoon) {
		this.spoon = spoon;
	}

	@Override
	public String toString() {
		return super.toString()+ ", spoon=" + spoon + "]";
	}
	
	
	
	
}
