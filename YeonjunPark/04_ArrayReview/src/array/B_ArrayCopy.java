package array;

import java.util.Arrays;

public class B_ArrayCopy {
	/*
	 * 배열 복사
	 * 크게 두가지의 복사가 존재
	 * 1. 얕은 복사
	 * 2. 깊은 복사
	 * 얕은 복사
	 * - 새로운 변수를 생성하고 거기에 기존의 주소를 참조하는 방법
	 * 깊은 복사
	 * - 새로운 객체배열을 만들고 기존의 값들을 새로운 배열에 삽입하는 방법
	 */
	public void method1() {
		//얕은 복사.
		int[] origin = {1,2,3,4,5};
		System.out.println("원본 배열 출력");
		for(int e: origin) {
			System.out.print(e+" ");
		}
		System.out.println();
		int[] copy = origin; // 얕은 복사.
		System.out.println("== 복사본 배열 출력 ==");
		for(int e : copy) {
			System.out.print(e+" ");
		}
		// 카피본 값 수정시 오리지널과 값이 어떻게 달라지는지 알아보자
		copy[2] = 99;
		System.out.println();
		System.out.println("====복사본 값 수정후====");
		System.out.println("====원본 출력====");
		for(int e: origin) {
			System.out.print(e+" ");
		}
		System.out.println();
		System.out.println("====복사본 출력====");
		for(int e: copy) {
			System.out.print(e+" ");
		}
		System.out.println();
		System.out.println("오리진 주소값 : "+origin.hashCode());
		System.out.println("카피 주소값 : "+copy.hashCode());
		//복사본과 원본의 변경된 후에도 같은 것을 확인하였고
		// 주소또한 같다는 것을 확인하였다.
		//그러므로 얕은복사는 같은 객체를 공유한다.
	}
	public void method2() {
		//깉은 복사 첫번째 방법
		//for을 활용하는 방법 비추
		int[] origin = {1,2,3,4,5};
		int[] copy = new int[origin.length];
		for(int i = 0; i< origin.length; i++) {
			copy[i] = origin[i];
		}
		System.out.println("===원본 배열 출력===");
		for(int e: origin) {
			System.out.print(e+" ");
		}
		System.out.println();
		System.out.println("====복사본 배열 출력====");
		for(int e: copy) {
			System.out.print(e+" ");
		}
		System.out.println();
		copy[2] = 99;
		System.out.println("-----변경후 값 출력 -----");
		System.out.println("===오리진 값 출력===");
		for(int e: origin) {
			System.out.print(e+" ");
		}
		System.out.println();
		System.out.println("====카피 값 출력====");
		for(int e: copy) {
			System.out.print(e+" ");
		}
		// 서로 다른 객체에 값이 저장된 것을 확인 가능하다.
	}
	
	public void method3() {
		//커스텀 하고싶을때 사용하는 방법.
		//System.arraycopy()메서드를 사용한다.
		//System.arraycopy(기존 배열,복사 시작 인덱스,복사할 배열,복사 시작할 인덱스, 복사개수)
		int[] origin = {1,2,3,4,5};
		int[] copy = new int[10];
		System.arraycopy(origin, 0, copy, 0, 5);
//		System.arraycopy(origin, 0, copy, 0, 3);
//		System.arraycopy(origin, 0, copy, 0, 6);
//		위와 같이 다가능함.
		for(int e: copy) {
			System.out.print(e+" ");
		}
		
	}
	public void method4() {
		//제일 추천하는 방법.
		//Arrays.copyOf()메서드를 사용.
		int[] origin = {1,2,3,4,5};
		//복사 방법
		int[] copy = Arrays.copyOf(origin, 7);
//		int[] copy = Arrays.copyOf(origin, 6);
//		int[] copy = Arrays.copyOf(origin, 3);
		//위의 두개와 같이 6을 하면 마지막 인덱스에 0이 추가되고
		//3일 경우 크기 3에 3개만 복사된다.
		for(int e: copy) {
			System.out.print(e+" ");
		}
		/*
		 * Arrays.copyOf() 메서드
		 * => 내가 제시한 길이 만큼 복사본 배열 크기 할당.
		 * => 단, 내가 제시한 길이가 원본배열의 크기보다 클 경우 기존의 배열에 있는 값은 다 복사 나머지는 0으로 채운다.
		 * => 	 내가 제시한 길이가 원본배열의 크기보다 작을 경우 기존의 배열에 있는 값을 내가 제시한 길이만큼만 복사.
		 */
	}
	/*
	 * [참고]
	 * java.lang.Math
	 * java.lang.String
	 * java.lang.System
	 * => java.lang.*에 있는 클래스를 쓸때는 import를 안해줘도됨.
	 * 맨위에 import java.lang.*;이 안보이지만 알게모르게 포함되어있다. JVM이 알아서 해줌.
	 * 
	 * java.util.Scanner;
	 * java.util.Arrays;
	 * => java.lang이외의 패키지에 있는 클래스들을 쓸 때는 무조건 import해줘야한다.
	 */
	
	public void method5() {
		//clone 메서드를 이용한 완전한 복사.
		// 인덱스 지정 불가, 크기지정 불가
		//주소값은 다름.
		int[] origin = {1,2,3,4,5};
		int[] copy = origin.clone();
		for(int e: copy) {
			System.out.print(e+" ");
		}
	}
}
