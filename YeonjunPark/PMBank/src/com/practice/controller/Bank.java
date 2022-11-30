package com.practice.controller;

import java.util.ArrayList;

import com.practice.model.vo.Account;
import com.practice.view.BankApp;

public class Bank {
	ArrayList<Account> aList = new ArrayList<Account>();
	{
		aList.add(new Account("28770204133857", "박연준", "PYJ", "qwe123", 1000));
		aList.add(new Account("123322123232", "황미자", "hmj",	"zxc123", 10000));
	}
	
	//기존회원 아이디 및 비번 비교
	public int searchAccount(String id, String pwd) {
		int num = 0;//0은 비번 틀림
		for(int i = 0; i<aList.size(); i++) {
			if(id.equals(aList.get(i).getId())) {
				//아이디가 같을 시 비번을 비교함.
				if(pwd.equals(aList.get(i).getPwd())) {
					num = 1;//1은 둘다 맞음.
				}
			}else {
				num = 2; //2아이디 틀림
			}
			break;
		}
		return num;
	}
	
	//아이디로 자신계정 반환메서드
	public Account findAccount(String id) {
		Account a = new Account();
		for(int i = 0; i<aList.size(); i++) {
			if(id.equals(aList.get(i).getId())) {
				a = aList.get(i);
			}
			}
		return a;
	}
	
	//아이디로 계정 삭제하는 메서드
	public void deleteAccount(String id) {
		for(int i = 0; i< aList.size(); i++) {
			if(aList.get(i).getId().equals(id)) {
				aList.remove(i);
			}
		}
	}
	
	//신규계정 추가하는 메서드
	public void addNewMember(String name, String id, String pwd, String account, int b) {
		aList.add(new Account(account, name, id, pwd, b));
	}
	
	//내 계좌 조회하기
	public Account selectMyAccount(String id) {
		return findAccount(id);
	}
}
