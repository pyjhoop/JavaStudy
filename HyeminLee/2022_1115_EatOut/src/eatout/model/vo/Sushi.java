package eatout.model.vo;

public class Sushi extends Resturant {

	private int total;

	public Sushi() {
	}

	public Sushi(String resturant) {
		super(resturant);
	}
	
	public Sushi(String name,int price) {
		super(name,price);
	}
	
	public Sushi(String name, int price, String resturant) {
		super(name, price, resturant);
//		this.total = total;

	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return super.toString() + ", 총 금액은 : " + total;
	}
	
	
	@Override
	public int balance(int sum,int pay) {
		// 잔액 반환해드림 (얼마 이상이면 잔액, 모자르면 돈달라하기)
		int coin = pay - sum;
	return coin;	
	}
	
	
	@Override
	public String infor() {
		return super.infor();
	}


}
