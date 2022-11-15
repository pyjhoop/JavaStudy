package eatout.run;

import java.util.InputMismatchException;
import java.util.Scanner;

import eatout.model.vo.Resturant;
import eatout.model.vo.Sushi;

public class EatRun {

	// =_=... 뭔가 아닌데 일단..ㅇㅋ
	
	public static void main(String[] args) {

		Resturant rs = new Sushi();

		Sushi[] su = new Sushi[8];

		su[0] = new Sushi("뱅글뱅글 초밥집", 9900, "0번 식사종료 ");
		su[1] = new Sushi("1. 소고기 초밥", 3500);
		su[2] = new Sushi("2. 연어 초밥", 2500);
		su[3] = new Sushi("3. 한치 초밥", 2000);
		su[4] = new Sushi("4. 성게알 초밥", 5500);
		su[5] = new Sushi("5. 생새우 초밥", 2000);
		su[6] = new Sushi("6. 가리비 초밥", 1000);
		su[7] = new Sushi("7. 새우 초밥", 1500);

		Scanner sc = new Scanner(System.in);
		


		int sum = 0;
		int order = 0;
		
		System.out.println("1. 회전 초밥");
		System.out.println("2. 회전 소고기화로구이집");
		
		System.out.print("외식이 땡기는데 어디갈까? ^--^ : ");
		int num = sc.nextInt();

		if (num == 1 || num == 2) {
			System.out.println("1) 주문서 작성해서 원하는 메뉴 먹기");
			System.out.println("2) 회전으로 랜덤하게 먹을래");
			System.out.print("어떤걸 선택하시겠습니까? : ");
			order = sc.nextInt();
			sc.nextLine();
			System.out.println();
		} else {
			System.out.println("번호 다시 입력해주세요~");

		} //  주문&회전 if문

		System.out.println(su[0].toString());
			while (true) {
				if (num == 1 && order == 1) {

				for (int i=1; i<su.length; i++){
					System.out.println(su[i].infor());
				}
				System.out.println("식사 종료를 원하시면 0번을 입력해주세요");
				System.out.print("번호를 입력해주세요 : ");
				try {
					int menu = sc.nextInt();
					sc.nextLine();
					if (menu > 0 && menu < 8) {
						sum += su[menu].getPrice();
						System.out.println(su[menu].getName() + " --- 누적 금액은 : " + sum + "입니다 ^^");
					}else if (menu==0){
						System.out.println();
						System.out.println("식사금액 총 " + sum + "원 나왔습니다");
						break;
						
					} else {
						System.out.println("다시 입력해주세요");
						continue;
						
					}
				} catch (InputMismatchException e) {
					System.out.println("숫자로만 입력해주세요~");
				}

				System.out.println("----------------------------------------");

		
		
				// 1번
//			System.out.print("추가 주문하시겠습니까? 종료하시면 주문하신 음식 가져다드리겠습니다 (y/n) : ");
//			char yn = sc.nextLine().toUpperCase().charAt(0);
//			if (yn == 'N') {
				System.out.println();
				System.out.println("냠냠냠 '3' 아이 맛있다~");
//				System.out.print("그만 드시겠습니까? (y/n) : ");
//				char yn2 = sc.nextLine().toUpperCase().charAt(0);
//				if (yn2 == 'N') {
//					continue;
//				} else if (yn2 == 'Y') {
//					break;
//				} else {
//					System.out.println("다시 입력해주세요");
//				}
//
//			} else if (yn == 'Y') {
//				continue;
//			} else {
//				System.out.println("Y or N로 다시 입력해주세요^^");
//				System.out.println("---------------------------");
//				continue;
				// 잘못입렸했을때 1번으로만 돌아가고싶은데..씁
//			}
				} else if (num==1 && order ==2) {
					while(true) {
						System.out.println();
						int random = (int)(Math.random()*7+1);
						System.out.println(su[random].infor());
						
						System.out.print("1번 먹기 / 2번 다른 초밥기다리기 / 0번 식사종료 : ");
						int ran = sc.nextInt();
						sc.nextLine();
						if (ran==2) {
							continue;
						} else if (ran==1) {
							sum += su[random].getPrice();
							System.out.println(su[random].getName() + " --- 누적 금액은 : " + sum + "입니다 ^^");
						}else if (ran==0) {
							break;
						}else {
							System.out.println("다시 입력해주세요");
							continue;
							
						}
						
					}
					System.out.println("식사금액 총 " + sum + "원 나왔습니다");
					break;
				}


		
			}
	
		while (true) {
			
		System.out.print("돈 입금해주세요 ^--^* : ");
		int pay = sc.nextInt();

		int money = rs.balance(sum, pay);
		
		if (sum>pay) {
			System.out.println(pay + "원 장난해요? 돈이 모자라요 다시 입금해주세요..-_-+ ");
		} else if(sum==pay) {
			System.out.println("깔끔한 계산이네용! 감사합니다 또 오세용!");
		}
		else {
			System.out.println("여기 잔액 " + money + "원 입니다 감사합니다 또오세요 >_<");
			return;
		}
		
		// 돈을 작게줘서 계속 돈을 받으면서 - 누적금액에서 까서 나중에 잔액나오는거는 어떻게 할수있을깡

		}

}
}


