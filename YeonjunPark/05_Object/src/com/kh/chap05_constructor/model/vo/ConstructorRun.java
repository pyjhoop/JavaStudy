package com.kh.chap05_constructor.model.vo;

import com.kh.chap05_constructor.User;

public class ConstructorRun {
	public static void main(String[] args) {
		User a = new User();
		System.out.println(a.information());
		
		User a1 = new User("qwe123", "123142", "park");
		System.out.println(a1.information());
		
		User a2 = new User("pyj", "qwe123", "park", 20, 'M');
		System.out.println(a2.information());
	}
}
