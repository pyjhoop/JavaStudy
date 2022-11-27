package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.CoffeeController;
import model.vo.Coffee;
import model.vo.Dessert;
import model.vo.Person;

public class CafeMenu {
	
	Scanner sc = new Scanner(System.in);
	
	CoffeeController cc = new CoffeeController();
	
	
	public void mainMenu() {
		
		boolean flag3 = true;
		
		while(flag3==true) {
			
			
		int openClose2 = work();
		
		if(openClose2==2) {
			continue;
		}
		
		
		kiosk();
		dessert();
	
									
		
		} // while

		
		
	} // main
	
	
	
	public int work() {
		
		System.out.println("\n안녕하세요 MiniCafe 관리 프로그램입니다");
		
		System.out.println("\n1. 영업시작   2. 영업종료");
		System.out.print("원하는 메뉴를 입력해주세요 : ");
		int openClose = sc.nextInt();
		
		
		if(openClose==1) {
			
		System.out.println("---------------------------------------------------");
		
		// 그럼 여기 일하는 직원 출력도 arraylist해서 추가하면 
		// 한바퀴 돌았을때 그분도 추가되게 만들어야하지않을까?
		
		System.out.println("근무자 전체 조회는 88번 입력해주세요");
		System.out.println("등록되지 않은 새로운 직원분이면 99번 입력해주세요");
		
		System.out.println(cc.selectPerson());
		
		// 오늘이 날짜출력하는거 그걸로 가능한지 해보기
		System.out.print("\n오늘 근무자 번호를 입력해주세요 : ");
		int num = sc.nextInt();
		// 0번 입력했을때 새롭게 추가하는 메소드 cc에 구성
		
		if(num==99) {
			insertPerson();
		}else if(num==88) {
			selectPerson();
		}
		
		/*
		 * 
		 * 여기 오류남 등록은 잘되는데 
		 * num이 밑에 todayworker만나면서 오류뜸;; 고치기
		 * 
		 * 추가했는데도 인덱스 범위가 벗어났나??
		 * IndexOutOfBoundsException 발생
		 * 
		 * */
		

		
		System.out.println("\n안녕하세요  " + cc.todayWorker(num)+"님 :-)");
		System.out.println("근무 시작하겠습니다 주문 키오스크 작동합니다");
		System.out.println("==================================================");
		
		} else if (openClose==2) {
			
			System.out.println("\n영업을 종료합니다");
			System.out.print("근무시간을 입력해주세요(숫자로) : ");
			int workTime = sc.nextInt();
			
			System.out.println("\n오늘 일급은 "+cc.workPay(workTime)+"원 입니다");
			System.out.println("오늘 가게 매출은 총"/*가게 매출 메소드*/);
			System.out.println("수고하셨습니다 내일뵙겠습니다^^");
			System.out.println("\n====================================================");
			
		} // openClose 
		
		
		return openClose;
	} // work
	
	
	
	
	
	
	
