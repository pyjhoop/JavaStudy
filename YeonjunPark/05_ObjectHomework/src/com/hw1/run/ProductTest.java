package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductTest {
	public static void main(String[] args) {
		Product a = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		Product a1 = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		Product a2 = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
		
		System.out.println(a.information());
		System.out.println(a1.information());
		System.out.println(a2.information());
		
		System.out.println("==============================================");
		
		a.setPrice(1200000);
		a.setTax(0.05);
		a1.setPrice(1200000);
		a1.setTax(0.05);
		a2.setPrice(1200000);
		a2.setTax(0.05);

		System.out.println(a.information());
		System.out.println(a1.information());
		System.out.println(a2.information());
		
		System.out.println("==================================================");
		
		System.out.println("상품명 : "+a.getProductName());
		System.out.println("부과세 포함 가격 : "+(int)(a.getPrice()+a.getPrice()*a.getTax())+"원");
		System.out.println("상품명 : "+a1.getProductName());
		System.out.println("부과세 포함 가격 : "+(int)(a1.getPrice()+a1.getPrice()*a1.getTax())+"원");
		System.out.println("상품명 : "+a.getProductName());
		System.out.println("부과세 포함 가격 : "+(int)(a2.getPrice()+a2.getPrice()*a2.getTax())+"원");
	}
}
