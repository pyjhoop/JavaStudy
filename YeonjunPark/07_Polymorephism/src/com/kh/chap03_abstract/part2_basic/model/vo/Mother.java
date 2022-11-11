package com.kh.chap03_abstract.part2_basic.model.vo;

public class Mother extends Person{
	private String babyBirth;
	
	public Mother() {}

	public Mother(String name, double weight, int healthy, String babyBirth) {
		super(name, weight, healthy);
		this.babyBirth = babyBirth;
	}

	public String getBabyBirth() {
		return babyBirth;
	}

	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}

	@Override
	public String toString() {
		return "Mother ["+super.toString()+", babyBirth : "+babyBirth;
	}

	@Override
	public void eat() {
		//밥을먹으면 몸무게 10증가.
		super.setWeight(getWeight()+10);
		//밥먹으면 건강 10감소
		super.setWeight(getWeight()-10);
	}

	@Override
	public void sleep() {
		//잠자면 건강 20증가
		super.setHealthy(getHealthy()+20);
	}
	
	
	
	

}
