package com.kh.chap05_constructor;

/*
 * [클래스 기본 구조]
 * public(default) class 클래스명{
 * 		필드부 
 * 		생성자부
 * 		메서드부
 * }
 */

public class User {
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	public User(){
		
	}
	
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	public User(String userId, String userPwd, String userName, int age, char gender) {
//		this.userId = userId;
//		this.userPwd = userPwd;
//		this.userName = userName;
		this(userId, userPwd,userName);
		this.age = age;
		this.gender = gender;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String information() {
		return "userId : "+userId+", userPwd : "+ userPwd+", userName : "+userName+", age : "+age+", gender : "+gender;
	}
}
