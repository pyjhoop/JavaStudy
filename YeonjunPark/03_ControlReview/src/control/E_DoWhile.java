package control;

import java.util.Scanner;

public class E_DoWhile {
	public void method1() {
		int num=1;
		do {
			System.out.println("num의 값: "+num);
			
		}while(false);
	}
	
	public void method2() {
		//1 2 3 4
		int i = 1;
		do {
			System.out.print(i + " ");
			i++;
		}while(i<=4);
	}
	public void method3() {
		//1부터 사용자가 입력한 수까지의 총 합계
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		int i =1;
		do {
			sum+=i;
			i++;
		}while(i<=num);
		System.out.println(sum);
	}
}
