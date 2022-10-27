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

				System.out.print("1이상의 숫자를 입력해죠 : ");
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

				System.out.print("1이상의 숫자를 입력해죠 : ");
				int num = sc.nextInt();

				if (num >= 1) {
					for (; num >= 1; num--) {
						System.out.print(num + " ");

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
						for (; num >= 1; num--) {
							System.out.print(num + " ");

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
			
			
			
	
	
	
}
