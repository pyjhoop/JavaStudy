package ch6;

public class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = iv;
//	static int cv2 = iv; 오류남 왜냐 클래스 메서드에는 인스턴스 메서드를 저장하기 위해선 인스턴스생성 해야함.
	static int cv2 = new MemberCall().iv; // 인스턴스 생성후 인스턴스 변수 대입 가능.
	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv); 불가능 클래스 메서드 내에서 인스턴스변수를 사용할려면 인스턴스 생성부터 해야함.
		MemberCall c = new MemberCall();
		System.out.println(c.iv);// 객체를 생성 후에야 인스턴스 변수의 참조 가능.
	}
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1(); 못불러와 객체 생성을 안해서
		MemberCall c = new MemberCall();
		c.instanceMethod1(); // 인스턴스 생성 후에야 메서드 호출 가능.
	}
	void instanceMethod2() {
		staticMethod2();
		instanceMethod1();
	}
}
