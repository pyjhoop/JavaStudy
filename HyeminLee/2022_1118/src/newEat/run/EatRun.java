package newEat.run;

import java.util.ArrayList;
import java.util.Scanner;

import newEat.controller.NewShop;
import newEat.controller.NewShop2;
import newEat.model.vo.Beef;
import newEat.model.vo.Food;
import newEat.model.vo.Sushi;

public class EatRun {

	public static void main(String[] args) {

		
	ArrayList<Food> foodList = new ArrayList<>();
	
	foodList.add(new Sushi(0, "소고기 초밥", 3500));
	foodList.add(new Sushi(1, "연어 초밥", 2500));
	foodList.add(new Sushi(2, "한치 초밥", 1500));
	foodList.add(new Sushi(3, "성게알 초밥", 5500));
	foodList.add(new Sushi(4, "생새우 초밥", 6500));
	foodList.add(new Sushi(5, "가리비 초밥", 4500));
	foodList.add(new Sushi(6, "새우 초밥", 2000));
	
	foodList.add(new Beef(0, "갈비살", 15000));
	foodList.add(new Beef(1, "항정살", 25000));
	foodList.add(new Beef(2, "안심", 30000));
	foodList.add(new Beef(3, "등심", 10000));
	foodList.add(new Beef(4, "티본 스테이크",80000));
	foodList.add(new Beef(5, "생 간", 75000));
	foodList.add(new Beef(6, "토미호크", 95000));
	
	
		NewShop2 meal = new NewShop2();

		NewShop shop = new NewShop();
	
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		
		for(Food f : foodList) {
			meal.sui(f);
		}
		for(Food f : foodList) {
			meal.be(f);
		}
		
		
		
//		meal.RandomSushi();
		
		
		while(true==flag) {
			
			System.out.println("1. 장인손길 초밥");
			System.out.println("2. 사르르 샤벳한우");
			System.out.print("외식이 땡긴다 어디가징? : ");
			int fir = sc.nextInt();
			sc.nextLine();
			
			if(!(fir==1 || fir==2)) {
				System.out.println("초밥이랑 한우중에 먹고싶다고오!! ㅠ0ㅠ");
				System.out.println("---------------------------");
				return;
			}
			if(fir==1) {
				meal.SushiOrder();
				return;
			}else if(fir==2) {
				meal.BeefOrder();
				return;
			}else {
				System.out.println("다시 골라죵~");
			}
			
			
			
		}
		
		
	}

}
