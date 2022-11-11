package test.model.controller;

import test.model.vo.Car;

public class CarShop {
	Car[] arr = new Car[4];
	int i=0;		
	
	public Car getArr(int index) {
		return arr[index];
	}
	
	public void insert(Car c) {		
		arr[i++] = c;
	}
	
	public Car select(int index) {
		return arr[index];
	}
}
