package com.practice.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.practice.controller.Bank;
import com.practice.model.vo.Account;

public class BankApp {
	Scanner sc = new Scanner(System.in);
	Bank b = new Bank();
	
	public void printView() {
		Account a = new Account();
		int selectMember = selectMember();
		if(selectMember == 1) {
			a = existingMember();
				//기존회원일 시 아이디와 비밀번호를 입력받아서 비교후 로그인 성공!
				//한 아이디에 비번만 실패하면 아이디 삭제당함.
		}else if(selectMember == 2) {
				//계좌번호, 아이디, 비번, 잔금 입력받아서 객체 생성
			newMember();
		}
		mainMenu(a);
		
		
	}//printView close
	
	/**
	 * 신규회원인지 아닌지 고르는 페이지
	 */
	public int selectMember() {
		int select = 0;
		while(true) {
			System.out.println("PMBank에 오신것을 환영 합니다.");
			System.out.println("=======================");
			System.out.println("1. 기존 회원  2. 신규 회원");
			System.out.print("숫자 입력 : ");
			try {
				select = sc.nextInt();
				sc.nextLine();
				if(select >= 3) {
					System.out.println("1~2사이의 숫자를 입력하세요!!!");
					continue;
				}
			}catch(InputMismatchException e) {
				System.out.println("1~2사이의 숫자를 입력하세요!!!");
				sc.nextLine();
				continue;
			}
			break;
		}
		
		return select;
	}//selectMember() close
	
	/**
	 * 기존 회원일 시 아이디와 비번 비교 후 비번 3번 틀릴시 아이디 삭제
	 */
	public Account existingMember() {
		int cnt = 0;
		int num = 0;
		String id = "";
		String pwd = "";
		Account acc = new Account();
		while(true) {
			System.out.print("아이디 입력 : ");
			id = sc.nextLine();
			
			System.out.print("비밀번호 입력 : ");
			pwd = sc.nextLine();
			//아이디, 비번 비교 하는 메서드 ...
			num = b.searchAccount(id, pwd);
			if(num == 0) {
				System.out.println("비밀번호가 틀렸습니다.");
				System.out.println("다시입력해 주세요!!!\n");
				cnt++;
				continue;
			}else if(num ==2) {
				System.out.println("================");
				System.out.println("아이디가 틀렸습니다.");
				System.out.println("다시입력해 주세요!!!\n");
				continue;
			}else {
				System.out.println("로그인 성공!!!");
				acc = b.findAccount(id);
				break;
			}
		}
		if(cnt == 3) {
			//아이디로 계정 삭제하는 메서드
			b.deleteAccount(id);
			System.out.println("PMBank 보안사항에 따라 아이디가 삭제됩니다!");
		}
		return acc;
	}
	
	/**
	 * 신규회원시 회원가입과정.
	 */
	public Account newMember() {
		//계좌번호, 아이디, 비번, 잔금 입력받아서 객체 생성
		System.out.println("=======================");
		System.out.println("회원가입을 진행하겠습니다");
		System.out.print("성함 : ");
		String name = sc.nextLine();
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		System.out.print("계좌번호 : ");
		String accountNumber = sc.nextLine();
		
		b.addNewMember(name, id, pwd, accountNumber, 0);
		
		System.out.println(name+"님 PMBank에 오신것을 환영합니다.");
		return b.findAccount(id);
		
	}
	
	public void mainMenu(Account acc) {
		while(true) {
			Account a = b.selectMyAccount(acc.getId());
			
			System.out.println("=======================");
			System.out.println("원하시는 기능을 선택하시오!");
			System.out.println("1. 내계좌 조회하기");
			System.out.println("2. 계좌이체하기");
			System.out.println("3. 입금");
			System.out.println("4. 출금");
			System.out.print("숫자입력 : ");
			int num = sc.nextInt();
			sc.nextLine();
			switch(num) {
			case 1: 
				selectMyAccount(a);
				break;
			case 2:
				sendMoney(a);
			}
			
		}
	}
	
	public void selectMyAccount(Account a) {
		System.out.println("=======================\n");
		System.out.println(a.getName()+"님의 계좌번호 : "+a.getAccountNumber());
		System.out.println(a.getName()+"님의 잔액 : "+ a.getBalance());
		
	}
	
	public void sendMoney(Account a) {
		System.out.print("이체하고 싶으신 계좌의 번호를 입력해주세요:");
		String account = sc.nextLine();
		System.out.print("이체를 원하시는 금액을 입력해 주세요 : ");
		int money = sc.nextInt();
		sc.nextLine();
		
	}
	
	
	
}//class close
