package com.kh.chap03_abstract.part01_easy.model.vo;

public class BasketBall extends Sports{

	@Override
	public void rule() {
		System.out.println("공을 항상 손으로만 다뤄야한다.");
	}

	@Override
	public String toString() {
		return super.toString()+" BasketBall";
	}
	

}
