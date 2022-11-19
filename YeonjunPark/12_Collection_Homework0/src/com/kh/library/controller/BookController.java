package com.kh.library.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

//BookManager 인터페이스 구현
public class BookController implements BookManager{
	
	ArrayList<Book> bList = new ArrayList<Book>();
	
	
	
	
	public void addFile(ArrayList<Book> list) {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a_test.txt"))){
			
			for(int i = 0; i<bList.size(); i++) {
				oos.writeObject(list);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void addBook(Book nBook) {
		boolean bool = true;
		for(Book b: bList) {
			if(b.getbNo().equals(nBook.getbNo())) {
				System.out.println("도서명 : "+nBook.getTitle()+" 도서는 이미 소장하고 있는 책입니다.");
				bool = false;
				break;
			}
		}
		
		
		if(bool) {
			bList.add(nBook);
			System.out.println("도서명 : "+ nBook.getTitle()+" 도서가 성공적으로 추가되었습니다.");
			try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a_test.txt"))){
				
				for(int i = 0; i<bList.size(); i++) {
					oos.writeObject(nBook);
				}
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public ArrayList<Book> getAllBook() {
		return bList;
	}

	@Override
	public Book searchBookBybNo(String bNo) {
		Book b1 = new Book();
		
		for(Book b: bList) {
			if(bNo.equals(b.getbNo())) {
				b1 = b;
			}
		}
		
		return b1;
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		ArrayList<Book> arr = new ArrayList<Book>();
		
		for(Book b: bList) {
			if(b.getTitle().contains(title)) {
				arr.add(b);
			}
		}
		
		return arr;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {
		ArrayList<Book> search = new ArrayList<Book>();
		
		for(Book b: bList) {
			if(b instanceof Magazine) {
				continue;
			}
			search.add(b);
		}
		
		
		
		return search;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		ArrayList<Book> search = new ArrayList<Book>();
		
		for(Book b: bList) {
			if(b instanceof Magazine) {
				search.add(b);
			}
		}
		return search;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		ArrayList<Book> arr = new ArrayList<Book>();
		ArrayList<Book> arr1 = onlySearchMagazine();
		
		for(int i = 0; i< arr1.size(); i++) {
			if(year == ((Magazine)arr1.get(i)).getYear()) {
				arr.add(arr1.get(i));
			}
		}
		
		return arr;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		ArrayList<Book> arr = new ArrayList<Book>();
		
		for(Book b: bList) {
			if(b.getPublisher().contains(publisher)) {
				arr.add(b);
			}
		}
		
		return arr;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		ArrayList<Book> arr = new ArrayList<Book>();
		
		for(Book b: bList) {
			if(b.getPrice() < price) {
				arr.add(b);
			}
		}
		return arr;
	}

	@Override
	public int getTotalPrice() {
		int total = 0;
		
		for(Book b: bList) {
			total+= b.getPrice();
		}
		
		return total;
	}

	@Override
	public int getAvgPrice() {
		
		int avg = getTotalPrice()/bList.size();
		
		return avg;
	}
	

}
