package test.model.vo;

public class ElectronicCar extends Car {
	
	public  ElectronicCar() {
	}
	
	public ElectronicCar(int price, String status, int distance,String food) {
		super(price, status, distance,food);
		
	}
	@Override
	public void dropPrice() {
		//100마다 가격 5이 빠져나간다.
		int i = 0;
		i = super.getPrice() - (super.getDistance()/100 *5);
		super.setPrice(i);
	}
	
	
}
