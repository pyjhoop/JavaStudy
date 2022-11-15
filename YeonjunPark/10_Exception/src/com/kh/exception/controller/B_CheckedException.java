package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
	/*
	 * CheckedException은 반드시 예외처리를 해줘야함.
	 * => 예측이 불가능하기에 조건문을 미리 제시할수 없음.
	 */
	
	public void method1() {
		method2();
	}
	
	public void method2() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("아무거나 입력해주세요.");
		
//		String str = br.readLine();
		//1. try catch
		
		try {
			String str = br.readLine();
			System.out.println(str);
		}catch(IOException e) {
			System.out.println("예외가 발생햇습니다.");
		}
		
		//2. thorows하기
		// 예외가 발생한 메서드를 호출한 메서드에 예외처리를 넘김.
		// main 메서드까지 넘기면 JVM이 처리해줌. => 비추한데.
	}
}
