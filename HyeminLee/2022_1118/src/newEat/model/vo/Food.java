package newEat.model.vo;

public class Food {
	
	private int num;
	private String name;
	private int price;
	
	public Food() {}
	
	
	
	public Food(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public Food(int num, String name,int price) {
		this.num = num;
		this.name = name;
		this.price=price;
	}
												
	

	


	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String end() {
		return "번호 "+ num+", 메뉴명 : "+name;
	}



	public String toString() {
		return "번호 " + num + ", 메뉴명 : " + name + " || 가격 : " + price + "원";
	}


	
	
	
	
	
	
	
	

}
