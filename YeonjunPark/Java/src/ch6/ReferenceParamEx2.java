package ch6;

public class ReferenceParamEx2 {
	public static void main(String[] args) {
		int[] x = {10};
		System.out.println("변경전 x = "+x[0]);
		change(x);
		
	}
	static void change(int[] x) {
		x[0] = 1000;
		System.out.println("변경후 x값 : "+x[0]);
	}
}
