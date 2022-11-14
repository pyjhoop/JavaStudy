package com.kh.chap02_string.controller;

public class B_StringMethodTest {
	
	public void method() {
		String str = "Hello World";
		//이제부터 문자열 메서드에 대해 알아보자.
		
		//1. 문자열.charAt
		char ch = str.charAt(3);
		System.out.println("ch : "+ch);
		
		//2. 문자열.concat(String str): String
		// + 역할
		String str2 = str.concat("!!!");
		String str3 = str+"!!!";
		System.out.println(str2);
		//concat으로 생성된 문자열을 힙영역에 객체로 생성되기에 String Pool에는 안들어간다.
		//str3는 String Pool에 존재함.
		
		//3. 문자열.equals(Object object) : boolean
		System.out.println("str2와 str3는 일치합니까 : "+str2.equals(str3));
		
		//4. 문자열. contains(charsequence s): boolean
		System.out.println("str2에 Hello가 포함됬습니까 : "+str2.contains("Hello"));
		
		//5. 문자열.length
		System.out.println("문자열의 길이 : "+str2.length());
		
		//6. 문자열.substring(int beginindex)
		//	 문자열.substring(int beginindex, int endindex): endindes-1까지 반환
		System.out.println(str2.substring(3));
		System.out.println(str2.substring(3, 11));
		
		//7. 문자열.replace(char oldChar, char newChar) : string
		// 	 문자열에서 하나의 문자를 다른 문자로 바꾸는 메서드
		System.out.println(str.replace('l', 'c'));
		
		//8. toUpperCase(), toLowerCase()
		String str5 = str2.toUpperCase();
		System.out.println(str5);
		System.out.println(str5.toLowerCase());
		
		//9. 문자열.trim(): String
		//문자열 앞 뒤만 공백을 제거
		// 만약 가운데도 공백제거 원하면 replace사용이 훨 편함.
		String str6 = "    Ja   Va    ";
		System.out.println(str6.trim());
		System.out.println(str6.replace(" ", ""));
		
		//10. 문자열.toCharArray() : char[]
		char[] arr = str2.toCharArray();
		System.out.println(arr);
		
		//11. String.valueOf(char[]) : String
		// 문자 배열을 문자열로 만들어 주네
		System.out.println(String.valueOf(arr));
 	}
}
