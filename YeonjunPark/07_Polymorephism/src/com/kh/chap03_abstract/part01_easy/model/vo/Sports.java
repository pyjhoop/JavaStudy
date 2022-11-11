package com.kh.chap03_abstract.part01_easy.model.vo;

public abstract class Sports {
	private int people;
	
	public Sports() {}

	public Sports(int people) {
		this.people = people;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	@Override
	public String toString() {
		return "Sports [people=" + people + "]";
	}
	
	public abstract void rule();
	
	
	
}
