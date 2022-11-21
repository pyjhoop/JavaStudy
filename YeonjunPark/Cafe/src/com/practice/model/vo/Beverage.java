package com.practice.model.vo;

public class Beverage extends Food{
	private String size;
	private String temperature;
	private boolean tumbler;
	
	public Beverage() {}

	public Beverage(String name, int price, boolean takeOut,String size, String temperature, boolean tumbler) {
		super(name, price, takeOut);
		this.size = size;
		this.temperature = temperature;
		this.tumbler = tumbler;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public boolean isTumbler() {
		return tumbler;
	}

	public void setTumbler(boolean tumbler) {
		this.tumbler = tumbler;
	}

	@Override
	public String toString() {
		return super.toString()+", size=" + size + ", temperature=" + temperature + ", tumbler=" + tumbler + "]";
	}
	
	
	
	
	
}
