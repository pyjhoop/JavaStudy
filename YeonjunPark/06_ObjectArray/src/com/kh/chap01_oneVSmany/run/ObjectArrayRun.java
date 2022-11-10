package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.Book;

public class ObjectArrayRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//동일 타입의 객체가 많이 생성되면 참조변수로만 만들기 힘들다.
		//객체배여을 활용해 보자.
		
		Book[] books = new Book[3];
		
		//반복문을 통해서 도서의 정보를 입력받아라.
		for(int i = 0; i < books.length; i++) {
			System.out.println((i+1)+"번째 도서정보 입력.");
			
			System.out.print("도서명 : ");
			String title = sc.nextLine();
			
			System.out.print("저자 : ");
			String author = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			// 반복되는 구문을 가져와서 바뀌어야 할 곳을 수정한다.
			books[i] = new Book(title, author, price, publisher);
		}//객체생성 및 초기화 완료
		
		//information을 출력할 때 println사용법이 있지만 배열은 반복문 사용.
		for(int i = 0; i<books.length; i++) {
			System.out.println(books[i].information());
		}
		
		System.out.println("==============================");
		
		//도서제목으로 검색하는 사이트
		System.out.print("검색할 책 제목: ");
		String search = sc.nextLine();
		
		for(int i = 0; i<books.length; i++) {
			if(books[i].getTitle().contains(search)) {
				System.out.println(books[i].information());
			}
		}
		
	}
}
