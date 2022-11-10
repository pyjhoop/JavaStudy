package ch7;

public class InstanceofTest {
	public static void main(String[] args) {
		FireEngine fg = new FireEngine();
		if(fg instanceof FireEngine) {
			System.out.println("this is a fireengine instance");
		}
		if(fg instanceof Car) {
			System.out.println("This is a car instance");
		}
		if(fg instanceof Object) {
			System.out.println("This is an Object instance.");
		}
		System.out.println(fg.getClass().getName());
	}
}

class Car{}
class FireEngine extends Car{}