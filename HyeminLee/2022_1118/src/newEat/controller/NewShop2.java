package newEat.controller;

import java.util.ArrayList;
import java.util.Scanner;

import newEat.model.vo.Beef;
import newEat.model.vo.Food;
import newEat.model.vo.Sushi;

public class NewShop2 {

	private ArrayList<Food> su = new ArrayList<>();
	private ArrayList<Food> be = new ArrayList<>();
	private ArrayList name = new ArrayList();
	private ArrayList bname = new ArrayList();
	private ArrayList plz = new ArrayList();

	int total = 0;
	int count = 0;
	int tmp = 0;
	int ball = 0;
	int ber = 0;
	int pick = 0;
	int ran = 0;
	int turn = 0;

	Scanner sc = new Scanner(System.in);

	public void sui(Food fs) {
		if (fs instanceof Sushi) {
			su.add(fs);
		}
	}

	public void si() {
		for (Food f : su) {
			System.out.println(f);
		}
	}

	public void be(Food fs) {
		if (fs instanceof Beef) {
			be.add(fs);
		}
	}

	public void bf() {
		for (Food f : be) {
			System.out.println(f);
		}
	}// bf end

	public void receipt() {

		System.out.println("============== 영수증 ================ ");
		System.out.println("주문한 음식 리스트 ");

		for (Object s : name) {
			System.out.println(s);
		}
		for (Object b : bname) {
			System.out.println(b);
		}

		System.out.println("먹은 갯수 " + count + "개, 총 가격은 " + total + "원 입니다");
		System.out.println();
		System.out.println("아이 맛있었당 빼불배불러 >0<");
	}

	public void RandomSushi() {

		System.out.println();
		System.out.println("식사종료는 99번, 다음 음식 기다릴려면 88번 입력해주세요");
		System.out.print("마음에 드는 음식 골라 입력해주세요 : ");
		pick = sc.nextInt();
		sc.nextLine();
		System.out.println("-----------------------------------------------------");

		if (pick >= 0 && pick < 7) {
			//// 위에 랜덤초밥중에 번호랑 같을때만 출력되고싶은데..pick 대신 ran을 쓰니 안되네
			// 그래서 랜덤으로 출력된 애들 아닌데 같으면 출력되는 문제가 발생함;;;
			// 붙잡고 있다가 포기...^^.. 나중에 생각해보자
			if (su.get(pick).getNum() == pick) { 
				System.out.println(su.get(pick).getName() + ", " + su.get(pick).getPrice() + "원");
				count++;
				total += su.get(pick).getPrice();
				name.add(su.get(pick).getName());
				System.out.println("랜덤으로 먹는 맛이 있구몬 '3'");
				System.out.println("---------------------------------------");
			}
		}
	}// random sushi end

	public void RandomBeef() {

		System.out.println();
		System.out.println("식사종료는 99번, 다음 음식 기다릴려면 88번 입력해주세요");
		System.out.print("마음에 드는 음식 골라 입력해주세요 : ");
		pick = sc.nextInt();
		sc.nextLine();
		System.out.println("-----------------------------------------------------");

		if (pick >= 0 && pick < 7) {
			if (su.get(pick).getNum() == pick) { // 위에 랜덤초밥중에 번호랑 같을때만 출력되고싶은데..랜덤을 쓰니 안되네
				System.out.println(be.get(pick).getName() + ", " + be.get(pick).getPrice() + "원");
				count++;
				total += be.get(pick).getPrice();
				name.add(be.get(pick).getName());
				System.out.println("씹고 뜯고 맛보고 즐기고 -0-");
				System.out.println("---------------------------------------");
			}
		}
	}// random beef end

	public void SushiOrder() {

		System.out.println("-----------------------------");
		System.out.println("1. 직접 주문");
		System.out.println("2. 회전라인에서 식사");

		System.out.print("어떤 방법으로 드시겠습니까 손님? : ");
		int num = sc.nextInt();
		System.out.println();
		while (true) {
			if (num == 1) {
				if (turn == 0) {
					si();
				}
				System.out.println("-----------------------------");
				System.out.println("식사 종료를 원하시면 99번을 입력해주세요");
				System.out.print("원하는 메뉴 번호를 입력해주세요 : ");
				ber = sc.nextInt();
				sc.nextLine();
				System.out.println("-----------------------------");

				for (Food f : su) {
					if (ber >= 0 && ber < 7) {
						if (f.getNum() == ber) {
							System.out.println(f.getName() + ", " + f.getPrice() + "원");
							count++;
							total += f.getPrice();
							name.add(f.getName());
							System.out.println("냠냠 '-'");
						}
					}
				}
			} else if (num == 2) {

				for (int i = 0; i < 4; i++) {
					ran = (int) (Math.random() * 7);
					System.out.print(su.get(ran).getNum() + "번 " + su.get(ran).getName());
					if (i == 3) {
						continue;
					}
					System.out.print(" === ");
				}
				RandomSushi();
			}
			turn++;
			if (ber == 99 || pick == 99) {
				receipt();
				return;
			}
		} // while end
	}// SushiOrder end

	public void BeefOrder() {
		System.out.println("-----------------------------");
		System.out.println("1. 직접 주문");
		System.out.println("2. 회전라인에서 식사");

		System.out.print("어떤 방법으로 드시겠습니까 손님? : ");
		int num = sc.nextInt();
		System.out.println();
		while (true) {
			if (num == 1) {
				if (turn == 0) {
					bf();
				}
				System.out.println("-----------------------------");
				System.out.println("식사 종료를 원하시면 99번을 입력해주세요");
				System.out.print("원하는 메뉴 번호를 입력해주세요 : ");
				ber = sc.nextInt();
				sc.nextLine();
				System.out.println("-----------------------------");

				for (Food f : be) {
					if (ber >= 0 && ber < 7) {
						if (f.getNum() == ber) {
							System.out.println(f.getName() + ", " + f.getPrice() + "원");
							count++;
							total += f.getPrice();
							bname.add(f.getName());
							System.out.println("소고기 아이 맛있땽 >0<");
						}
					}
				}
			} else if (num == 2) {
				for (int i = 0; i < 4; i++) {
					ran = (int) (Math.random() * 7);
					System.out.print(be.get(ran).getNum() + "번 " + be.get(ran).getName());
					if (i == 3) {
						continue;
					}
					System.out.print(" === ");
				}
				RandomBeef();
			}
			turn++;
			if (ber == 99 || pick == 99) {
				receipt();
				return;
			}
		} // while
	}// BeefOrder end
}// class
