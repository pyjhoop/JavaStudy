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

public class CafeRun {

	public static void main(String[] args) {
		Cafe cf = new Cafe();
		Scanner sc = new Scanner(System.in);
		
		
		Properties prop = new Properties();
		
//		prop.setProperty("모모씨", "10000");
//		prop.setProperty("사과씨", "20000");
//		prop.setProperty("앵두씨", "40000");
		
		try {
			prop.load(new FileInputStream("employee.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출근 프로그램 작동!!");
		System.out.print("직원의 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		
	}

}
