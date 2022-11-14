package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	Scanner sc = new Scanner(System.in);
	TokenController tc = new TokenController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("3. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			sc.nextLine();
			
			switch (num) {
			case 1: tokenMenu(); break;
			case 2: inputMenu(); break;
			case 3: System.out.println("프로그램을 종료합니다"); return;
			default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		
	}
	
	public void tokenMenu() {
		String str = "J a v a P r o g r a m ";
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());
		
		String afterStr = tc.afterToken(str);
		
		System.out.println("토큰 처리 후 글자 : " + afterStr);
		System.out.println("토큰 처리 후 개수 : " + afterStr.length());
		System.out.println("모두 대문자로 변환 : "+ afterStr.toUpperCase());
		
	}
	
	public void inputMenu() {
		System.out.print("문자열을 입력하세요 : ");
		String input = sc.nextLine();
		System.out.println("첫 글자 대문자 : "+ tc.firstCap(input));
		
		System.out.print("찾을 문자 하나를 입력하세요 : ");
		char one = sc.nextLine().charAt(0);
		System.out.println(one+" 문자가 들어간 개수 : " + tc.findChar(input, one));
		
	}
}
