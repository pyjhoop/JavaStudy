package control;

import java.util.Scanner;

public class F_Break {
	public void method1() {
		//랜덤값 1~100사이 발생시키고 그 랜덤값을출력(무한반복)
		//단 발생된 랜덤값이 3의 배수일 경우 반복문을 빠져나가자
		while(true) {
			int random = (int)(Math.random()*100 +1);
			System.out.println("랜덤값 : "+random);
			if(random % 3 == 0) break;
		}
	}
	public void method2() {
		// 무한반복으로 사용자에게 문자열을 입력받고 길이를 출력하는 프로그램.
		// 단 exit를 입력받으면 반복문 종료
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("문자열을 입력해주세요 : ");
			String str = sc.nextLine();
			if(str.equals("exit")) {
				System.out.println("반복문을 종료합니다.");
				break;
			}
			System.out.println("문자열의 길이 : "+ str.length());
			
		}
		
	}
	public void method3() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("2~9 사이의 숫자를 입력하세요: ");
			int num = sc.nextInt();
			if(num >=2 && num <=9) {
				for(int i =1; i<=9; i++) {
					System.out.printf("%d x %d = %d\n", num,i,num*i);
				}
				break;
			}else {
				System.out.println("다시입력하세요.");
				
			}
			
		}
	}
}
