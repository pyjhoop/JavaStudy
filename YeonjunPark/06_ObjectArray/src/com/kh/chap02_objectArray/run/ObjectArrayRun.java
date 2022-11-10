package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {
	public static void main(String[] args) {
		//Phone배열 크기 3짜리 생성.
		Phone[] p = new Phone[3];
		
		//0번째 인덱스는 setmethod로 값 대입
		p[0] = new Phone();
		p[0].setName("벨벳폰");
		p[0].setBrand("LG");
		p[0].setPrice(1200000);
		p[0].setSeries("1");
		
		//1,2인덱스는 매개변수 생성자를 통해서 초기화.
		p[1] = new Phone("아이폰", "애플", 1300000, "11프로");
		p[2] = new Phone("갤럭시", "삼성", 1100000, "s20");
		
		
		//총가격과 평균가격을 구해보자.
		int total = 0;
		for(int i =0; i<p.length; i++) {
			System.out.println(p[i].information());
			total+=p[i].getPrice();
		}
		
		System.out.println("============================");
		
		System.out.println("총가격 : "+total+"원");
		System.out.println("평균값 : "+ total/p.length+"원");
		
		//사용자에게 구매하고자 하는 핸드폰명을 입력받아
		//해당 휴대폰을 찾은 후에 그 가격을 알려주자.
		Scanner sc = new Scanner(System.in);
		System.out.print("구매하고자 하는 휴대폰 입력 : ");
		String search = sc.nextLine();
		for(int i =0; i<p.length; i++) {
			if(p[i].getName().equals(search)) {
				System.out.println("당신이 구매하고자 하는 휴대폰의 가격운 "+
			p[i].getPrice()+"원 입니다.");
			}
		}
		
	}
}
