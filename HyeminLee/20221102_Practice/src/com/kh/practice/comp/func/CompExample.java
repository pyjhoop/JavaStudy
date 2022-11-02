package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {
	
	
	
	public void practice1() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int num = sc.nextInt();

		if (num>0) {
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.print("수");
			} else  {
				System.out.print("박");
			}
		}

	} else {
		System.out.println("양수가 아닙니다");
	}
	}
	
	public void practice2() {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("정수 : ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = 1; i <= num; i++) {
					if (i % 2 == 0) {
						System.out.print("수");
					} else {
						System.out.print("박");
					}
				}
				break;

			} else {
				System.out.println("양수가 아닙니다");
			}
		}

	}
	
	
	public void practice3() {

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);

		char ch2;

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			ch2 = str.charAt(i); // ch2에 입력받은 str 문자 하나하나 입력해봐
			if (ch2 == ch) { // 그 와중에 문자 하나가 ch랑 같으면
				count++; // 카운트해죠
			}
		}

		System.out.println(str + " 안에 포함된 " + ch + "개수 : " + count);

	}
	
	
	public void practice4() {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("문자열 : ");
			String str = sc.nextLine();

			System.out.print("문자 : ");
			char ch = sc.nextLine().charAt(0);

			char ch2;

			int count = 0;

			for (int i = 0; i < str.length(); i++) {
				ch2 = str.charAt(i); // ch2에 입력받은 str 문자 하나하나 입력해봐
				if (ch2 == ch) { // 그 와중에 문자 하나가 ch랑 같으면
					count++; // 카운트해죠
				}
			}

			System.out.println(str + " 안에 포함된 " + ch + "개수 : " + count);

			System.out.print("더 하시겠습니까? : ");
			char yn = sc.nextLine().charAt(0);

			if (yn == 'y' || yn == 'Y') {
				continue;
			} else if (yn == 'n' || yn == 'N') {
				return;
			} else {
				System.out.println("잘못된 대답입니다. 다시 입력해주세요");
			}

		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
//
}//