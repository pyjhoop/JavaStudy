package ch6;

public class CarTest3 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2(c1);// 복사본 생성하고 서로다른 객체를 가지고 있다. 서로다른 주소.
		
	}
}

class Car2{
	String color;
	String gearType;
	int door;
	
	Car2(){
		this("white","auto",4);
	}
	
	Car2(Car2 c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	Car2(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
