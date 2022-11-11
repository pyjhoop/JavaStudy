package test.run;

import test.model.controller.CarShop;
import test.model.vo.ElectronicCar;
import test.model.vo.HybridCar;

public class AbstractRun {
	public static void main(String[] args) {
		CarShop cs = new CarShop();
		//배열에 객체를 생성해서 넣는 메서드를 만들거야.
		cs.insert(new HybridCar(8000, "신차", 15, "기름"));
		cs.insert(new ElectronicCar(9000, "중고", 20000, "전기"));
		cs.insert(new ElectronicCar(6000, "신차", 21, "전기"));
		cs.insert(new HybridCar(4000, "중고", 40000, "기름"));
		
		//셀렉해서 레퍼런스를 반환할거야.
		HybridCar h1 = (HybridCar)cs.select(0);
		ElectronicCar e1 = (ElectronicCar)cs.select(1);
		ElectronicCar e2 = (ElectronicCar)cs.select(2);
		HybridCar h2 = (HybridCar)cs.select(3);
		
		for(int i = 0; i< 4; i++) {
			System.out.println(cs.getArr(i));
		}
		System.out.println("======================================================");
		//감가 진행할 거야.
		e1.dropPrice();
		h2.dropPrice();
		for(int i = 0; i<4; i++) {
			if(cs.getArr(i).getStatus().equals("중고")) {
				System.out.println(cs.getArr(i));
				
			}
		}
	}
}
