package com.kh.chap03_abstract.part2_basic.model.vo;

public abstract class Person implements Basic{
	private String name;
	private double weight;
	private int healthy;
	
	public Person() {}

	public Person(String name, double weight, int healthy) {
		this.name = name;
		this.weight = weight;
		this.healthy = healthy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getHealthy() {
		return healthy;
	}

	public void setHealthy(int healthy) {
		this.healthy = healthy;
	}

	@Override
	public String toString() {
		return "name=" + name + ", weight=" + weight + ", healthy=" + healthy ;
	}
	
	
	
}
