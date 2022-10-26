package control;

import java.util.Scanner;

public class C_For {
	public void method1() {
		for(int i = 0; i<4; i++) {
			System.out.println("안녕하세요");
		}
		for(int i = 0; i<4; i++) {
			System.out.println("반갑습니다.");
		}
	}
	public void method2() {
		//1 2 3 4 5
		for(int i =1; i<=5;i++) {
			System.out.print(i+" ");
		}
	}
	public void method3() {
		//5 4 3 2 1
		for(int i = 5; i>=1; i--) {
			System.out.print(i+" ");
		}
	}
	public void method4() {
		int random = (int)(Math.random()*10 +1);
		System.out.println("랜덤값 : "+random);
		int sum = 0;
		for(int i = 1; i <=random;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	public void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("2~9사이의 숫자 입력");
		int num = sc.nextInt();
		for(int i =1;i<=9;i++) {
			System.out.printf("%d x %d = %d\n",num,i,num*i);
		}
	}
}
