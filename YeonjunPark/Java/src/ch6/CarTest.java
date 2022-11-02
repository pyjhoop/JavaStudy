package ch6;

public class CarTest {
	public static void main(String[] args) {
		Car c1= new Car();
		c1.color = "white";
		c1.door = 4;
		c1.gearType="auto";
		Car c2 = new Car("white", "auto", 2);
	}
}
class Car{
	String color;
	String gearType;
	int door;
	
	Car(){
		
	}
	Car(String c, String g, int d){
		color = c;
		gearType = g;
		door = d;
	}
}
