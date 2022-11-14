package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizer {
	public void method() {
		String str ="JAVA,ORACLE,JDBC,HTML,CSS,SPRING";
		//구분자를 기준으로 문자열을 구분하는 방법
		//1. 문자열.split("구분자") : String[];
		
		String[] arr = str.split(",");
		//단순 for문
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//향상 for문
		for(String e : arr) {
			System.out.println(e);
		}
		
		//방법2. StringTokenizer을 통해 토큰으로 관리한다.
		// 1회성이기에 nextToken으로 값을 빼버리면 더이상 사용 못한다.
		
		StringTokenizer st = new StringTokenizer(str,",");
		
		//분리된 토큰 개수 새는 메서드
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
