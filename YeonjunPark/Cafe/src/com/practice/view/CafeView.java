package com.practice.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.practice.controller.Cafe;
import com.practice.model.vo.Beverage;
import com.practice.model.vo.Customer;
import com.practice.model.vo.Dessert;
import com.practice.model.vo.Food;

public class CafeView {
	Scanner sc = new Scanner(System.in);
	Cafe c = new Cafe();
	
	
	/**
	 * 1. 카페 오픈시 포스기에 근무자의 이름을 입력하고 ~~출근
	 */
	public void loginForce() {
		System.out.println("\n=== OK포스기 로그인 화면 ===");
		while(true) {
			System.out.println("1. 기존근무자   2. 새로운 근무자");
			System.out.print(">> 번호 입력 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			if(num == 1) {
				System.out.print(">> 이름 입력 : ");
				String name = sc.nextLine();
				int openCafe = c.loginForce(name);
				if(openCafe == 1) {
					System.out.println(name+"님 열일 해주세여!!!");
					break;
				}else {
					System.out.println("잘못입력했습니다. 다시 입력해주세요!!");
					continue;
				}
			} else if(num == 2) {
				System.out.print(">> 새로운 근무자 이름 입력 : ");
				String newName = sc.nextLine();
				c.addEmp(newName);
				System.out.println(newName+"환영합니다. 열일해주세요!");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시입력해주세요");
				continue;
			}
		}
	}
			
			
			
	public void openCafe() {
		System.out.println("\n=== 카페 오픈했습니다. 손님받습니다~ ===");
		int cusNo = 1;
		String size ="";
		int pay = 0;
		String temperature = "";
		ArrayList<Food> orderList = new ArrayList<Food>();
		
		while(true) {
			if(cusNo == 3) break;
			System.out.println((cusNo++)+"번째 손님 들어오십니다.\n");
			System.out.println("손님 무엇을 주문하시겠습니까? ");
			
			while(true) {
				ArrayList<Food> foods = c.selecFood();
				System.out.println("========== 전 메뉴 ===========");
				printMenu(); //전체메뉴 출력 메서드
				System.out.print(">> 주문번호 입력 : ");
				int menuNo = sc.nextInt();
				sc.nextLine();
				
				while(true) {
					try {
						if(foods.get(menuNo-1) instanceof Beverage) {
							System.out.println("\n사이즈는 무엇으로 하시겠습니까?");
							System.out.println("1. Reguler   2. Tall(1000원 추가)");
							System.out.print(">> 번호 입력 : ");
							int selec = sc.nextInt();
							sc.nextLine();
							
							if(selec ==1) {
								size = "Reguler";
							}else if(selec == 2) {
								size = "Tall"; 
							}else {
								System.out.println("1또는 2를 입력해주세요");
								continue;
							}
							System.out.println("1. Hot   2. Ice 둘중 하나 선택해주세요");
							System.out.print(">> 번호 입력 : ");
							int selec1 = sc.nextInt();
							sc.nextLine();
							
							switch(selec1) {
							case 1: temperature = "Hot"; break;
							case 2: temperature = "Ice"; break;
							default: System.out.println("1또는 2를 입력해주세요");
							continue;
							}
							
							
							if(selec == 1) {
								c.addOrderList(new Beverage(foods.get(menuNo-1).getName(), foods.get(menuNo-1).getPrice(), size, temperature));
							}else {
								c.addOrderList(new Beverage(foods.get(menuNo-1).getName(), foods.get(menuNo-1).getPrice()+1000, size, temperature));
							}
						}else {
							c.addOrderList(new Dessert(foods.get(menuNo-1).getName(), foods.get(menuNo-1).getPrice()));
						}
						break;
						
						
					}catch (InputMismatchException e) {
						System.out.println("숫자를 입력해주세요");
						continue;
					}
					
				}// while close 
				
				
				
				
				System.out.print("더 주문하시겠습니까? (y/n) : ");
				char ch = sc.nextLine().toUpperCase().charAt(0);
				if(ch == 'Y') {
					continue;
				}else {
					break;
				}
			}
			
			printOrderList(); // 주문한 음료 및 디저트 출력 메서드
			
			System.out.print("주문한 것과 동일합니까? (y/n) : ");
			char select = sc.nextLine().toUpperCase().charAt(0);
			if(select == 'Y') {
				int total = c.totalPrice();
				System.out.println("총금액 : "+ total);
				System.out.print(">> 지급하실 금액을 입력해주세요 : ");
				pay = sc.nextInt();
			}else if(select == 'N') {
				
			}
			
			System.out.println("혹시 회원이신가요? 1. Yes   2. No");
			System.out.print(">> 번호 입력 : ");
			int num = sc.nextInt();
			sc.nextLine();
			if(num == 1) {
				while(true) {
					System.out.println("전화번호를 입력해주세요 (- 미포함)");
					System.out.print(">> 번호 입력 : ");
					String phone = sc.nextLine();
					// 포인트 적립
					Customer ct = findCus(phone); // 번호로 대상 찾기
					if(ct == null) {
						System.out.println("잘못입력하셨습니다. 다시 입력해 주세요");
						continue;
					}
					
					System.out.println(ct.getName()+"님 환영합니다~");
					
					savePoint(ct);// 포인트 적립
					
					printBill(pay, ct);//영수증에 포인트까지 출력하기.
					
					break;
					
				}
			}else if(num == 2){
				System.out.println("새로 가입하시겠습니까? 1. Yes  2. No");
				System.out.print(">> 번호 입력 : ");
				int num1 = sc.nextInt();
				
				if(num == 1) {
					//register
					register();
					System.out.println("회원가입이 완료되었습니다.");
				}else {
					printBill(pay);
				}
			}
			c.clearOrder();
			System.out.println();
			System.out.println("=============================");
		}
		
		
		
		
	}
	
