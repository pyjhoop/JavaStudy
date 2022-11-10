package ch7;

public class PolyArgumentTest2 {
	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio());
		b.summery();
	}
}

class Product2{
	int price;
	int bonusPoint;
	
	Product2(){}
	
	Product2(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv2 extends Product2{
	Tv2(){super(100);}

	public String toString() {
		return "Tv2";
	}
}

class Computer2 extends Product2{
	Computer2(){
		super(200);
	}
	
	public String toString() {
		return "Computer2";
	}
}

class Audio extends Product2{
	Audio(){super(50);}
	public String toString() {
		return "Audio";
	}
}

class Buyer2{
	int money = 1000;
	int bonusPoint = 0;
	Product2[] item = new Product2[10];
	int i = 0;
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족해서 살 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p+"을/를 구입하셨습니다.");
	}
	
	void summery() {
		int sum = 0;
		String itemList = "";
		//반복문을 이용해서 물품의 총 가격과 목록을 만든다.
		for(int i =0; i<item.length; i++) {
			if(item[i]==null) break;
			sum+=item[i].price;
			itemList +=item[i]+", ";
		}
		System.out.println("구입하신 물품의 총금액은 "+sum+"만원입니다.");
		System.out.println("구입하신 제품은 "+itemList+"입니다.");
	}
}