package model.vo;

public class Person { 
	
	private int num;
	private String name;
	
	public Person() {}
	
	public Person(int num, String name) {
		this.num = num;
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "번호 "+ num + ". " + name+" ";
	}
	
	
	
	

}
