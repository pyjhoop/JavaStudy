package test.model.vo;

public class HybridCar extends Car{

	public HybridCar() {
	}
	
	public HybridCar(int price, String status, int distance,String food) {
		super(price, status, distance,food);
	}
	
	@Override
	public void dropPrice() {
		//10마다 가격 10이 빠져나간다.
		int i = 0;
		i = super.getPrice() - (super.getDistance()/100 *5);
		super.setPrice(i);
	}
}
