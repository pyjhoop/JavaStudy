package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.CasinoController;

/**
 * @author 이혜민
 * @since 2022.11.22
 */
public class CasinoMenu {

	Scanner sc = new Scanner(System.in);

	CasinoController cc = new CasinoController();
	


	public void mainMenu() {

		
		while (true) {
			
			System.out.println("\n 안녕하세요~");
			System.out.println(" 한번 시작하면 못나가 카지노에 오신걸 환영합니다");
			System.out.println(" 총 3번의 기회 중 성공하면 상금 100만원!!");
			System.out.println(" 실패시 카지노 설거지 알바 한달에 당첨됩니다");
			System.out.println("-----------------------------------------------");
			System.out.print(" 도전하시겠습니까? 1. 예   2. 아니요  : ");
			int answer = sc.nextInt();
			sc.nextLine();

			switch (answer) {
			case 1:
				playCasino();
				break;
			case 2:
				System.out.println(" 아..아쉽네요..기회가 된다면 저희 카지노에 다시 방문해주세요^^");
				return;
			default:
				System.out.println(" 번호안의 숫자를 입력해주세요!");
				System.out.println("----------------------------------------");
				break;
			}// switch

		} // while end

	}// mainMenu end
	
	
	
	public void playCasino() {
		
		int count = 0;

		
		boolean flag = true;
		
		System.out.println("\n 게임을 시작하기전 방법을 설명드리겠습니다 ^^");
		System.out.println("================ 게임 방법 안내 =====================");
		
		System.out.println(" 총 3번의 기회가 있는 슬롯머신 게임입니다");
		System.out.println(" A B C D E   각 5개 자리에 랜덤한 숫자가 생성되었습니다");
		System.out.println("\n 한 자리당 숫자의 범위는 1~10이며, 3번의 up&down 기회를 드립니다");
		System.out.println(" up&down을 통해 정답의 숫자를 유추하고 5개의 랜덤숫자를 입력하면 끝!");
		System.out.println(" 정답일시 그자리에서 상금 100만원 아닐시에는 기회를 2번 더 드립니다");
		System.out.println("\n====================================================");
		
		if(count==3) {
			flag=false;
			correct(); // 정답공개
			System.out.println(" 총 3번의 기회를 다 실패했습니다!");
			System.out.println(" 카지노 설거지 당첨 축하드립니다 ^^");
		}
		
		while(true==flag) {
			
			
		System.out.println((count+1)+"번째 게임 시작하겠습니다");
		

		System.out.println();

		
		for(int i=0; i<3; i++) {
			System.out.print("기회"+(i+1)+" 세번째 자리 숫자 : ");
			int num1 = sc.nextInt();
			int cont3 = num1(num1);
			if(cont3==num1) {
					System.out.println("정답입니다!");
					break;
			}
		}
		
		
		
		
		
		System.out.println("-------------------------------------------");
		
		for(int i=0; i<3; i++) {
			System.out.print("기회"+(i+1)+" 두번째 자리 숫자 : ");
			int num2 = sc.nextInt();
			int cont2 = num2(num2);
			if(cont2==num2) {
					System.out.println("정답입니다!");
					break;
			}
		}
		
		
		System.out.println("-------------------------------------------");
		
		for(int i=0; i<3; i++) {
			System.out.print("기회"+(i+1)+" 세번째 자리 숫자 : ");
			int num3 = sc.nextInt();
			int cont3 = num3(num3);
			if(cont3==num3) {
					System.out.println("정답입니다!");
					break;
			}
		}
		
		System.out.println("-------------------------------------------");	
		for(int i=0; i<3; i++) {
			System.out.print("기회"+(i+1)+" 네번째 자리 숫자 : ");
			int num4 = sc.nextInt();
			int cont4 = num4(num4);
			if(cont4==num4) {
					System.out.println("정답입니다!");
					break;
			}
		}
		System.out.println("-------------------------------------------");	
		
		for(int i=0; i<3; i++) {
			System.out.print("기회"+(i+1)+" 다섯번째 자리 숫자 : ");
			int num5 = sc.nextInt();
			int cont5 = num5(num5);
			if(cont5==num5) {
					System.out.println("정답입니다!");
					break;
			}
		}
		
		
			
		System.out.println("=============== 최종 번호 5개 ==================");
		System.out.print("첫번째 번호 : ");
		int ber1 = sc.nextInt();
		System.out.print("두번째 번호 : ");
		int ber2 = sc.nextInt();
		System.out.print("세번째 번호 : ");
		int ber3 = sc.nextInt();
		System.out.print("네번째 번호 : ");
		int ber4 = sc.nextInt();
		System.out.print("다섯번째 번호 : ");
		int ber5 = sc.nextInt();
		sc.nextLine();
		
		boolean end = cc.total(ber1, ber2, ber3, ber4, ber5);
		
		if(end) {
			correct(); // 정답공개
			System.out.println("축하합니다 ^0^ 상금 100만원 드리겠습니다!!");
			return;
		} else {
			correct(); // 정답공개
			System.out.println("  -_-   ");
			System.out.println("다시 도전 가즈즈즈왕아아ㅏ");
			System.out.println("======="+(count+1)+"번째 기회 실패 ========");
			System.out.println();
		}
		
		
		
		
		count++;
		
		
		} // while
		
	} // play
	
	
	
	public void correct () { // 정답번호 공개 + 실행시 계속 랜덤
		
		System.out.println("===== 정답 번호 공개 =====");
		
		ArrayList cor = cc.selectAll();
		
		for(Object o : cor) {
			System.out.print(o+"  ");
		}
	}
	
	
	public int num1(int num) { // 첫번째 숫자

		int random1 = cc.num1();
		if (num > random1) {
			System.out.println(" Down ↓");
		} else if (num < random1){
			System.out.println(" UP ↑");
		}
		return random1;
	} 
	
	
	
	public int num2(int num) { // 두번째 숫자

		int random2 = cc.num2();
		if (num > random2) {
			System.out.println(" Down ↓");
		} else if (num < random2){
			System.out.println(" UP ↑");
		}
		return random2;
	} 
	
	
	public int num3(int num) { // 3번째 숫자

		int random3 = cc.num3();
		if (num > random3) {
			System.out.println(" Down ↓");
		} else if (num < random3){
			System.out.println(" UP ↑");
		}
		return random3;
	} 

	
	public int num4(int num) { // 4번째 숫자

		int random4 = cc.num4();
		if (num > random4) {
			System.out.println(" Down ↓");
		} else if (num < random4){
			System.out.println(" UP ↑");
		}
		return random4;
	} 
	
	
	public int num5(int num) { // 5번째 숫자

		int random5 = cc.num5();
		if (num > random5) {
			System.out.println(" Down ↓");
		} else if (num < random5){
			System.out.println(" UP ↑");
		}
		return random5;
	} 
	
	

}