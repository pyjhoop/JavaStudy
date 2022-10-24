package operator;

public class F_Compound {
	public void method1() {
		int num = 12;
		System.out.println("최초의 num : " + num);
		num += 3;
		System.out.println("3 증가시킨 num : "+ num);
		num -= 3;
		System.out.println("3 감소시킨 num : " + num);
		num *= 6;
		System.out.println("6배한 num : "+num);
		num /= 2;
		System.out.println("2로 나눈 num : "+num);
		num %= 2;
		System.out.println("num을 2로 나눈 나머지 : "+ num);
	}
}
