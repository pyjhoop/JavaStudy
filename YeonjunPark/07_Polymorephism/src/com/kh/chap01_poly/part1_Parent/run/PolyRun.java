package com.kh.chap01_poly.part1_Parent.run;

import com.kh.chap01_poly.part1_Parent.model.vo.Child1;
import com.kh.chap01_poly.part1_Parent.model.vo.Child2;
import com.kh.chap01_poly.part1_Parent.model.vo.Parent;

public class PolyRun {
	public static void main(String[] args) {
		//대입연산자의 좌우항의 자료형은 같아야한다.
		System.out.println("1. 부모타입 레퍼런스로 부모 인스턴스를 참조하는 경우");
		
		Parent p1 = new Parent();
		p1.print();
		p1.printParent();
		p1.getX();
		//p1참조변수로 안의 메서드에 접근이 가능하다.
		
		System.out.println("2. 자식타입의 참조변수로 자식 인스턴스를 참조하는 경우");
		
		Child1 c1 = new Child1();
		c1.printParent();//얘는 자동 형변환이 된거야.
		c1.print(); //오버라이딩.
		c1.printChild1();
		c1.printParent();
		//자식에서 부모로 자동형변환
		//부모에서 자식으로 강제형변환
		//c1참조변수로 child1, parent에 접근이 가능하다.
		// parent에 접근은 자동형변환을 통해 접근된다.
		
		System.out.println("3. 부모타입 참조변수가 자식 인스턴스 참조하는 경우");
		
		Parent p2 = new Child1();// 자료형이 다르지만 자동형변환이 되었기에 에러가 안난다.
		//Parent p2 = (Parent)new Child1();
		//여기서 참조변수 타입이 부모이기에 부모 변수랑 메서드만 사용이 가능.
		//단, 메서드가 오버라이딩 되어있으면 오버라이딩된 메서드가 출력된다.
		p2.printParent();
		((Child1)p2).printChild1();
		// 인스턴스가 Child1이기에 강제형변환으로 child1에있는 메서드 사용 가능.
		
		//다형성 정의
		//부모타입으로부터 파생된 여러가지 타입의 자식 객체들을 부모타입으로 다룰수 있는 것.
		//부모타입의 참조변수로 자식인스턴스를 다룰수 있는 것.
		
		//다형성의 메커니즘은 "형변환";이야
		
		
		//다형성 예시
		Parent[] arr = new Parent[4];
		arr[0] = new Child1(1,2,3);
		arr[1] = new Child2(2,3,4);
		arr[2] = new Child1(3,4,5);
		arr[3] = new Child2(5,6,7);
		// 자식들이 부모로 자동형변환이 됐기에 배열안에 자식 인스턴스를 참조하게 함.
		//이를 통해 하나의 배열로 여러 타입의 인스턴스를 보관할 수 있게됬다.
		
		System.out.println("==============================");
		arr[0].printParent();
		((Child1)arr[0]).printChild1();// 강제형변환으로 접근이 가능하다.
		//다형성에서 참조변수 타입이 중요하다.
		// 부모타입이면 부모멤버만 사용가능하고
		// 자식 타입이면 부모와 자식 모든 멤버를 사용가능하다.
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] instanceof Child1) {
				((Child1)arr[i]).printChild1();
			}else {
				((Child2)arr[i]).printChild2();
			}
		}
		System.out.println("=========================");
		Parent pp = new Child1();
		pp.print(); //오버라이딩 된것을 알수있어.
		//그런데 작성할때 자동완성에는 Parent에 있다고 명시하는데
		//왜 Child1의 메서드구현이 실행된건가?
		
		/*
		 * 동적바인드: 프로그램이 실행되기전에는 컴파일되면서 정적바인딩 레퍼런스타입의 메서드를 가리킴.
		 * 			그러나 레퍼런스의 자식클래스에서 오버라이딩이 돼있다면
		 * 			프로그램 실행시 동적으로 그 자식클래스에 오버라이딩된 메서드를 찾아서 실행.
		 */
		
	}
}
