package model.vo;

public class Dessert {

	
	private int num; // 번호
	private String menu; // 메뉴이름
	private int price; // 가격
	
	
	
	public Dessert() {}







	public Dessert(int num, String menu, int price) {
		this.num = num;
		this.menu = menu;
		this.price = price;
	}







	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public String getMenu() {
		return menu;
	}



	public void setMenu(String menu) {
		this.menu = menu;
	}







	@Override
	public String toString() {
		return "번호 " + num + ". " + menu + "  " + price + "원";
	}

	
	
	public int takeout(int pulePrice) {
		
		pulePrice = this.price+1000;
		
		
		return pulePrice;
	}
	
													
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
