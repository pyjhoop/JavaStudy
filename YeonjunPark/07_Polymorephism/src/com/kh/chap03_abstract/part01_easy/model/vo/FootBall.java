package com.kh.chap03_abstract.part01_easy.model.vo;

public class FootBall extends Sports{

	@Override
	public void rule() {
		System.out.println("공을 항상 발로만 차야한다.");
	}

	@Override
	public String toString() {
		return super.toString()+" FootBall";
	}
	
	
}
