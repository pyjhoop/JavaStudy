package ch6;
class Date{
	int x;
}

public class ReferenceParamEx {
	public static void main(String[] args) {
		Date d = new Date();
		d.x = 10;
		System.out.println("현재 x의 값: "+d.x);
		change(d); // 참조변수를 매개변수에 넣으면 주소가 들어가기에 인스턴스변수또는 메서드를 수정가능.
	}
	static void change(Date i) {
		i.x = 100000;
		System.out.println("변경후의 값 : "+i.x);
	}
}
