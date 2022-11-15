package com.practice.model.vo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SushiRestaurant extends Restaurant{
	Scanner sc = new Scanner(System.in);
	
	private String[] foods = {"1. 새우초밥","2. 장어초밥","3. 연어초밥","4. 광어초밥","5. 참치초밥","6. 계란초밥","7. 문어초밥"};
	
	private int[] prices = {1200, 3000, 2500, 2000, 3000,1000,1700};
	
	private int totalPrice = 0;
	
	private ArrayList<String> containFood = new ArrayList<String>();
	
	private ArrayList<Integer> containprice = new ArrayList<Integer>();

	//기본 생성자
	public SushiRestaurant() {}
	
	//매개변수 생성자
	public SushiRestaurant(String name, int price) {
		super(name, price);
	}
	
	
	//getter/ setter
	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	
	public String[] getFoods() {
		return foods;
	}

	public void setFoods(String[] foods) {
		this.foods = foods;
	}
	
	public int[] getPrices() {
		return prices;
	}

	public void setPrices(int[] prices) {
		this.prices = prices;
	}
	
	public ArrayList<String> getContainFood() {
		return containFood;
	}
	
	public void setContainFood(ArrayList<String> containFood) {
		this.containFood = containFood;
	}
	
	public ArrayList<Integer> getContainprice() {
		return containprice;
	}
	
	public void setContainprice(ArrayList<Integer> containprice) {
		this.containprice = containprice;
	}

	
	//run에서 eat메서드를 실행시키면 배열을 만들어서 먹은 음식을 넣을거야.
	public void contain(String food, int price) {
		containFood.add(food);
		containprice.add(price);
	}
	

	@Override
	public String printReceipt() {
		//containFood 전체 출력
		//totalprice출력
		System.out.println("==========영수증==========");
		for(int i = 0; i<containFood.size(); i++) {
			System.out.println(containFood.get(i)+" : "+containprice.get(i));
		}
		System.out.println("total price : "+ totalPrice);
		
		return null;
	}

}
