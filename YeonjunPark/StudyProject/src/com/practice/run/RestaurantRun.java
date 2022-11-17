package com.practice.run;

import java.util.Scanner;

import com.practice.controller.Restaurant;
import com.practice.model.vo.Beef;
import com.practice.model.vo.Sushi;

public class RestaurantRun {

	public static void main(String[] args) {
		Restaurant rs = new Restaurant();
		Scanner sc = new Scanner(System.in);
		System.out.println("오늘은 외식이 땡기는 날 가고싶은 음식점을 선택해 주세요!!!");
		
		System.out.println("1. 회전 초밥, 2. 회전 소고기");
		
		System.out.print("선택 : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println();
		if(num == 1) {
			rs.insert(new Sushi(0, "새우초밥", 1200));
			rs.insert(new Sushi(1, "장어초밥", 2000));
			rs.insert(new Sushi(2, "연어초밥", 1900));
			rs.insert(new Sushi(3, "광어초밥", 1000));
			rs.insert(new Sushi(4, "참치초밥", 3000));
			rs.insert(new Sushi(5, "계란초밥", 1300));
			rs.insert(new Sushi(6, "문어초밥", 2200));
		}else {
			rs.insert(new Beef(0, "꽃갈비", 9900));
			rs.insert(new Beef(1, "토시살", 7900));
			rs.insert(new Beef(2, "우설", 8000));
			rs.insert(new Beef(3, "부채살", 6000));
			rs.insert(new Beef(4, "꽃등심", 9000));
			rs.insert(new Beef(5, "안심", 6900));
			rs.insert(new Beef(6, "소곱창", 8000));
		}
		
		rs.mainChoice(num);
	
	}

}
