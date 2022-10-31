package oob;

class Tv{
	String color;
	boolean power;
	int channel;
	
	//메서드
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

public class TvTest {
	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		t.channelDown();
		System.out.println("현재 채널은"+ t.channel+" 입니다.");
	}
}
