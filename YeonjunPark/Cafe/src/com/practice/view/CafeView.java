package com.practice.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.practice.controller.Cafe;
import com.practice.model.vo.Beverage;
import com.practice.model.vo.Dessert;
import com.practice.model.vo.Food;

public class CafeView {
	Scanner sc = new Scanner(System.in);
	Cafe c = new Cafe();
	
	
	/**
	 * 1. 카페 오픈시 포스기에 근무자의 이름을 입력하고 ~~출근
	 */
	public void logingForce() {
		while(true) {
			System.out.println("\n=== OK포스기 로그인 화면 ===");
			System.out.print("근무자의 이름을 입력하세요 : ");
			String name = sc.nextLine();
			int openCafe = c.logingForce(name);
			
			if(openCafe == 1) {
				System.out.println(name+"님 열일 해주세여!!!");
				break;
			}else {
				System.out.print("새로운 근무자를 추가하겠습니까?(y/n) : ");
				char ch = sc.nextLine().toUpperCase().charAt(0);
				if(ch == 'Y') {
					System.out.print("이름을 입력해주세요 : ");
					String name1 = sc.nextLine();
					c.addEmp(name1);
					System.out.println(name1+"님 근무자로 추가되었습니다!");
					System.out.println("다시 로그인을 해주세요!!!");
				}
			}
		}
	}
	
	public void openCafe() {
		System.out.println("\n=== 카페 오픈 손님받습니다 ===");
		int cusNo = 1;
		char size =' ';
		int pay = 0;
		String temperature = " ";
		ArrayList<Food> orderList = new ArrayList<Food>();
		
		System.out.println(cusNo+"번째 손님 들어오십니다.\n");
		System.out.println("손님 무엇을 주문하시겠습니까? ");
		printMenu(); //전체메뉴 출력 메서드
		
		ArrayList<Food> foods = c.selecFood();
		while(true) {
			System.out.print(">> 주문번호 입력 : ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			if(foods.get(menuNo-1) instanceof Beverage) {
				System.out.print("음료의 사이즈는 어떻게 드릴까요? (R/T) : ");
				size = sc.nextLine().toUpperCase().charAt(0);
				System.out.print("Hot and ice 둘중에 하나 선택해주세요 (Hot/Ice): ");
				temperature = sc.nextLine().toUpperCase();
				c.addOrderList(new Beverage(foods.get(menuNo-1).getName(), foods.get(menuNo-1).getPrice(), size, temperature));
			}else {
				c.addOrderList(new Dessert(foods.get(menuNo-1).getName(), foods.get(menuNo-1).getPrice()));
			}
			
			System.out.print("더 주문하시겠습니까? (y/n) : ");
			char ch = sc.nextLine().toUpperCase().charAt(0);
			if(ch == 'Y') {
				continue;
			}else {
				break;
			}
		}
		
		printOrderList(); // 주문한 음료 및 디저트 출력 메서드
		
		System.out.print("주문한 것과 동일합니까? (y/n) : ");
		char select = sc.nextLine().toUpperCase().charAt(0);
		if(select == 'Y') {
			int total = c.totalPrice();
			System.out.print("총금액 : "+ total);
			System.out.print("지급하실 금액을 입력해주세요 : ");
			pay = sc.nextInt();
		}
		printBill();
		
	}
	
	public void printMenu() {
		ArrayList<Food> list = c.selecFood();
		for(int i = 0; i< list.size(); i++) {
			System.out.println((i+1)+". "+list.get(i).getName()+" : "+list.get(i).getPrice());
		}
	}
	
	
	
	public void printOrderList() {
		ArrayList<Food> list = c.selectOrderList();
		System.out.print("\n=== 주문하신 음료 및 디저트 ===");
		for(int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
	}
	
	
	public void printBill() {
		System.out.println("\n=== 계산서 ===");
		System.out.println("계산 도와드리겠습니다.");
		System.out.println("현재 주문하신 음식");
		System.out.println(c.totalPrice());
		
	}
	
	
	
}
