package com.kh.chap01_math.run;

public class MathRun {
	public static void main(String[] args) {
		
		/*
		 * java.lang.Math
		 * 
		 * Math 특징
		 * - 모든 필드는 상수필드, 모든 메서드는 static메서드
		 * - 생성자가 private이므로 객체생성 불가.
		 * 
		 * **한번만 메모리 영역에 올려놓고 재사용하는 개념 => 싱글톤
		 */
		
		//상수필드
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		// 절대값 알고싶을 때 abs()
		int num = -10;
		System.out.println("절대값 : "+Math.abs(num));
		
		//올림 ceil : 같거나 큰 정수 반화
		
		double num2 = 12.345;
		System.out.println("올림값 : "+Math.ceil(num2));
		
		//반올림 : round
		double num3 = 12.5678;
		System.out.println("반올림 : "+Math.round(num3));
		
		//내림: floor
		System.out.println("내림값 : "+Math.floor(num3));
		
		//가장 가까운 정수값 : rint
		System.out.println("가장 가까운 정수값 : "+ Math.rint(num3));
		
		//제곱근 루트 : sqrt
		System.out.println("4의 제곱근 : "+Math.sqrt(4));
		
		//제곱 : pow
		System.out.println("2의 제곱 : "+Math.pow(2, 2));
	}
}
