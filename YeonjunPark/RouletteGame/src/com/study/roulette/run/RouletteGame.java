package com.study.roulette.run;

import java.util.Scanner;

public class RouletteGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] roulettArr = new int[5];
		
		//랜덤값 담는 것까지 완료
		
		//총5번 반복 안에 한 인덱스당 3번의 기회
		System.out.println("1~10사이 숫자가 총 5개 있다.");
		System.out.println("랜덤 숫자 하나당 총 3번의 기회가 존재");
		int life = 0;
		
		while(true) {
			
			int count = 0;
			boolean b1 = false;
			System.out.println("현재 목숨 : "+ (3-life));
			if(life == 3) {
				System.out.println("설거지 알바 당첨!!!");
				return;
			}
			
			for(int i = 0; i< roulettArr.length; i++) {
				roulettArr[i] =(int)(Math.random()*10 +1);
				System.out.print(roulettArr[i]);
			}
			System.out.println();
			
			for(int i = 0; i< 5; i++) {
				for(int j = 0; j<3; j++) {
					System.out.print((i+1)+"번째 숫자를 입력하시요 : ");
					int num = sc.nextInt();
					sc.nextLine();
					if(num >=1 && num <=10) {
						if(num > roulettArr[i]) {
							System.out.println("Down");
						}else if(num < roulettArr[i]) {
							System.out.println("Up");
						}else {
							System.out.println((i+1)+"번째 성공!!!");
							break;
						}
					}else {
						System.out.println("1~10 사이 숫자를 입력해 주세요!!!");
						j--;
					}
					count++;
					if(count == 3) {
						System.out.println(++life +"번 실패!");
						b1 = true;
					}
				}
				if(b1) break;
				
				if(i==4) {
					System.out.println("100만원 당첨!!!");
					return;
				}
			}
			
		}
		
	}
}
