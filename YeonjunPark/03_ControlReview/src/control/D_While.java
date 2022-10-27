package control;

import java.util.Scanner;

public class D_While {
	public void method1() {
		//안녕하세요 5번 출력;
		int i = 1;
		while(i<=5) {
			System.out.println("안녕하세요");
			i++;
		}
	}
	public void method2() {
		//1 2 3 4 5
		int i = 1;
		while(i<=5) {
			System.out.print(i + " ");
			i++;
		}
	}
	public void method3() {
		//1에서부터 10까지 출력
		// 홀수도 출력해보기
		int i = 1;
		while(i<=10) {
			if(i%2 ==0)
			System.out.print(i + " ");
			i++;
		}
	}
	public void method4() {
		//1부터 random값의 합계 random은 1~100
		int random = (int)(Math.random()*100 + 1);
		int sum = 0;
		for(int i = 1; i<=random;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
	public void method5() {
		//문자열을 입력받고 문자열의 길이를 출력하가.
		//문자열의 각 문자들을 개행하면서 출력을 해보자
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요: ");
		String str = sc.nextLine();
		System.out.println("문자열의 길이는 : "+str.length());
		for(int i =0; i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
	}
}
