package test.model.vo;

public abstract class Car implements Vehicle{
	private int Price;
	private String status;
	private int distance;
	private String food;
	
	public Car() {}

	public Car(int Price, String status, int distance,String food) {
		this.Price = Price;
		this.status = status;
		this.distance = distance;
		this.food = food;
	}




	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "Car [Price=" + Price + ", status=" + status + ", distance=" + distance + ", food=" + food + "]";
	}


	
	
	
	
	
}
