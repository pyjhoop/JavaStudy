package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Student;

public class Encapsulation {
	public static void main(String[] args) {
		Student woo = new Student();
		//캡슐화를 진행하였기에 직접접근이 불가.
		// 메서드를 통해 간접접근을 해야한다.
		woo.setName("우영우");
		woo.setAge(21);
		woo.setHeight(160);
		woo.setKorScore(100);
		woo.setMathScore(100);
		System.out.println(woo.getName());
		System.out.println(woo.getAge());
		System.out.println(woo.getHeight());
		System.out.println(woo.getKorScore());
		System.out.println(woo.getMathScore());
	}
}
