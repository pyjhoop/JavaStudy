package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.BankController;
import model.vo.Bank;

public class BankMenu {

	Scanner sc = new Scanner(System.in);
	
	BankController bc = new BankController();
	
	
	public void mainMenu() {
		
	boolean flag=true;	
	while(true==flag) {
	System.out.println("안녕하세요 PM 은행에 오신걸 환영합니다");	
	
	System.out.print("\n기존회원이시면 1번, 신규회원이시면 2번을 입력해주세요 : ");
	int newOld = sc.nextInt();
	sc.nextLine();
	
	switch (newOld) {
	
	
	case 1 : 
	// 기존회원시
		
	
	
	
	
	
	while(true) {
		
		
	System.out.println("\n---- PM 은행 로그인 ----");	
	
	System.out.print("고객님 이름을 입력해주세요 : ");
	String name = sc.nextLine();
	
	System.out.println("\n비밀번호 3번틀릴시 계정이 삭제됩니다");	
	
	System.out.print("아이디 : ");
	String id = sc.nextLine();
	
	System.out.print("비밀번호 : ");	
	String pw = sc.nextLine();
	
	int count = idPw(name, id, pw);
	if(count==1) {
		return;
	}
	
	break;	
	}
		
	
	
		
		
	case 2:	
		System.out.println("\n신규회원님 안녕하세요 회원가입 도와드리겠습니다^^");
		
		System.out.println("이름 : ");
		String nameNew = sc.nextLine();
		
		System.out.print("아이디 : ");
		String idNew = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pwNew = sc.nextLine();
		
		System.out.print("신규 계좌번호 입력해주세요 : ");
		String bankNum = sc.nextLine();
		
		int balance = 0;
		// 계좌번호 몇자리인지 괄호안에 적어주장
		
		bc.newPerson(bankNum, nameNew, idNew, pwNew, balance);
		
		System.out.println(nameNew+"님의 신규계좌가 생성되었습니다");
		System.out.println("신규 계좌생성으로 잔액은 0입니다");
		
		break;
		
	default :
		System.out.println("번호를 다시 입력해주세요"); return;
		
	} // switch
		
		work();
	
	} // while
	
	} // main
	
	
	
	
	
	public void work() {
	
	System.out.println("---------- 은행 업무 안내 ----------");
	
	System.out.println("\n0. 계좌 조회");
	System.out.println("1. 계좌 이체");
	System.out.println("2. 계좌 입금");
	System.out.println("3. 계좌 출금");
		
	System.out.print("메뉴 번호를 입력해주세요 : ");	
	int menu = sc.nextInt();
	sc.nextLine();
	
	
	switch(menu) {
	case 0 : break;
	case 1 : break;
	case 2 : 
		deposit();
		break;
	case 3 : break;
	}

	}//work
	
	
	public void money(String id) {
		ArrayList<Bank> list = bc.selectAccount();
		
		for(Bank b : list) {
			if(id.equals(b.getId())) {
				System.out.println(b.getBalance());
			}
		}
	} // money
	
	
	
	public void deposit() {
		
		// 입금	
		System.out.println("----------------------------------------");	
		System.out.print("\n계좌 입금액 입력해주세요(1000원단위까지만 가능) : ");
		int setMoney = sc.nextInt();
		
		
		// bList불러와서 잔액 변화 일으킬려면 우째해야하지
		// ArrayList<Bank> list = bc.selectAccount(); 이런식은 여기만
//		변할꺼같은데..
			
			
			
		}
	
	

	public int idPw(String name,String id,String pwd) {
		
		ArrayList<Bank> list = bc.selectAccount();
		
		int pwfail = 3;
		
			
		
		for(int i=0; i<list.size(); i++) {
			int num = bc.login(id, pwd);
			
			if(num==0) {
				
				System.out.println("로그인 성공 ^0^");
				
			} else if(num==1) {
				--pwfail;
				System.out.println("\n로그인 실패했습니다");
				System.out.println("비밀번호가 틀렸습니다");
				System.out.println(pwfail+"번 기회 남았습니다");
			} else if (num==2) {
				System.out.println("\n로그인 실패했습니다");
				System.out.println("아이디가 틀렸습니다");
			}
			
		} // for
		
			if (pwfail == 1) {
				bc.delete(name, id);
				System.out.println(name+"님의 계정이 비밀번호 3번 오류로 삭제되었습니다");
				System.out.println("신규 가입으로 다시 시도해주세요");
				
				
			}
			return pwfail;
		
		}
		
		
	

	
	
	
	

	
}//class
