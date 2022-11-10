package ch7;

public class BindingTest {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		System.out.println(p.x);
		p.method();
		System.out.println("==============");
		System.out.println(c.x);
		c.method();
	}
}
// 
// 멤버 변수인 경우 참조변수가 부모타입이면 부모클래스에서 선언한 변수 사용
// 타입이 자식이면 자식변수 사용
// 메서드는 오버라이딩 되면 오버라이딩 된 대로 사용.
// 중복정의 하지 않는다면 모든 멤버 변수를 사용한다.
class Parent{
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent{
	int x = 200;
	
	void method() {
		System.out.println("Child method");
	}
}