package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.Book;

public class ObjectRun {
	public static void main(String[] args) {
		//객체 배열을 나가기 전에 3개의 객체를 생성해서 다뤄보자 
		Scanner sc = new Scanner(System.in);
		//3개의 객체를 생성
		Book b1 = null;
		Book b2 = null;
		Book b3 = null;
		
		//세 도서에 대한 정보를 반복적으로 입력 받기.
		for(int i = 0; i<3;i++) {
			System.out.println(i+1+"번째 도서정보 입력.");
			System.out.print("도서명 : ");
			String title = sc.nextLine();
			
			System.out.print("저자 : ");
			String author = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			if(i==0) {
				b1 = new Book(title, author, price, publisher);
			}else if(i==1) {
				b2 = new Book(title, author, price, publisher);
			}else {
				b3 = new Book(title, author, price, publisher);
			}
		}// 객체생성 완료
		
		//전체 도서 정보 조회하기 => 변수로 선언했기에 반복문이 안먹혀
		System.out.println(b1.information());
		System.out.println(b2.information());
		System.out.println(b3.information());
		
		//도서 제목으로 검색하는 서비스
		//교보문고에서 자바를 검색하면 자바가 들어가는 책들이 쫙 나옴 그것을 나타내기 위해서
		System.out.println("검색할 책 제목 : ");
		String search = sc.nextLine();
		if(b1.getTitle().contains(search)) {
			System.out.println(b1.information());
		}
		if(b2.getTitle().contains(search)) {
			System.out.println(b2.information());
		}
		if(b3.getTitle().contains(search)) {
			System.out.println(b3.information());
		}
		
	}
}
