package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		sc.close();
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}else {
			for(int i =1; i <= num; i++) {
				System.out.print(i+" ");
			}
		}
	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if(num>=1) {
				for(int i =1; i<=num; i++) {
					System.out.print(i+" ");
				}
				break;
			}else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
		sc.close();
	}
//	public void practice2_1() {
//		Scanner sc = new Scanner(System.in);
//		boolean result = true;
//		while(result) {
//			System.out.print("1 이상의 숫자를 입력하세요 : ");
//			int num = sc.nextInt();
//			if(num>=1) {
//				for(int i = 1; i<=num; i++) {
//					System.out.print(i +" ");
//				}
//				result = false;
//			}else {
//				System.out.println("1 이상의 숫자를 입력해주세요.");
//			}
//		}
//		sc.close();
//	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if(num>=1) {
			for(int i = num; i>=1; i--) {
				System.out.print(i + " ");
			}
			
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		sc.close();
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if(num >= 1) {
				for(int i = num; i>=1; i--) {
					System.out.print(i+" ");
				}
				break;
			}else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i =1; i<=num; i++) {
			sum+=i;
			if(i == num) {
				System.out.print(i+" = "+sum);
			}else {
				System.out.print(i + " + ");
			}
		}
		sc.close();
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		int max = num1;
		int min = num2;
		if(num2>num1) {
			max = num2;
			min = num1;
		}
		if(num1 >= 1 && num2 >= 1) {
			for(int i = min; i<=max;i++) {
				System.out.print(i+" ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		sc.close();
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			int max = num1;
			int min = num2;
			if(num2>num1) {
				max = num2;
				min = num1;
			}
			if(num1>=1 && num2>=1) {
				for(int i = min; i <=max;i++) {
					System.out.print(i+" ");
				}
				break;
			}else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
			
		}
		sc.close();
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		sc.close();
		System.out.println("===== "+dan+"단 =====");
		for(int i = 1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", dan,i,dan*i);
		}
		sc.close();
	}
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		if(dan>9) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
			return;
		}else {
			for(int i = dan; i<=9;i++) {
				System.out.printf("===== %d단 =====\n",i);
				for(int j = 1; j<=9; j++) {
					System.out.printf("%d * %d = %d\n",i,j,dan*j);
				}
			}
		}
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("숫자 : ");
			int dan = sc.nextInt();
			if(dan>9) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
			}else {
				for(int i = dan; i<=9;i++) {
					System.out.printf("===== %d단 =====\n",i);
					for(int j = 1; j<=9; j++) {
						System.out.printf("%d * %d = %d\n",i,j,dan*j);
					}
				}
			break;
		}
	}
	}
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();
		System.out.print("공차 : ");
		int gap = sc.nextInt();
		for(int i = num; i<=(num+ gap*9); i+=gap) {
			System.out.print(i + " ");
		}
		sc.close();
	}
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.nextLine();
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 :");
			int num2 = sc.nextInt();
			sc.nextLine();
			if(num2 ==0 && op == "/") {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			}else {
				switch(op) {
				case "+": System.out.printf("%d %s %d = %d\n",num1,op,num2,num1+num2);; break;
				case "-": System.out.printf("%d %s %d = %d\n",num1,op,num2,num1-num2); break;
				case "/": System.out.printf("%d %s %d = %d\n",num1,op,num2,num1/num2); break;
				case "*": System.out.printf("%d %s %d = %d\n",num1,op,num2,num1*num2); break;
				case "%": System.out.printf("%d %s %d = %d\n",num1,op,num2,num1%num2); break;
				default: System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				}
			}
		}
	}
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i = 1; i <=num;i++) {
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i = 1; i<=num;i++) {
			for(int j =num-i;j>=0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}

