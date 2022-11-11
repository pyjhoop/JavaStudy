package com.kh.chap03_abstract.part2_basic.run;

import com.kh.chap03_abstract.part2_basic.model.vo.Baby;
import com.kh.chap03_abstract.part2_basic.model.vo.Mother;
import com.kh.chap03_abstract.part2_basic.model.vo.Person;

public class BasicRun {
	public static void main(String[] args) {
		Person[] arr = new Person[2];
		arr[0] = new Mother("김엄마", 62.5, 70, "출산");
		arr[1] = new Baby("김아기", 10, 75);
		
		for(Person e: arr) {
			System.out.println(e);
		}
		
		System.out.println("=======================");
		arr[0].eat();
		arr[0].sleep();
		arr[1].eat();
		arr[1].sleep();
		
		for(Person e: arr) {
			System.out.println(e);
		}
	}
}
