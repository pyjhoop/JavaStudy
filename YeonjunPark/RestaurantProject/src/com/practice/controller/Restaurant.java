package com.practice.controller;

import java.util.Arrays;
import java.util.Scanner;

import com.practice.model.vo.Food;

public class Restaurant {
	Scanner sc = new Scanner(System.in);
	
	Food[] fSushi = new Food[7];
	Food[] fBeef = new Food[7];
	
	public void insert(Food f) {
		int i = 0;
		fSushi[i++] = f;
	}
	
	
	public void select() {
		System.out.println("오늘은 외식이 땡기는날 앞에 회전음식점 2개가 존재한다 한곳을 골라 들어가보자.");
		System.out.println("1. 회전초밥, 2. 회전 소고기");
		System.out.print("원하시는 곳을 선택하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		switch(num){
		case 1: food();break;
		case 2: // ;
	}
	
	}
	
	public void food() {
		while(true) {
			System.out.println();
			System.out.print("1. 주문패드로 주문하시겠습니까?, 2.회전하는 초밥을 고르시겠습니까? : ");
			int num1 = sc.nextInt();
			sc.nextLine();
			if(num1 ==1) {
				pad(fSushi);
//			}else if(num1 == 2) {
//				rotate();
//			}else {
//				System.out.println("잘못 입력했습니다. 다시 입력해주세요");
//				continue;
//			}
//			System.out.print("더 드시겠습니까?(Y/N) : ");
//			char ch = sc.nextLine().toUpperCase().charAt(0);
//			if(ch=='N') {
//				sr.printReceipt();
//				return;
			}
		}
	}
	
	public void pad(Food[] f) {
		System.out.println("==================================메뉴==================================");
		for(int i = 0; i<f.length; i++) {
			System.out.print(f.);
		}
		System.out.print("드시고 싶으신 음식을 선택하세요 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println();
//		System.out.println(sr.getFoods()[num2-1].substring(3) + "이 나왔습니다. 맛있게 드세요");
//		System.out.println();
//		
//		sr.contain(sr.getFoods()[num2-1].substring(3),sr.getPrices()[num2-1]);
//		sr.setTotalPrice(sr.getTotalPrice()+sr.getPrices()[num2-1]);
	}
}

