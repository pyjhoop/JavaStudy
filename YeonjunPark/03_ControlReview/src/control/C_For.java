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
	public void method13() {
		//2부터 9까지 랜덤값 발생시켜서 랜덤단 출력하기
		// 구구단
		
		int random = (int)(Math.random()*8 + 2);
		System.out.println(random+"단");
		for(int i = 1; i<=9;i++) {
			System.out.printf("%d x %d = %d\n",random,i,random*i);
		}
	}
	public void method14() {
		// 중첩 for문으로 1 2 3 4 5 5줄 출력하기
		for(int i =0; i<5;i++) {
			for(int j = 1; j<=5;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public void method15() {
		///**** 4세트 출력하기 
		// 2중 반복이 필요하겠네.
		for(int i =1 ; i<=4;i++) {
			for(int j =1; j<=4; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	public void method16() {
		//1***
		//*2**
		//**3*
		//***4 출력하기. 규칙을 찾아라.
		for(int i = 1; i<=4; i++) {
			for(int j = 1; j<=4; j++) { // 먼저 별부터 찍어본뒤
				if(i==j) { // 조건을 생각해서 if문을 삽입.
					System.out.print(i);
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
	public void method17() {
		//2단부터 9단까지 출력.
		// 1단을 for문으로 처리함. 2~9단까지 하기 위해선 이중for문이 필요
		for(int dan = 2; dan<=9; dan++) {//2~9단을 처리하기 위한 for
			System.out.println("========"+ dan+"========");
			for(int i = 1; i<=9; i++) {
				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
			}
		}
	}
}
