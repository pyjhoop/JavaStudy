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

				for (int i = 1; i <= 10; i++) {
					System.out.print(num + " ");
					num += dif;
				}

			}
			
			

			public void practice12() {

				Scanner sc = new Scanner(System.in);

				// 정수 두개 입력받고 입력된 연산자에따라 알맞은값
				while (true) {

					System.out.print("연산자 : ");

					String op3 = sc.nextLine();
					char op = op3.charAt(0);
					boolean op2 = (op == '+' || op == '-' || op == '/' || op == '%' || op == '*');

					if (op3.equals("exit")) {
						System.out.println("프로그램을 종료합니다");
						return;
					} else

						System.out.print("첫 숫자 : ");
					int num = sc.nextInt();

					System.out.print("두번째 숫자 : ");
					int ber = sc.nextInt();

					sc.nextLine();
					if (op == '/' && ber == 0) {
						System.out.println("0으로 나눌수 없습니다. 다시 입력해주세요");
						continue;
					} else if (!(op2)) {
						System.out.println("없는 연산자 입니다 다시 입력해죠용!-");
					}

					switch (op) {

					case '+':
						System.out.printf("%d %c %d = %d", num, op, ber, (num + ber));
						break;
					case '-':
						System.out.printf("%d %c %d = %d", num, op, ber, (num - ber));
						break;
					case '%':
						System.out.printf("%d %c %d = %d", num, op, ber, (num % ber));
						break;
					case '/':
						System.out.printf("%d %c %d = %d", num, op, ber, (num / ber));
						break;
					case '*':
						System.out.printf("%d %c %d = %d", num, op, ber, (num * ber));
						break;

					}

					System.out.println();
				}

			}
			
			
			public void practice13() {

				Scanner sc = new Scanner(System.in);

				System.out.print(" 정수 입력 : ");
				int num = sc.nextInt();

				for (int i = 1; i <= num; i++) {  // int i=0;으로 하면 입력한 정수보다 한줄 더 나옴
					for (int j = 1; j <= i; j++) {

						System.out.print("*");
					}

					System.out.println();

				}


			}
			
			//피라미드 만드는 공식
			
//			for (int i = 1; i <= num; i++) {  ==> 입력받은 값만큼 i<=num
//				for (int j = 1; j <= i; j++) {  ==> j <= i
//
//					System.out.print("*");
//				}
//
//				System.out.println();
			
			public void practice14() {
				
				Scanner sc = new Scanner(System.in);

				System.out.print(" 정수 입력 : ");
				int num = sc.nextInt();

				for (int i = 0; i < num; i++) {   // 얘는 왜.. 0??
					for (int j = 0; j+i < num; j++) {  // j+i < num??? @_@

						System.out.print("*");
					}

					System.out.println();

				}
				
				// 이건 모르겠다 @_@
				
				
//				 정수 입력 : 4
//				 ****
//				 ***
//				 **
//				 *
				
				
				
				
				
			}
			
	
	//
	
}//
