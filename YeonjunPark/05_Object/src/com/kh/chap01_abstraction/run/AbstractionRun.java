package com.kh.chap01_abstraction.run;

import com.kh.chap01_abstraction.mode.vo.Student;

public class AbstractionRun {
	public static void main(String[] args) {
		Student a = new Student();
		a.name = "우영우";
		a.age=20;
		a.height=163.3;
		System.out.println(a);
		System.out.println(a.name+"님의 나이는"+a.age+"살이고 키는"+a.height+"cm 입니다");
		
		Student yee = new Student();
		yee.name = "이준호";
		yee.age = 21;
		yee.height=170.6;
		System.out.println(yee);
		System.out.println(yee.name+"님의 나이는"+yee.age+"살이고 키는"+yee.height+"cm 입니다");
	}
}
