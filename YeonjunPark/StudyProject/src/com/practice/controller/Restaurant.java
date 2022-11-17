package com.practice.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.practice.model.vo.Food;

public class Restaurant {
	Scanner sc = new Scanner(System.in);
	
	//음식 객체를 담을 컬렉션
	ArrayList<Food> list = new ArrayList<>();

	//먹은 음식을 담을 컬렉션
	ArrayList<Food> list1 = new ArrayList<Food>();
	

	public void insert(Food f) {
		list.add(f); //run파일에서 음식 객체들을 입력받음.
	}
	 
	public void mainChoice(int num) {
		
		switch(num){
		case 1: food("초밥"); break;
		case 2: food("소고기"); break;
		}
	}//mainChoice close
	
	public void food(String name) {
		while(true) {
			System.out.println("1. 주문패드로 주문하시겠습니까? 2. 회전레일에 놓여있는 "+name+"을 고르겠습니까?");
			System.out.print("선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			System.out.println();
			
			//패드 주문시 pad() 호출
			//회전 주문시 rotate() 호출
			if(num == 1) {
				pad();
			}else if(num == 2) {
				rotate();
			}else {
				System.out.println("잘못 입력했습니다. 다시 입력해주세요");
				continue;
			}
			
			char ch;
			while(true) {
				System.out.print("더 드시겠습니까?(Y/N) : ");
				ch = sc.nextLine().toUpperCase().charAt(0);
				System.out.println();
				
				if(ch != 'N' && ch != 'Y') {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요!!");
				}else {
					break;
				}
			} // while close
			
			if(ch =='N') {
				printReceipt();
				return;
			}
			
		}// while end
	}//food method close
	
	public void pad() {
		System.out.println("==================================메뉴==================================");
		
		for(Food f: list) {
			System.out.print(f);
		}
		System.out.println();
		System.out.println("드시고 싶으신 음식의 번호를 입력하세요!!!");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		list1.add(list.get(num));
		
		System.out.println();
		System.out.println(list.get(num).getName()+" 나왔습니다. 맛있게 드세요");
	}//pad method close
	
	
	public void rotate() {
		while(true) {
			
			//랜덤 인덱스를 통해 4가지 초밥을 출력할 것이고 
			//정렬 알고리즘인데 먼저 min, max찾고 사이값 비교해서 정렬해보자.
			Food[] arr1 = new Food[4];
			int[] value = new int[4];
			
			//배열에 스시 객체 4개 대입. 크기가 작아서 중복허용 안함.
			for(int i = 0; i<4; i++) {
				value[i] = (int)(Math.random()*(list.size()-1));
				for(int j = 0; j<i; j++) {
					if(value[i] == value[j]) {
						i--;
					}
				}
			}
			
			//스시객체를 인덱스 크기순으로 정렬
			int temp;
			for(int i = 0; i < value.length-1; i++ ) {
				for (int j = i+1; j < value.length; j++ ) {
					if(value[i] > value[j]) {
						temp = value[i];
						value[i] = value[j];
						value[j] = temp;
					}
				}
			}
			
			for(int i =0; i<4; i++) {
				arr1[i] = list.get(value[i]);
			}
			
			System.out.println("======================레일에 놓여있는 초밥======================");
			//arr1 출력
			for(int i = 0; i< arr1.length; i++) {
				System.out.print(arr1[i].getIndex()+". "+arr1[i].getName()+" ");
			}
			
			System.out.print("99. 잠시뒤 고르겠다.");
			System.out.println();
			
			System.out.println("드시고 싶으신 음식의 번호를 입력하세요");
			System.out.print("선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			if(num == 99) {
				continue;
			}
				
			
			list1.add(list.get(num));
			System.out.println(list.get(num).getName()+" 나왔습니다. 맛있게 드세요");
			if(num != 99) break;
		}
	}//rotate method close
	
	
	public void printReceipt() {
		
		int total = 0;
		int cout = 0;
		System.out.println("===============영수증=================");
		
		for(int i = 0; i< list1.size(); i++) {
			System.out.println(list1.get(i).getName()+" 			"+ list1.get(i).getPrice()+"원");
			total += list1.get(i).getPrice();
			cout++;
		}
		System.out.println("====================================");
		System.out.println("초밥 개수 : "+cout+" 	 총금액 : "+total+"원");
		
	}
}
