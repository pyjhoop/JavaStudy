package oob;

class Tv1{
	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}

public class TvTest2 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		t1.channel = 7;
		t1.channelUp();
		t2.channel = 1;
		t2.channelDown();
		System.out.println("t1의 채널은 : "+ t1.channel);
		System.out.println("t2의 채널은 : "+ t2.channel);
	}
}
