package ch6;

public class MyMathTest2 {
	public static void main(String[] args) {
	System.out.println(MyMath2.add(200L, 100L));
	System.out.println(MyMath2.substract(200L, 100L));
	System.out.println(MyMath2.multiply(200L, 100L));
	System.out.println(MyMath2.divide(200L, 100L));
	
	//인스턴스 메서드를 사용하기 위해선 인스턴스를 만들어야한다.
	MyMath2 mm = new MyMath2();
	mm.a = 200L;
	mm.b = 100L;
	System.out.println(mm.add());
	System.out.println(mm.substract());
	System.out.println(mm.multiply());
	System.out.println(mm.divide());
	}
}

class MyMath2{
	long a, b;
	long add() {
		return a+b;
	}
	long substract() {
		return a-b;
	}
	long multiply() {
		return a*b;
	}
	long divide() {
		return a/b;
	}
	
	//인스턴스변수와 관계없이 매개변수만으로 작업이 가능하다.
	static long add(long a, long b) {return a+b;}		//지역변수 사용.
	static long substract(long a, long b) {return a-b;}
	static long multiply(long a, long b) {return a*b;}
	static long divide(long a, long b) {return a/b;}
	
}
