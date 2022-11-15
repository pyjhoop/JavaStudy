package com.practice.controller;

import java.util.Arrays;
import java.util.Scanner;

import com.practice.model.vo.Restaurant;
import com.practice.model.vo.SushiRestaurant;


public class Shop {
	Scanner sc = new Scanner(System.in);
	SushiRestaurant sr = new SushiRestaurant("갓파스시", 30000);
	
	public void select() {
		System.out.println("1. 회전초밥, 2. 회전 소고기");
		System.out.print("원하시는 곳을 선택하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		switch(num){
		case 1: sushi();break;
		case 2: // 
		}
	}
	
	public void sushi() {
		while(true) {
			System.out.println();
			System.out.print("1. 주문패드로 주문하시겠습니까?, 2.회전하는 초밥을 고르시겠습니까? : ");
			int num1 = sc.nextInt();
			sc.nextLine();
			if(num1 ==1) {
				pad();
			}else if(num1 == 2) {
				rotate();
			}else {
				System.out.println("잘못 입력했습니다. 다시 입력해주세요");
				continue;
			}
			System.out.print("더 드시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().toUpperCase().charAt(0);
			if(ch=='N') {
				sr.printReceipt();
				return;
			}
		}
	}
	
	public void pad() {
		System.out.println("==================================메뉴==================================");
		System.out.println(Arrays.toString(sr.getFoods()));
		System.out.print("드시고 싶으신 음식을 선택하세요 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println();
		System.out.println(sr.getFoods()[num2-1].substring(3) + "이 나왔습니다. 맛있게 드세요");
		System.out.println();
		
		sr.contain(sr.getFoods()[num2-1].substring(3),sr.getPrices()[num2-1]);
		sr.setTotalPrice(sr.getTotalPrice()+sr.getPrices()[num2-1]);
	}
	
	public void rotate() {
		//4개의 랜덤 인덱스로 초밥을 출력
		String[] sarr = new String[4];
		for(int i = 0; i<4; i++) {
			sarr[i] = sr.getFoods()[(int)(Math.random()*4+1)];
			for(int j = 0; j<i;j++) {
				if(sarr[j] == sarr[i]) {
					i--;
				}
			}
		}
		System.out.println("======================레일에 놓여있는 초밥======================");
		System.out.println(Arrays.toString(sarr));
		
		System.out.print("드시고 싶으신 음식을 선택하세요 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println();
			
		System.out.println(sr.getFoods()[num2-1].substring(3) + "이 나왔습니다. 맛있게 드세요");
		System.out.println();
		
		sr.contain(sr.getFoods()[num2-1].substring(3),sr.getPrices()[num2-1]);
		sr.setTotalPrice(sr.getTotalPrice()+sr.getPrices()[num2-1]);
		
	}
}
