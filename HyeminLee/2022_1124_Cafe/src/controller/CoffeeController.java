package controller;

import java.util.ArrayList;

import model.vo.Coffee;
import model.vo.Dessert;
import model.vo.Person;

/**
 * @author 이혜민
 * @since 2022.11.25 :29
 */
public class CoffeeController {
	private ArrayList<Coffee> coffList = new ArrayList<>();
	private ArrayList<Dessert> desList = new ArrayList<>();
	private ArrayList<Person> perList = new ArrayList<>();
	
	
	{
		perList.add(new Person(0, "금사과"));
		perList.add(new Person(1, "예쁜 앵두"));
		perList.add(new Person(2, "멋진 토마토"));
	}
	
	
	{
		coffList.add(new Coffee(0, "아메리카노", 5000));	
		coffList.add(new Coffee(1, "바닐라 라떼", 6500));	
		coffList.add(new Coffee(2, "헤이즐넛 커피", 6000));	
		coffList.add(new Coffee(3, "아이스티", 3500));	
		coffList.add(new Coffee(4, "블루베리 스무디", 7000));	
	}
//	System.out.println("1. 아메리카노");
//	System.out.println("2. 바닐라라떼");
//	System.out.println("3. 헤이즐넛커피");
//	System.out.println("4. 아이스티");
//	System.out.println("5. 블루베리스무디");
	
	
	// 근무자 추가 메소드
	public void insertPerson(int num, String name) { 
		
		perList.add(new Person(num, name));
		
		
	}// insertPerson

	
	// 근무자 전체 조회
	public ArrayList<Person> selectPerson() {
	
		return perList;
	}
	
	// 커피 메뉴 전체 조회
	public ArrayList<Coffee> selectCoffee() {
		
		return coffList;
	}
	
	
	// 오늘 근무하는 사람 조회
	public String todayWorker(int num){
		
		String today = perList.get(num).getName();
		
		return today;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

} //controller
