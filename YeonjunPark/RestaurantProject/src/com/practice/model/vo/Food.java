package com.practice.model.vo;

public class Food {
	private int index;
	private String name;
	private int price;
	
	//기본 생성자.
	public Food() {}

	//매개변수 생성자
	public Food(int index, String name, int price) {
		this.index = index;
		this.name = name;
		this.price = price;
	}
	
	

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
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
		return index+". "+name + " : "+ price;
	}
	
	
	
	
	
	
}
