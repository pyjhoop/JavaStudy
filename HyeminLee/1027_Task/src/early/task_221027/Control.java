package early.task_221027;

import java.util.Scanner;

public class Control {

	
	

		public void practice1() {
			
			Scanner sc = new Scanner(System.in);

			System.out.print("1이상의 숫자를 입력해죠 : ");
			int num = sc.nextInt();

			if (num >= 1) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");

				}
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요");
			}
		}
		
		
		public void practice2() {
			
			Scanner sc = new Scanner(System.in);

			
			while (true) {

				System.out.print("1 이상의 숫자를 입력해죠 : ");
				int num = sc.nextInt();

				if (num >= 1) {
					for (int i = 1; i <= num; i++) {
						System.out.print(i + " ");

					}
				} else {
					System.out.println("1 이상의 숫자를 입력해주세요");
				}
				System.out.println();
			}

		}
			
			
			
			public void practice3() {
				
				Scanner sc = new Scanner(System.in);

				System.out.print("1 이상의 숫자를 입력해죠 : ");
				int num = sc.nextInt();

				if (num >= 1) {
					for (int i = num; i >= 1; i--) {
						System.out.print(i + " ");

					}
				} else {
					System.out.println("1 이상의 숫자를 입력해주세요");
				}
			}
			
			
			public void practice4() {

				Scanner sc = new Scanner(System.in);

				while (true) {
					System.out.print("1 이상의 수 입력 : ");
					int num = sc.nextInt();

					if (num >= 1) {
						for (int i=num; i >= 1; i--) {
							System.out.print(i + " ");

						}
					} else {
						System.out.println("1이상만 입력가능해~");
					}

					System.out.println();
				}

			}
			

			public void practice5() {

				Scanner sc = new Scanner(System.in);

				System.out.print("정수 하나 입력해주세용 : ");
				int num = sc.nextInt();

				int sum = 0;

				for (int i = 1; i <= num; i++) { // 입력한거까지 합계
					sum += i;
					System.out.print(i + " + "); // i가 계속 반복되야함
				}

				System.out.println(" = " + sum); // 합 출력

			}
			
			
			
			public void practice6() {

				Scanner sc = new Scanner(System.in);

				System.out.print("첫 번째 숫자 : ");
				int num1 = sc.nextInt();

				System.out.print("두 번째 숫자 : ");
				int num2 = sc.nextInt();

				if (num1 >= 1 && num2 >= 1) {

					for (int i = num1; i <= num2; i++) {
						System.out.print(i + " ");
					}

					for (int i = num2; i <= num1; i++) {

						System.out.print(i + " ");

					}

				} else {
					System.out.println("1 이상의 숫자를 입력해주세요");
				}

			}
			
			
			public void practice7() {

				Scanner sc = new Scanner(System.in);

				while (true) {

					System.out.print("첫 번째 숫자 : ");
					int num1 = sc.nextInt();

					System.out.print("두 번째 숫자 : ");
					int num2 = sc.nextInt();

					if (num1 >= 1 && num2 >= 1) {

						for (int i = num1; i <= num2; i++) {
							System.out.print(i + " ");
						}

						for (int i = num2; i <= num1; i++) {
							System.out.print(i + " ");
						}
					} else {
						System.out.println("1 이상의 숫자를 입력해주세요");
					}
					System.out.println();
				}

			}
			
			
			public void practice8() {

				Scanner sc = new Scanner(System.in);

				System.out.print("숫자 : ");
				int dan = sc.nextInt();

				System.out.println("-------" + dan + "단--------");

			
					for (int j = 1; j < 10; j++) {
						System.out.printf("%d x %d = %d\n", dan, j, dan * j);
					
				}

			}
			
			
			public void practice9() {

				Scanner sc = new Scanner(System.in);

				System.out.print("숫자 : ");
				int dan = sc.nextInt();
		


				if (dan<10) {
					for (int i=dan; i<10;i++) {
						System.out.println("-------" + i+ "단--------");
					for (int j = 1; j < 10; j++) {
						System.out.printf("%d x %d = %d\n", i, j, i * j);
					}
					}
				
				
				}else { 
					System.out.println("9이하의 숫자만 입력해주세요");
				}
			} 
			
			
			
			
			public void practice10() {

				Scanner sc = new Scanner(System.in);

				while (true) {

					System.out.print("숫자 : ");
					int dan = sc.nextInt();

					if (dan < 10) {
						for (int i = dan; i < 10; i++) {
							System.out.println("-------" + i + "단--------");
							for (int j = 1; j < 10; j++) {
								System.out.printf("%d x %d = %d\n", i, j, i * j);
							}
						}
						break;

					} else {
						System.out.println("9이하의 숫자만 입력해주세요");
					}
				}
			}
			
			
			public void practice11() {
				
				
				Scanner sc = new Scanner(System.in);
				
				System.out.print("시작 숫자 : ");
				int num = sc.nextInt();
				
				System.out.print("공차 숫자 : ");
				int dif = sc.nextInt();
		
	// 출력은 10번만
	// 옆으로 나란히, 차이는 계속 있고
			
				for (int i=1;i<=10;i++) {
					System.out.print(num + " ");
					num += dif;
				}
				
				
				
			}
			
			
			
			
			
			
			
	
	//
	
}//
