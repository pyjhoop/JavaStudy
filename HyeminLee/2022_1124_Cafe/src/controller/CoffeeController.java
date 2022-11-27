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

	{
		desList.add(new Dessert(0, "순우유크림 케이크", 5000));
		desList.add(new Dessert(1, "티라미슈 케이크", 5000));
		desList.add(new Dessert(2, "초코무스 케이크", 6000));
		desList.add(new Dessert(3, "레드벨벳 케이크", 4500));
		desList.add(new Dessert(4, "생딸기 케이크", 6500));
	}

	// 근무자 추가 메소드
	public void insertPerson(int num, String name) {

		perList.add(new Person(num, name));

	}// insertPerson

	// 근무자 전체 조회
	public ArrayList<Person> selectPerson() {

		return perList;
	}

	// 케이크 메뉴 전체 조회
	public ArrayList<Dessert> selectDessert() {
		return desList;
	}

	// 커피 메뉴 전체 조회
	public ArrayList<Coffee> selectCoffee() {

		return coffList;
	}

	// 오늘 근무하는 사람 조회
	public String todayWorker(int num) {

		ArrayList<Person> list = selectPerson();

		String today = list.get(num).getName();

		return today;
		// --> 신규로 추가한사람은 등록이 안된다 고치자
	}

	public int workPay(int time) {

		int money = 10000 * time;

		return money;
	}

	public int cakePay(int cake, int takeout) {

		int total = 0;

		if (takeout == 2) {
			total = desList.get(cake).getPrice() + 1000;
		} else if (takeout == 1) {
			total = desList.get(cake).getPrice();
		}

		return total;
	}

	public int coffeePay(int order, int temper, int size, int takeout) {

		int total = 0;

		if (temper == 1) {
			total = coffList.get(order).getPrice() + 500;

			if (size == 1) {
				total = coffList.get(order).getPrice();

				if (takeout == 1) {
					total = coffList.get(order).getPrice() + 500;
				} else if (takeout == 2) {
					total = coffList.get(order).getPrice();
				}

			} else if (size == 2) {
				total = coffList.get(order).getPrice() + 1000;
			}

		} else if (temper == 2) {
			total = coffList.get(order).getPrice();
		}

		return total;
	}
	
	/*
	public int sumCoffee(int order, int temper, int size, int takeout) {
		
	int sum = 0;
	
	int total = coffeePay(order, temper, size, takeout);
	sum+=total;
		
		return sum;
	}
	*/
	

} // controller
