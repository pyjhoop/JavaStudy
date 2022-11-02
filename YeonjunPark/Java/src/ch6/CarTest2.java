package ch6;

public class CarTest2 {
	public static void main(String[] args) {
		
	}
}

class Car1 {
	String color;
	String gearType;
	int door;
	
	Car1(){
		this("white","auto",4);
	}
	Car1(String color){
		this(color,"auto",4);
	}
	
	Car1(String c, String g, int d){
		color = c; 
		gearType = g;
		door = d;
	}
}