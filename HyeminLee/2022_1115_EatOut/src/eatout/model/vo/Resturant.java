package eatout.model.vo;

public abstract class Resturant implements basic {

	private String name;
	private int price;
	private String resturant;

	public Resturant() {}

	
	public Resturant(String resturant) {
		this.resturant = resturant;
	}
	
	public Resturant(String name,int price) {
		this.name=name;
		this.price=price;
	}
	
	public Resturant(String name, int price, String resturant) {
		this.name = name;
		this.price = price;
		this.resturant = resturant;
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
	public String getResturant() {
		return resturant;
	}

	public void setResturant(String resturant) {
		this.resturant = resturant;
	}

	@Override
	public String toString() {
		return resturant + "[식당 음식명 : " + name + ", 가격은 : " + price + "원까지 있습니다]";
	}

	public String infor() {
		return name+", 가격은 "+price+"원 입니다";
	}										
	

	@Override
	public int balance(int sum,int pay) {
	
	return 0;	
	}

}
