package ch6;

public class ConstructorTest {
	public static void main(String[] args) {
		Data1 a = new Data1();
		a.value = 10;
		Data2 b = new Data2(60);
	}
}

class Data1{
	int value;
}
class Data2{
	int value;
	Data2(int x){
		value = x;
	}
}
