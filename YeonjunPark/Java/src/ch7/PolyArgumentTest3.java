package ch7;

import java.util.Vector;

public class PolyArgumentTest3 {
	public static void main(String[] args) {
		Buyer3 b = new Buyer3();
		Tv3 tv = new Tv3();
		Computer3 com = new Computer3();
		Audio1 audio = new Audio1();
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summery();
		System.out.println();
		b.refund(com);
		b.summery();
		
	}
}

class Product3{
	int price;
	int bonusPoint;
	
	Product3(){
		price = 0;
		bonusPoint = 0;
	}
	
	Product3(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv3 extends Product3{
	Tv3(){super(100);}

	public String toString() {
		return "Tv2";
	}
}

class Computer3 extends Product3{
	Computer3(){
		super(200);
	}
	
	public String toString() {
		return "Computer2";
	}
}

class Audio1 extends Product3{
	Audio1(){super(50);}
	public String toString() {
		return "Audio";
	}
}

class Buyer3{
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector();
	int i = 0;
	
	void buy(Product3 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족해서 살 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p+"을/를 구입하셨습니다.");
	}
	
	void refund(Product3 p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint += p.bonusPoint;
			System.out.println(p+"을/를 반품하셨습니다.");
		}else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	void summery() {
		int sum = 0;
		String itemList = "";
		//반복문을 이용해서 물품의 총 가격과 목록을 만든다.
		if(item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		for(int i =0; i<item.size(); i++) {
			Product3 p = (Product3)item.get(i);
			sum+=p.price;
			itemList +=(i==0)? ""+p:", "+p;
		}
		System.out.println("구입하신 물품의 총금액은 "+sum+"만원입니다.");
		System.out.println("구입하신 제품은 "+itemList+"입니다.");
	}
}