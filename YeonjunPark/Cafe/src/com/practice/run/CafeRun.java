package com.practice.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

import com.practice.controller.Cafe;
import com.practice.model.vo.Employee;

public class CafeRun {

	public static void main(String[] args) {
		
		print();
		
		
	}
	
	public static void print() {
		Cafe cf = new Cafe();
		Employee e = new Employee();
		
		Scanner sc = new Scanner(System.in);
		
		Properties prop = e.fileRead();
		
		System.out.print("출근자의 이름을 입력하시오 : ");
		String eName = sc.nextLine();
		
		
		System.out.println(prop.get(eName)+"출근 완료!!!");
		System.out.println("======카페 오픈======");
		
		for(int i = 0; i<5; i++) {
			System.out.println((1+i)+"번째 손님");
		}
		
	}

}
