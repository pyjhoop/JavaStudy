package newEat.controller;

import java.util.ArrayList;
import java.util.Scanner;

import newEat.model.vo.Beef;
import newEat.model.vo.Food;
import newEat.model.vo.Sushi;

public class NewShop {
	
	//-------------이건 초안 짠거 -----------------
	
	private ArrayList<Food> food22 = new ArrayList<>();
	
	
	Scanner sc = new Scanner(System.in);
	
	int total = 0;
	int count = 0;
	int ran = (int)(Math.random()*7);
	
	public void testfood(Food fd) {
		food22.add(fd);
	}

	
	public ArrayList<Food> onlySushi(){
		ArrayList<Food> onlysu = new ArrayList<Food>();
		
		for (Food d : food22) {
			if(d instanceof Sushi) {
			onlysu.add(d);
			}
		}
		for(int i=0; i<onlysu.size();i++) {
			System.out.println(onlysu.get(i));
		}
		return onlysu;
	}
	
	
	public ArrayList<Food> onlyBeef(){
		ArrayList<Food> onlybe = new ArrayList<Food>();
		
		
		for (Food d : food22) {
			if(d instanceof Beef) {
				onlybe.add(d);
			}
		}

		for(Food dd : onlybe) {
			System.out.println(dd);
		}
		
		
		return onlybe;
	}
	
	
	
	public void RandomSushi() {
		
	
		
		while(true) {
			
			int i=0;
			while(i<5) {
				int j = ran;
				if(j==food22.get(i).getNum()) {
					System.out.println();
				}
			
			
			
			System.out.println("여기중에서 뭐먹지?(먹을게 없어서 기다릴꺼면 88을 눌러주세요) : ");
			int eat = sc.nextInt();
			sc.nextLine();
			
			
			if(eat==88) {
				break;
			}
			
			
			
			
			
			
			
			
			}// i while end
			
			
			
			
			
			
			
			
			
		}//while end
		
		
	}//ransu end
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void SushiOrder() {

		
		ArrayList name = new ArrayList();
		
		while (true) {

			System.out.println("-----------------------------");
			System.out.println("식사 종료를 원하시면 99번을 입력해주세요");
			System.out.print("원하는 메뉴 번호를 입력해주세요 : ");
			int ber = sc.nextInt();
			sc.nextLine();
			System.out.println("-----------------------------");

			if (ber >= 0 && ber < 7) {
				for (Food f : food22) {
					if (f instanceof Sushi) {
						if (f.getNum() == ber) {
							System.out.println(f.getName() + ", " + f.getPrice() + "원");
							count++;
							total += f.getPrice();
							name.add(f.getName());
							System.out.println("냠냠 '-'");
						}
					} 
					} 
				}else if (ber == 99) {
					System.out.println("============== 영수증 ================ ");
					System.out.println(" 먹은 메뉴 ");

					for (Object s : name) {
						System.out.println(s);
					}
					System.out.println("먹은 갯수 " + count + "개, 총 가격은 " + total + "원 입니다");
					return;
			}else {
				System.out.println("아니야!");
			}

		}
	}
	
	public void BeefOrder() {

		ArrayList bname = new ArrayList();
		while (true) {
			System.out.println("-----------------------------");
			System.out.println("식사 종료를 원하시면 99번을 입력해주세요");
			System.out.print("원하는 메뉴 번호를 입력해주세요 : ");
			int ber = sc.nextInt();
			sc.nextLine();
			System.out.println("-----------------------------");

			if (ber >= 0 && ber < 7) {
				for (Food f : food22) {
					if (f instanceof Beef) {
						if (f.getNum() == ber) {
							System.out.println(f.getName() + ", " + f.getPrice() + "원");
							count++;
							total += f.getPrice();
							bname.add(f.getName());
							System.out.println("소고기 아이 맛있땽 >0<");
						}
					}
				}
			} else if (ber == 99) {
				System.out.println("============== 영수증 ================ ");
				System.out.println(" 먹은 메뉴 ");
				for (Object b : bname) {
					System.out.println(b);
				}
				System.out.println("먹은 갯수 " + count + "개, 총 가격은 " + total + "원 입니다");
			return;
			} else {
				System.out.println("다시 입렵쑤");
			}
			 

	
			}//while
	
		

	}//class
	
	
	public void pick() {
		
	
	

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	



	
	
	

}//class
