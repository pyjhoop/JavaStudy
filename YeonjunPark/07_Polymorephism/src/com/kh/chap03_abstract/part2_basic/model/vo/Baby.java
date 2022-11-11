package com.kh.chap03_abstract.part2_basic.model.vo;

public class Baby extends Person{
	
	public Baby() {}
	
	public Baby(String name, double weight, int healthy) {
		super(name, weight, healthy);
	}

	@Override
	public String toString() {
		return "Baby "+super.toString();
	}

	@Override
	public void eat() {
		//밥먹으면 몸무게 3증가
		super.setWeight(getWeight()+3);
		//밥먹으면 건강도 1증가.
		super.setHealthy(getHealthy()+1);
	}

	@Override
	public void sleep() {
		//잠자면 건강도 3증가
		super.setHealthy(getHealthy()+3);
	}
	
}
