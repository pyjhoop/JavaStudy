package ch6;

class Data{
	int x;
}

public class PrimitivePraramEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x의 값 : "+ d.x);
		change(d.x);
		System.out.println(d.x);
	}
	static void change(int x) { //기본자료형을 매개변수로 넣게되면 값을 복사해서 사용하기에 기본값이 변하지 않는다.
		x = 10000;				//참조자료형을 매개변수로 삼으면 주소가 들어가기에 기본값을 읽고 수정할 수 있다.
		System.out.println("change() x값 : "+ x);
	}
}
