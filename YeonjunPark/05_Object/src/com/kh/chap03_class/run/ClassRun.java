package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;

public class ClassRun {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getEmail());
		
		p.setId("qwer");
		p.setPwd("qwer");
		p.setAge(26);
		p.setEmail("qewrwe@dsfadfs.com");
		p.setGender('M');
		p.setPhone("sdffasdfdasfsfda");
		System.out.println("아이디 : "+p.getId());
		System.out.println("비번 : "+p.getPwd());
		System.out.println("이름 : "+ p.getName());
		System.out.println("나이 : "+p.getAge());
		System.out.println("성별 : "+p.getGender());
		System.out.println("핸드폰 번호 : "+p.getPhone());
		System.out.println("이메일 : "+p.getEmail());
		System.out.println(p.getClass());
		System.out.println(p instanceof Person);
	}
}
