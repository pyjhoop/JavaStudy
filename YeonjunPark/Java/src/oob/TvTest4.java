package oob;

class Tv2{
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

public class TvTest4 {
	public static void main(String[] args) {
		Tv2[] arr = new Tv2[3];
		//tv객체를 생성해서 tv객체 배열의 각 요소에 저장.
		for(int i = 0; i<arr.length;i++) {
			arr[i] = new Tv2();
			arr[i].channel = i+10;
		}
		for(int i = 0; i<arr.length;i++) {
			arr[i].channelUp();
			System.out.printf("arr[%d].channel=%d\n",i,arr[i].channel);
		}
	}
}
