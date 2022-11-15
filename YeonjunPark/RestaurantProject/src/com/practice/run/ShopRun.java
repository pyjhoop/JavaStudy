package com.practice.run;

import com.practice.controller.Shop;
import com.practice.model.vo.Restaurant;

public class ShopRun {
	public static void main(String[] args) {
		System.out.println("오늘은 외식이 땡기는날 앞에 회전음식점 2개가 존재한다 한곳을 골라 들어가보자.");
		
		Shop sp = new Shop();
		sp.select();
	}
}
