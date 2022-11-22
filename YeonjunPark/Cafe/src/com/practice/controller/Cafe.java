package com.practice.controller;

import java.util.ArrayList;

import com.practice.model.vo.Beverage;
import com.practice.model.vo.Dessert;
import com.practice.model.vo.Food;

public class Cafe {
	
	ArrayList<String> empList = new ArrayList<String>();
	ArrayList<Food> foods = new ArrayList<Food>();
	ArrayList<Food> orderList = new ArrayList<Food>();
	
	{
		empList.add("모모씨");
		empList.add("사과씨");
		empList.add("앵두씨");
		foods.add(new Beverage("아메리카노", 4500));
		foods.add(new Beverage("카페라떼", 5000));
		foods.add(new Beverage("오렌지 주스", 4000));
		foods.add(new Dessert("레드벨벳", 7500));
		foods.add(new Dessert("순우유 조각케이크", 8000));
		foods.add(new Dessert("마카롱", 3500));
	}
	
	
	public int logingForce(String name) {
		int status = 0;
		for(int i = 0; i< empList.size(); i++) {
			if(empList.get(i).equals(name)) {
				status = 1;
			}
		}
		return status;
	}
	
	public void addEmp(String name1) {
		empList.add(name1);
	}
	
	public ArrayList<Food> selecFood(){
		return foods;
	}
	
	public void addOrderList(Food f) {
		
	}
	
	public int totalPrice() {
		int total = 0;
		for(int i = 0; i < orderList.size();i++) {
			total += orderList.get(i).getPrice();
		}
		return total;
	}
	
	public String printBill() {
		String str = "";
		for(int i = 0; i< orderList.size(); i++) {
			str += (orderList.get(i).getName() + " : "+orderList.get(i).getPrice()+"\n");
		}
		return str;
	}
	
}