	public void printMenu() {
		ArrayList<Food> list = c.selecFood();
		for(int i = 0; i< list.size(); i++) {
			System.out.println((i+1)+". "+list.get(i).getName()+" : "+list.get(i).getPrice());
		}
	}
	
	
	
	public void printOrderList() {
		ArrayList<Food> list = c.selectOrderList();
		System.out.println("\n=== 주문하신 음료 및 디저트 ===");
		for(int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
	}
	
	
	public void printBill(int pay, Customer ct) {
		System.out.println("\n====== 계산서 ======");
		System.out.println("현재 주문하신 음식");
		ArrayList<Food> list = c.selectOrderList();
		
		for(int i = 0; i< list.size(); i++) {
			System.out.printf("%s: %d\n",list.get(i).getName(),list.get(i).getPrice());
		}
		System.out.println("===================\n");
		int rest = pay - c.totalPrice();
		System.out.println("받은금액 : "+ pay);
		System.out.println("총금액 : "+ c.totalPrice());
		System.out.println("잔돈 : "+rest);
		System.out.println("남은 포인트 : " +ct.getPoint());
		
	}
	
	public void printBill(int pay) {
		System.out.println("\n====== 계산서 ======");
		System.out.println("현재 주문하신 음식");
		ArrayList<Food> list = c.selectOrderList();
		
		for(int i = 0; i< list.size(); i++) {
			System.out.printf("%-5s: %d\n",list.get(i).getName(),list.get(i).getPrice());
		}
		System.out.println("===================\n");
		int rest = pay - c.totalPrice();
		System.out.println("받은금액 : "+ pay);
		System.out.println("총금액 : "+ c.totalPrice());
		System.out.println("잔돈 : "+rest);
		
	}
	
	public Customer findCus(String phone) {
		ArrayList<Customer> list = c.getCusLIst();
		Customer cc = new Customer();
		for(int i = 0; i< list.size(); i++) {
			if(phone.equals(list.get(i).getPhoneNumber())) {
				cc = list.get(i);
		}else {
			cc = null;
		}
		}
		return cc;
	}
	
	public void savePoint(Customer ct) {
		ct.setPoint(ct.getPoint()+(int)(c.totalPrice()*0.02));
	}
	
	public void register() {
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("폰 번호를 입력해주세요 (-제외) : ");
		String phone = sc.nextLine();
		
		Customer cs = new Customer(name, phone, 0);
		c.addCus(cs);
	}
	
	
}
