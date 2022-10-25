package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		String result = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menuNum = sc.nextInt();
		switch(menuNum) {
		case 1:
			result = "입력";
			break;
		case 2:
			result = "수정";
			break;
		case 3:
			result = "조회";
			break;
		case 4:
			result = "삭제";
			break;
		case 7:
			result = "종료";
			break;
		}
		System.out.println(result +" 메뉴입니다.");
		sc.close();
		
	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		if(num > 0) {
			if(num % 2 ==0) {
				System.out.println("짝수다.");
			}else {
				System.out.println("홀수다.");
			}
		}else {
			System.out.println("양수만 입력해주세요.");
		}
		sc.close();
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		int sum = kor + math + eng;
		double avg = sum/3.0;
		if(kor>=40 && eng>=40 && math>=40 && avg>=60) {
			System.out.printf("국어 : %d\n", kor);
			System.out.printf("수학 : %d\n", math);
			System.out.printf("영어 : %d\n", eng);
			System.out.printf("합계 : %d\n", sum);
			System.out.printf("평균 : %.1f\n", avg);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
		sc.close();
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		String result="";
		switch(month) {
		case 3:
		case 4:
		case 5: result = "월은 봄입니다."; break;
		case 6:
		case 7:
		case 8: result = "월은 여름입니다."; break;
		case 9:
		case 10:
		case 11: result = "월은 가을입니다."; break;
		case 12:
		case 1:
		case 2: result = "월은 겨울입니다."; break;
		default: result = "월은 잘못 입력된 달입니다.";
		}
		System.out.println(month+result);
		sc.close();
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		String id = "pyjhoop";
		String pwd = "qwe123";
		System.out.print("아이디 : ");
		String inputId = sc.nextLine();
		System.out.print("비밀번호 : ");
		String inputPwd = sc.nextLine();
		if(id.equals(inputId) && pwd.equals(inputPwd)) {
			System.out.println("로그인 성공.");
		}else if(id.equals(inputId) && !pwd.equals(inputPwd)) {
			System.out.println("비밀번호가 틀렸습니다.");
		}else if(!id.equals(inputId) && pwd.equals(inputPwd)){
			System.out.println("아이디가 틀렸습니다.");
		}else {
			System.out.println("아이디와 비밀번호가 틀렸습니다.");
		}
		sc.close();
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String access = sc.nextLine();
		switch(access) {
		case "관리자": System.out.print("회원관리, 게시글 관리, ");
		case "회원" : System.out.print("게시글 작성, 댓글 작성, "); 
		case "비회원" : System.out.print("게시글 조회"); break;
		default: System.out.println("잘못된 회원 등급입니다.");
		}
		sc.close();
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키(cm)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		double bmi = weight/(height*height);
		System.out.println("BMI 지수 : "+ bmi);
		if(bmi<18.5) {
			System.out.println("저체중");
		}else if(bmi<23) {
			System.out.println("정상체중");
		}else if(bmi<25) {
			System.out.println("과체중");
		}else if(bmi < 30) {
			System.out.println("비만");
		}else {
			System.out.println("고도비만");
		}
		sc.close();
		
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char op = sc.nextLine().charAt(0);
		int result = 0;
		if(num1 > 0 && num2 > 0) {
			switch(op) {
			case '+': result = num1 + num2; break;
			case '-': result = num1 - num2; break;
			case '/': result = num1 / num2; break;
			case '*': result = num1 * num2; break;
			case '%': result = num1 % num2; break;
			default: System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
		}
		System.out.printf("%d %c %d = %d",num1,op,num2,result);
		sc.close();
	}
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("중간 고사 점수 : ");
		double midScore = sc.nextInt() * 0.2;
		System.out.print("기말 고사 점수 : ");
		double finalScore = sc.nextInt() * 0.3;
		System.out.print("과제 점수 : ");
		double hwScore = sc.nextInt() * 0.3;
		System.out.print("출석 회수 : ");
		double number = sc.nextDouble();
		double total = midScore + finalScore + hwScore + number;
		System.out.println("========== 결과 ==========");
		if(total>=70) {
			System.out.printf("중간 고사 점수(20) : %.1f\n", midScore);
			System.out.printf("기말 고사 점수(30) : %.1f\n", finalScore);
			System.out.printf("과제 점수    (30) : %.1f\n",hwScore);
			System.out.printf("출석 점수    (20) : %.1f\n", number);
			System.out.printf("총점 : %.1f\n",total);
			System.out.println("PASS");
		}else if(number/20 <= 0.7) {
			System.out.printf("Fail [출석 회수 부족 (%.0f/20)]",number);
		}else {
			System.out.printf("중간 고사 점수(20) : %.1f\n", midScore);
			System.out.printf("기말 고사 점수(30) : %.1f\n", finalScore);
			System.out.printf("과제 점수    (30) : %.1f\n",hwScore);
			System.out.printf("출석 점수    (20) : %.1f\n", number);
			System.out.printf("총점 : %.1f\n",total);
			System.out.println("Fail [점수미달]");
		}
		sc.close();
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		switch(num) {
		case 1: practice1(); break;
		case 2: practice2(); break;
		case 3: practice3(); break;
		case 4: practice4(); break;
		case 5: practice5(); break;
		case 6: practice6(); break;
		case 7: practice7(); break;
		case 8: practice8(); break;
		case 9: practice9(); break;
		}
		sc.close();
	}
}

