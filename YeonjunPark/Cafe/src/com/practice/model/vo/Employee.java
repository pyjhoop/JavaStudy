package com.practice.model.vo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Employee {
	
	Properties prop = new Properties();
	
	public void insert(String str1, String str2) {
		prop.setProperty(str1, str2);
	}
	
	public void fileSave() {
		try {
			prop.store(new FileOutputStream("employee.properties"), "Employee");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public Properties fileRead() {
		try {
			prop.load(new FileInputStream("employee.properties"));
		}catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
}
