package ch6;

public class MyMathTest {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result = mm.add(5L, 3L);
		long result2 = mm.substract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L); //인자 즉 매개변수자리는 같은 타입 또는 자동형변환이 가능한 값.
		System.out.println("add ; "+ result);
		System.out.println("substract: "+result2);
		System.out.println("multiply : "+ result3);
		System.out.println("divide : "+ result4);
	}
}

class MyMath{
	long add(long a, long b) {
		long result = a+b;
		return result;
	}
	long substract(long a, long b) {return a-b;}
	long multiply(long a, long b) {return a*b;}
	double divide(double a, double b) {return a/b;}
}
