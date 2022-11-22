package com.practice.model.vo;

public class Customer {
	private String name;
	private String phoneNumber;
	private int point;
	private boolean takeOut;
	
	public Customer() {}

	public Customer(String name, String phoneNumber, int point, boolean takeOut) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.point = point;
		this.takeOut = takeOut;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public boolean isTakeOut() {
		return takeOut;
	}

	public void setTakeOut(boolean takeOut) {
		this.takeOut = takeOut;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", phoneNumber=" + phoneNumber + ", point=" + point + ", takeOut=" + takeOut
				+ "]";
	}
	
	
	
	
	
	
}
