package model.vo;

public class Coffee extends Dessert {
	
	private int hotCold;

	
	public Coffee() {}
	
	
	public Coffee(int num, String menu, int price) {
		super(num, menu, price);
	}
	
	
	
	public Coffee(int num, String menu, int price,int hotCold) {
		super(num, menu, price);
		this.hotCold = hotCold;
	}


	public int getHotCold() {
		return hotCold;
	}


	public void setHotCold(int hotCold) {
		this.hotCold = hotCold;
	}
	
	
	
	
	

}
