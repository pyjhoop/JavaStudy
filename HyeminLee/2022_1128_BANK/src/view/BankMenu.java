package view;

import java.util.Scanner;

public class BankMenu {

	Scanner sc = new Scanner(System.in);
	
	
	public void mainMenu() {
		
	
	System.out.println("안녕하세요 PM 은행에 오신걸 환영합니다");	
	
	System.out.print("\n기존회원이시면 1번, 신규회원이시면 2번을 입력해주세요 : ");
	int newOld = sc.nextInt();
	sc.nextLine();
	
	switch (newOld) {
	
	
	case 1 : 
	// 기존회원시
	System.out.println("---- PM 은행 로그인 ----");	
	System.out.println("로그인 시도 3번틀릴시 아이디 삭제됩니다");	
	
	System.out.print("아이디 : ");
	String id = sc.nextLine();
	
	System.out.print("비밀번호 : ");	
	String pw = sc.nextLine();
	
	// if문?? 아이디가 틀릴시 아이디 틀렸다고 비밀번호가 틀리면 비번틀림
		
		
		
	break;	
		
		
	case 2:
		
		System.out.println("\n신규회원님 안녕하세요 회원가입 도와드리겠습니다^^");
		System.out.print("아이디 : ");
		String idNew = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pwNew = sc.nextLine();
		
		System.out.print("신규 계좌번호 입력해주세요 : ");
		String bankNum = sc.nextLine();
		
		// 계좌번호 몇자리인지 괄호안에 적어주장
		
		
		
		
		
		break;
		
		
		
		
		
	} // switch
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // main
	

	
}
