package com.practice.model.vo;

public class Customer {
	private String name;
	private String phoneNumber;
	private int point;
	
	public Customer() {}

	public Customer(String name, String phoneNumber, int point) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.point = point;
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

	@Override
	public String toString() {
		return "Customer [name=" + name + ", phoneNumber=" + phoneNumber + ", point=" + point + "]";
	}
	
	
	
}
