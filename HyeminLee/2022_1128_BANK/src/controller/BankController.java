package controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

import model.vo.Bank;

public class BankController {

	private ArrayList<Bank> bList = new ArrayList<Bank>();
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;
	
	{
		bList.add(new Bank("1002-333-9687865", "사과", "apple", "1234", 1000000));
		bList.add(new Bank("3333-123-456789", "춘식이", "kakao", "18", 50000));
	}
	
	//  내 계좌 조회 (사용내역, 잔액, 이체내역??)
	
	
	/*
	public void selectAccount임시() {
	
	String input = sc.nextLine(); -- 으로 계좌이체 받은내용이라 치면
	
	if (총 계좌 조회멘트) {
		int i=0;
		save(input);
		
		LinkedList tmp = (LinkedList)q;
		ListIterator it = tmp.listIterator();
		
		while(it.hasNext())
			System.out.println(++i + );
		
	}
	
	}
	*/
	
	public ArrayList<Bank> selectAccount() {
		
		return bList;
	}
	
	
	
	// 로그인 시도 3번 실패시 계좌 삭제되는 메소드 만들기
	
	public int login(String id, String pw) {

		// 아이디가 틀리면 아이디가 틀렸습니다
		// 비번도 마찬가지
		// 3번이상 틀리면 count로 숫자 세고 넘을시 리스트에서 remove?
		int num = 0;

		for (int i = 0; i < bList.size(); i++) {

			if (id.equals(bList.get(i).getId())) {

				if (pw.equals(bList.get(i).getPwd())) {
					num = 0; // 아이디랑 비번까지 같아
				} else {
					num = 1; // 아이디는 같고 비번은 달라
				}
			} else {
				num = 2; // 아이디부터 틀려
				
			}
		} // for
		return num;
	}
	
	
	
	public void delete(String name,String id) {
		
		for(int i=0; i<bList.size(); i++) {
			if(name.equals(bList.get(i).getName()) && 
				id.equals(bList.get(i).getId())) {
				bList.remove(i);
			}
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	// 계좌이체하기 (금액,계좌번호)
	
	
	
	// 입금 + 잔액에 합쳐서 출력
	
	public void deposit(int money) {
		
	
		
		
	
		
		
		
	}
	
	
	// 출금+  잔액에 합쳐서 출력
	public void withdrawal() {
	
		
		
		
		
		
		
	}
	
	
	// 신규가입 리스트 추가
	public void newPerson(String accountNumber, String name, String id,String pwd, int balance) {
		bList.add(new Bank(accountNumber, name, id, pwd, balance));
	}
	
	


	
	
	
	
	
	
	
	
	
	
	
} // controller
