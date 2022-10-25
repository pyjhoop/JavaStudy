package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	
	public void practice1() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		 

		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		

		
		switch (num) {
		
		case 1 : 
			System.out.println("입력 메뉴입니다");
			break;
		case 2 : 
			System.out.println("수정 메뉴입니다");
			break;
		case 3 : 
			System.out.println("조회 메뉴입니다");
			break;
		case 4 : 
			System.out.println("삭제 메뉴입니다");
			break;
		case 7 : 
			System.out.println("프로그램이 종료됩니다");
			break;

		
		}
		
		sc.close();
		
	}
	
	
	
	public void practice2()  {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("숫자 한개를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num>0 && num%2==0) {
			System.out.println("짝수다");
		} else if (num>0 && num%2==1) {
			System.out.println("홀수다");
		} else {
			System.out.println("양수만 입력해주세요");
		}
		
		
		
		sc.close();
		
		
	}
	
	
	
	public void practice3() {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
				
		System.out.print("영어 : ");
		int eng = sc.nextInt();
				
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor+eng+math;
		double avg = sum/3.0;
		
		
		if (kor>40 && eng >40 && math > 40 && avg >= 60) {
			System.out.println("---------");
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("---------");
			System.out.println("합계 : " + sum);
			System.out.printf("평균 : %.1f" , avg);
			System.out.println();
			System.out.println("축하합니다, 합격입니다 :)");
			
		} else {
			System.out.println("불합격입니다 ㅇ_ㅠ");
		}
		
		sc.close();
		
	}
	
	
	public void practice4() {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int season = sc.nextInt();
				
		
		switch (season) {
			case 3 : 
			case 4 : 
			case 5 : 
				System.out.println(season + "월은 봄입니다");
				break;
			case 6 : 
			case 7 : 
			case 8 : 
				System.out.println(season + "월은 여름입니다");
				break;
			case 9 : 
			case 10 : 
			case 11 : 
				System.out.println(season + "월은 가을입니다");
				break;
			case 12 : 
			case 1 : 
			case 2 : 
				System.out.println(season + "월은 겨울입니다");
				break;
			default : 
				System.out.println(season + "월은 잘못 입력된 달입니다.");
				
		}
		
		sc.close();
		}
		
		
		
	public void practice5() {
		
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		
		if (id.equals("luda") && pw.equals("hana")) {
			System.out.println("로그인 성공");
		} else if (id.equals("luda")){
			System.out.println("비밀번호가 틀렸습니다");
		} else if (pw.equals("hana")) {
			System.out.println("아이디가 틀렸습니다");
		} else {
			System.out.println("둘다 다시 입력해주세요");
		}
				
		
		sc.close();
		
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String name = sc.nextLine();
		
		switch (name) {
		
			case "관리자" :
				System.out.print("회원 관리, ");
				System.out.print("게시글 관리 ");
			case "회원" : 
				System.out.print("게시글 작성, ");
				System.out.print("댓글 작성 ");
			case "비회원" : 
				System.out.print("게시글 조회");
		
		
		
		}
				
		
		sc.close();
			
	}
	
	
	
	public void practice7() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키 (꼭! m로 입력 ex)1.70 ) : ");
		double tall = sc.nextDouble();
		
		System.out.print("몸무게 (kg) : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (tall*tall);
		
		System.out.println("BMI 지수 : "+bmi);
		
		if (bmi < 18.5) {
			System.out.println("저체중");
			
		} else if (bmi <23) {
			System.out.println("정상체중");
		
		}else if (bmi <25) {
			System.out.println("과체중");
			
		}else if (bmi < 30) {
			System.out.println("비만");
			
		}else {
			System.out.println("고도비만");
		}
		
		sc.close();
		
	}
	
	
	
	public void practice8() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 : ");
		int num = sc.nextInt();
		
		System.out.print("피연산자2 : ");
		int ber = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연사자를 입력 (+,-,*,/,%) : ");
		String op = sc.nextLine();
		
		
		boolean tr = (op=="+" && op=="-" && op=="*" && op=="%" && op=="/");
		boolean po = (num>0 && ber>0);
		
	
		
		if (po && op.equals("+")) {
			System.out.println(num+" "+op+" "+ber+" = "+(num+ber));
		}
		
		 else if (po && op.equals("-")) {
			System.out.println(num+" "+op+" "+ber+" = "+(num-ber));
			
		} else if (po && op.equals("*")) {
			System.out.println(num+" "+op+" "+ber+" = "+(num*ber));

		} else if (po && op.equals("/")) {
		System.out.println(num+" "+op+" "+ber+" = "+(num/ber));
		
		
		} else if (po && op.equals("%")) {
			System.out.println(num+" "+op+" "+ber+" = "+(num%ber));
		
		} else if (!tr) {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다");
		}
		
	sc.close();	
		
	}
	
	
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt();

		System.out.print("기말 고사 점수 : ");
		int fin = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int task = sc.nextInt();
		
		System.out.print("출석 회수 : ");
		int att = sc.nextInt();
		
		
		double mid1 = ((mid/100.0)*20);
		double fin1 = ((fin/100.0)*30);
		double task1 = ((task/100.0)*30);
		double att1 = ((att/20.0)*20);
		double sum = (mid1+fin1+task1+att1);
		
		
		
