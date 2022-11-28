package com.practice.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.practice.controller.Bank;
import com.practice.model.vo.Account;

public class BankApp {
	Scanner sc = new Scanner(System.in);
	Bank b = new Bank();
	
	public void printView() {
		int selectMember = selectMember();
		if(selectMember == 1) {
			 existingMember();
			//기존회원일 시 아이디와 비밀번호를 입력받아서 비교후 로그인 성공!
			//한 아이디에 비번만 실패하면 아이디 삭제당함.
		}else if(selectMember == 2) {
			//계좌번호, 아이디, 비번, 잔금 입력받아서 객체 생성
		}
		
		
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
	public void existingMember() {
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
				break;
			}
		}
		if(cnt == 3) {
			//아이디로 계정 삭제하는 메서드
			b.deleteAccount(id);
			System.out.println("PMBank 보안사항에 따라 아이디가 삭제됩니다!");
		}
		
		
	}
	
	
	
	
}//class close
