package operator;

import java.util.Scanner;

public class G_Triple {
	public void method1() {
		// 입력받은 정수 값이 양수인지 아닌지 판별 후 출력.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력해 주세요 : ");
		int num = sc.nextInt();
		String result = (num>0)? "양수": "음수";
		System.out.println(result);
		sc.close();
	}
	public void method2() {
		//입력 받은 정수값이 짝수인지 홀수인지 판별 후 출력.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력해 주세요 : ");
		int num = sc.nextInt();
		String result = (num % 2 == 0)? "짝수입니다.":"홀수입니다.";
		System.out.println(result);
		sc.close();
	}
	
	public void method3() {
		//사용자에게 종료 여부를 입력 받아 판별해서 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("종료를 원하시면  y를 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		String result = (ch == 'Y' || ch == 'y')? "프로그램을 종료합니다.":"프로그램을 계속합니다.";
		System.out.println(result);
		sc.close();
	}
	public void method4() {
		//입력받은 문자값이 영어 소문자인지 아닌지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("영문자 하나를 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		String result = (ch >= 'a' && ch <= 'z')? "소문자입니다": "소문자가 아닙니다.";
		System.out.println(result);
		sc.close();
	}
	public void method5() {
		//숫자를 입력 받아서 입력한 숫자가 양수, 0 또는 음수인지 판별 
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력해주세요 : ");
		int num = sc.nextInt();
		String result = (num > 0)? "양수":(num == 0)? "0":"음수";
		System.out.println(result);
		sc.close();
	}
	public void method6() {
		//사용자에게 두개의 정수값을 입력받고
		// +또는 -를 입력받아 그에 맞는 연산결과를 출력
		// +, - 이외의 입력은 "잘못입력했습니다" 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("+나 -를 입력하세요: ");
		char op = sc.nextLine().charAt(0);
		String result = (op == '+')? (num1 + num2 + ""):(op == '-')? (num1-num2+""):"잘못 입력했습니다.";
		System.out.println(result);
		sc.close();
	}
}