//		System.out.println("----------------결과------------");
//		System.out.printf("중간 고사 점수 (20) : %.1f " ,mid1);
//		System.out.printf("\n기말 고사 점수 (20) : %.1f ",fin1);
//		System.out.printf("\n과제 점수     (30) : %.1f " ,task1);
//		System.out.printf("\n출석 점수     (20) : %.1f ",att1);
//		System.out.printf("\n총점 : %.1f ", sum);
//		System.out.println();
		
		if (sum >= 70 && att > 14) { 
			System.out.println("----------------결과------------");
			System.out.printf("중간 고사 점수 (20) : %.1f " ,mid1);
			System.out.printf("\n기말 고사 점수 (20) : %.1f ",fin1);
			System.out.printf("\n과제 점수     (30) : %.1f " ,task1);
			System.out.printf("\n출석 점수     (20) : %.1f ",att1);
			System.out.printf("\n총점 : %.1f ", sum);
			System.out.printf("\nPASS");
			
		} else if (sum < 70 && att>14)  {
			System.out.println("----------------결과------------");
			System.out.printf("중간 고사 점수 (20) : %.1f " ,mid1);
			System.out.printf("\n기말 고사 점수 (20) : %.1f ",fin1);
			System.out.printf("\n과제 점수     (30) : %.1f " ,task1);
			System.out.printf("\n출석 점수     (20) : %.1f ",att1);
			System.out.printf("\n총점 : %.1f ", sum);
			System.out.printf("\nFAIL [점수 미달]");
			
		} else if (att <=14) {
			System.out.println("----------------결과------------");
			System.out.printf("FAIL [출석 회수 부족 %d/20]",att);
		}
		
		
		sc.close();
		

		
	}
	
	public void practice10() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행할 기능을 선택하세요");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수 / 홀수");
		System.out.println("3. 합격 / 불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		
		System.out.print("선택 : ");
		int num = sc.nextInt();
	
		System.out.println("----------------------------");
		
				if (num==1) {
					ControlPractice c = new ControlPractice();
					c.practice1();
				} else if (num==2) {
					ControlPractice c = new ControlPractice();
					c.practice2();
				} else if (num==3) {
					ControlPractice c = new ControlPractice();
					c.practice3();
				} else if (num==4) {
					ControlPractice c = new ControlPractice();
					c.practice4();
				} else if (num==5) {
					ControlPractice c = new ControlPractice();
					c.practice5();
				} else if (num==6) {
					ControlPractice c = new ControlPractice();
					c.practice6();
				} else if (num==7) {
					ControlPractice c = new ControlPractice();
					c.practice7();
				} else if (num==8) {
					ControlPractice c = new ControlPractice();
					c.practice8();
				} else if (num==9) {
					ControlPractice c = new ControlPractice();
					c.practice9();
				} else {
					System.out.println("다시 입력해주세요");
				}
	
	sc.close();
	
	
	}
	
	
	
	
	
	
	
	
}



