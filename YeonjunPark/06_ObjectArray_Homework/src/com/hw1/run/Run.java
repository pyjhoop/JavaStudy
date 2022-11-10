package com.hw1.run;

import com.hw1.kh.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		// 객체 배열을 크기 3으로 할당 한 뒤
		Employee[] ep = new Employee[3];
		// 0번 인덱스에는 기본생성자를 통해서 객체 생성
		ep[0] = new Employee();
		// 1번 인덱스에는 매개변수 6개짜리 생성자를 이용해서 객체 생성
		ep[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 마곡");
		// 2번 인덱스에는 매개변수 10개짜리 생성자를 이용하여 객체 생성 후 출력
		ep[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
		
		for(int i =0; i<ep.length; i++) {
			System.out.println("emp["+i+"] : "+ep[i].information());
		}
		System.out.println("=========================================================");
		// 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 다시 출력(임의로)
		ep[0].setEmpNo(0);
		ep[0].setEmpName("김말똥");
		ep[0].setDept("영업부");
		ep[0].setJob("팀장");
		ep[0].setAge(30);
		ep[0].setGender('M');
		ep[0].setSalary(3000000);
		ep[0].setBonusPoint(0.2);
		ep[0].setPhone("01055559999");
		ep[0].setAddress("전라도 광주");
		
		ep[1].setDept("기획부");
		ep[1].setJob("부장");
		ep[1].setSalary(4000000);
		ep[1].setBonusPoint(0.3);
		
		for(int i = 0; i< ep.length-1;i++) {
			System.out.println("emp["+i+"] : "+ep[i].information());
		}
		System.out.println("=========================================================");
		// 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
		// 보너스가 적용된 연봉 = (급여 +(급여 *보너스 포인트)) * 12
		int annualSalary = 0;
		int total = 0;
		for(int i =0; i<ep.length; i++) {
			annualSalary = (int)(ep[i].getSalary() +(ep[i].getSalary() *ep[i].getBonusPoint())) * 12;
			System.out.println(ep[i].getEmpName()+"의 연봉 : "+annualSalary+"원");
			total +=annualSalary;
		}
		System.out.println("=========================================================");
		
		// 3명 직원의 연봉 평균을 구하여 출력
		System.out.println("직원들의 연봉의 평균 : "+total/ep.length+"원");
	}
}
