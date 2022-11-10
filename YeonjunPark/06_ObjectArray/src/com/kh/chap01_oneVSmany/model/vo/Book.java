package com.kh.chap01_oneVSmany.model.vo;

public class Book {
	//도서명, 저자, 가격, 출판사 추상화 완료
	private String title;			//도서명
	private String author;			//저자
	private int price;				//가격
	private String publisher;		//출판사
	
	//기본생성자
	public Book(){}
	
	//매개변수 생성자
	public Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	//getter, setter

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String information() {
		return title + ", " + author + ", " + price + ", " + publisher;
	}
	
	

	
	
}