	public void kiosk() {
		
		boolean flag = true;
		
		while(flag ==true) {
		
		System.out.println("\n고객님 안녕하세요 주문 도와드리겠습니다");
		
		System.out.println();
		selectCoffee();
		System.out.print("\n원하는 음료의 번호를 입력하세요 : ");
		int order = sc.nextInt();
		
		
		System.out.println("\n음료의 온도는 1.cold / 2.hot  (cold 주문시 500원 추가)");
		System.out.print("어떤걸로 드시겠습니까? : ");
		int temper = sc.nextInt();
		

		System.out.println("\n사이즈는 무엇으로 하시겠습니까?");
		System.out.println("1. tall  2.grande (사이즈 업 1000원 추가)");
		System.out.print("번호를 입력해주세요 : ");
		int size = sc.nextInt();
		
		
		System.out.println("\n1. 포장 2. 매장 (포장 선택시 환경부담금 500원 추가)");
		System.out.print("어떻게 도와드릴까요? : ");
		int takeout = sc.nextInt();
		
		if(takeout==2) {
			
		}
		
		int coffeePay2 = cc.coffeePay(order, temper, size, takeout);
		int coffeeTotal = 0;
		
		System.out.println("결제금액은 "+coffeePay2+"원 입니다");
		// 추가주문시 총 결제금액 누적합 멘트도 추가
		//--------------- 실행안됨
		
		
		
		System.out.print("\n음료 추가 주문하시겠습니까? 1.네  2.아니요  : ");
		int reorder = sc.nextInt();
		
		if(reorder==1) {
			continue;
		}else if(reorder==2) {
			/*
			 * 커피 누적합 실행안됨
			 * 
			 */
			coffeeTotal += coffeePay2;
			System.out.println("주문 총 금액 "+coffeeTotal+"원 입니다");
			flag = false;
		} // 나머지 숫자 문자일때 예외처리할수있음 하고~
		
		
		} // while - 커피 주문1
		
		
		// dessert 메소드 호출?
		
		
	} // kiosk
	
	
	
	
	public void dessert() { 
		
		boolean flag2 = true;
		
		System.out.println("---------------------------------------------------");
		System.out.print("디저트 주문 원하시면 1번, 원치않으시면 2번을 입력해주세요 : ");
		int des = sc.nextInt();
		
		while(true==flag2) {
		
		 if(des==2) {
			flag2=false;
			
		} else if(des==1) {
			
		
		// 나머지 숫자 문자일때 예외처리할수있음 하고~
		
		System.out.println();
			selectDessert();
		System.out.print("\n원하는 케이크 번호를 입력해주세요 : ");
		int cake = sc.nextInt();
		
		// 숫자범위 아닐시 + 한글입력시 예외처리 할수있음 하고 ~.~
		
		
		System.out.println("\n1. 매장에서 섭취  2. 포장 (주문시 1000원 추가)");
		System.out.print("어떻게 도와드릴까요? : ");
		int takeout = sc.nextInt();
		
		System.out.println("결제금액 "+cc.cakePay(cake, takeout)+"원 입니다");
		
		
		System.out.print("\n추가 주문하시겠습니까? 1.네  2.아니요  : ");
		int reorder = sc.nextInt();
	
		if(reorder==2) {
			flag2=false;
		}
		
		
		}
		
	
		
		
		} // while
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println("결제창으로 이동합니다");
		System.out.println("---------------------------------------------");
		
		
	} // dessert
	
	

	
	
	
	
	
	

	public void pay() {
		
		
		System.out.println("------ 영수증 --------");
		//먹은 음료와 디저트 이름+가격 출력
		// 총금액 출력하는 메소드 cc에 구성
		
		
		System.out.println("결제 도와드리겠습니다");
		
		System.out.println("감사합니다 또 방문해주세요 ^-^");
		System.out.println("=====================================================");
		
		
	} // pay
	
	
	
	public void insertPerson() {
		sc.nextLine();
		System.out.println("----- 새로운 근무자 추가 -------");
		
		System.out.println("현재 0~2번 근무자는 있습니다");
		System.out.print("근무자 번호 입력해주세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		
		System.out.print("근무자 이름 입력해주세요 : ");
		String name = sc.nextLine();
		
		cc.insertPerson(num, name);
		System.out.println("성공적으로 근무자가 추가되었습니다");
		
	} // insertPerson
	
	
	
	
	public void selectCoffee() {
		
		ArrayList<Coffee> list = cc.selectCoffee();
		
		for(Coffee c : list) {
			System.out.println(c);
		}
		
	}
	
	
	
	public void selectDessert() {
		
		ArrayList<Dessert> list = cc.selectDessert();
		
		for(Dessert d : list) {
			System.out.println(d);
		}
		
		
	}
	
	
	
	
	public void selectPerson() {
		ArrayList<Person> list =  cc.selectPerson();
		
		for(Person p : list) {
			System.out.println(p);
		}
	}
	
	
	
//	public int coffeePay(int order, int temper, int size, int takeout) {
//		int total = cc.coffeePay(order, temper, size, takeout);
//		return total;
//	}
	
	
	
	// 한바퀴돌때 결제금액 누적도 구할수있으면 하기
	

} // class
