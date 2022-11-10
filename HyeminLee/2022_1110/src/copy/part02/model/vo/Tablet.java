package copy.part02.model.vo;

public class Tablet extends Electronic {
	
	private boolean penFlag;
	
	public Tablet() {}

	public Tablet(String brand,String name,int price,boolean penFlag) {
		super(brand, name, price);
		this.penFlag = penFlag;
	}

	@Override
	public String toString() {
		return super.toString()+", penFlag : " + penFlag;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
