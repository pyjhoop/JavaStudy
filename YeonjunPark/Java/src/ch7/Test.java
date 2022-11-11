package ch7;

public abstract class Test {
	public static void main(String[] args) {
		Test2 a = new Test2();
		a.hi();
		a.hellow();
		a.howAreYou();
		
	}
	
}

abstract class Test1 implements A,B,C{
	public void hi() {
		System.out.println("hi");
	}
	
	public void hellow() {
		System.out.println("hellow");
	}
}


class Test2 extends Test1{
	public void howAreYou() {
		System.out.println("howAreyou");
	}
}


interface A{
	
	void hi();
}

interface B{
	void hellow();
}

interface C{
	void howAreYou();
}