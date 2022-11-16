package com.practice.run;

import com.practice.controller.Restaurant;
import com.practice.model.vo.Sushi;

public class RestaurantRun {

	public static void main(String[] args) {
		Restaurant rs = new Restaurant();
		
		rs.insert(new Sushi(0, "새우초밥", 1200));
		rs.insert(new Sushi(1, "장어초밥", 2000));
		rs.insert(new Sushi(2, "연어초밥", 1700));
		rs.insert(new Sushi(3, "광어초밥", 1500));
		rs.insert(new Sushi(4, "참치초밥", 2200));
		rs.insert(new Sushi(5, "문어초밥", 1800));
		rs.insert(new Sushi(6, "계란초밥", 1000));
		
		rs.select();
	}

}
