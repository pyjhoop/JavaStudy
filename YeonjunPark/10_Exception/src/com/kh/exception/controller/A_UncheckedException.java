package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedException {
//	RunTimeException
	Scanner sc = new Scanner(System.in);
	public void method1() {
		//ArithmaticException
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		//런타임예외는 먼저 if문을 통해 유효성검사를 해줘야함.
		int result = 0;
		
		/*
		int result = 0;
		if(num2 == 0) {
			System.out.println("분모에 0을 넣을수 없다.");
			return;
		}
		System.out.println("계산결과를 알려드림.");
		System.out.println("result : "+ result);
		*/
		
		//try-catch로 해결해보자.
		//문제되는 부분이 result = num1/num2
		
		try {
			result = num1/num2;
			System.out.println("result : "+ result);
		}catch(ArithmeticException e) {
			System.out.println("분모에 0을 넣울수 없다.");
		}
		
	}
	
	public void method2() {
		//NegativeArraySizeException : 배열 할당 과정에서 배열의 크기를 음수로 지정하는 경우 발생되는 예외.
		//ArrayIndexOutOfBoundsException: 배열에 부적절한 인덱스를 가지고 접근시 발생되는 예외.
		//InputMismatchException: 입력이 변수타입과 매치가 안될때.
		System.out.print("배열의 크기 : ");
		
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100번째 인덱스 : "+arr[100]);
		}catch(InputMismatchException e) {
			System.out.println("정수를 입력하세요");
		}catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기를 음수로 못함.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("부적절한 인덱스로 접근했다.");
		}
	}
	
	
	public void method3() {
		//RunTimeException을 매개변수로 처리하기
		//이럴경우 좀 세분화된 메세지를 보낼 수 없다.
		System.out.print("배열의 크기 : ");
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100번째 인덱스 : "+arr[100]);
			
		}catch(RuntimeException e) {
			System.out.println("런타입예외가 발생했습니다.");
		}
		
	}
	
	
}
