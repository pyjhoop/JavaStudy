package com.practice.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Collection;

import com.practice.model.vo.Account;
import com.practice.view.BankApp;


public class Bank {
	ArrayList<Account> aList = new ArrayList<Account>();
	ObjectOutputStream oos = null;
	ObjectInputStream ois = null;
	
	
	//기존회원 아이디 및 비번 비교
	public int searchAccount(String id, String pwd) {
		fileRead();
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
		for (int i = 0; i < aList.size(); i++) {
			if (id.equals(aList.get(i).getId())) {
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
	
	//신규계정 추가하는 메서드 그다음에 파일에 쓰기
	public void addNewMember(Account a) {
		aList.add(a);
		fileSave(a);
	}
	
	//파일에 저장
	public void fileSave(Account a) {
		
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("test.txt", true));
			oos.writeObject(a);
		}catch (Exception e) {
		}finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//파일 읽어들이기
	public void fileRead() {
		
		
		try {
			ois = new ObjectInputStream(new FileInputStream("test.txt"));
			
			aList = (ArrayList<Account>) ois.readObject();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (EOFException e) {
		}catch (StreamCorruptedException e) {
		}catch (IOException e) {
		} catch (ClassNotFoundException e) {
		}
	}
	
	//내 계좌 조회하기
	public Account selectMyAccount(String id) {
		return findAccount(id);
	}
	
	//계좌번호를 통해 계좌를 찾는 메서드
	public Account selectAccount(String account) {
		Account a1 = null;
		for(Account a: aList) {
			if(a.getAccountNumber().equals(account)) {
				a1 = a;
			}
		}
		return a1;
	}
}
