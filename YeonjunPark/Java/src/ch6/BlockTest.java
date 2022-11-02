package ch6;



public class BlockTest {
	static {
		System.out.println("static{ }"); // 클래스가 로딩될때 처음으로 한번 실행이 된다.
	}
	{
		System.out.println("{ }"); // 인스턴스가 만들어질때 실행이 된다.
	}
	public BlockTest() {
		System.out.println("생성자");			//인스턴스 만들때 생성이 된다.
	}
	public static void main(String[] args) {
		BlockTest b = new BlockTest();
	}
}
