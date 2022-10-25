package control;

import java.util.Scanner;


public class A_If {
	/*
	 * 기본적으로 프로그램 진행은 순차적으로 진행.
	 * 단, 이 순차적인 흐름을 바꾸고자 한다면 제어문 이라는걸 이용해서 직접 제어 가능.
	 * 
	 * 선택적으로 실행시키고자 할 때 = 조건문
	 * 반복적으로 샐행시키고자 할 때 = 반복문
	 * 그 외의 흐름을 제어할 때 = 분기문.
	 * 
	 * =======조건문=======
	 * 조건식을 통해 참이냐 거짓이냐 판단해서 참일 경우 그에 해당하는 코드를 실행한다.
	 * 
	 * 조건식의 결과는 true, false여야 한다.
	 * 보통 조건식에서는 비교연산자(대소비교, 동등비교), 논리연산자(&&, ||)를 주로 사용.
	 * 
	 * 조건문은 크게 if문과 switch문으로 나뉨.
	 */
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		sc.close();
		
		/*
		 * 단독 if문 
		 * [표현법]
		 * if(조건식) {
		 * 		실행시키고자 하는 코드.
		 * }
		 * 조건식은 if랑친하다.
		 * => 조건식이 참(true)일 경우 중괄호 블럭 안의 코드를 실행
		 * => 조건식이 false일 경우 중괄호 블럭 안의 코드를 무시하고 넘어감.
		 * 
		 */
		if(num > 0) {
			System.out.println("양수다");
		}
		if(num <= 0) {
			System.out.println("양수가 아니다.");
		}
	}
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		sc.close();
		/*
		 * if - else문
		 * [표현법]
		 * if(조건식){
		 * 		1 참일경우 실행코드가 들어감.
		 * }else {
		 * 		2 조건식이 거짓일때 실행코드가 들어감.
		 * }
		 * 조건식의 결과가 참일경우 실행코드 1수행후 if-else문 빠져나감.
		 * 조건식의 결과가 거짓일 경우 실행코드 2 수행후 if-else문 빠져나감.
		 * 
		 */
		if(num > 0) {
			System.out.println("양수다.");
		}else {
			System.out.println("양수가 아니다.");
		}
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		sc.close();
		
		/*
		 * if - else if - else문
		 * 같은 비교대상으로 여러개의 조건을 제시해야 될 경우
		 * [표현식]
		 * if(조건식1){
		 * 		실행코드 1
		 * }else if(조건식2){
		 * 		실행코드 2   if문만 조건식과 친하다.
		 * }else if(조건식3){
		 * 		실행코드 3
		 * }else{
		 * 		위의 조건들이 다 false일경우 실행할 코드
		 * } 마지막 else는 생략이 가능하다.
		 */
		if(num > 0) {
			System.out.println("양수다.");
		}else if(num == 0) {
			System.out.println("0이다.");
		}else /*if*/{
			System.out.println("음수다.");
		}
	}
	
	public void method4() {
		//사용자에게 나이를 입력받아 어린이 청소년 성인...
		// 13세 이하 어린이 19세 초과 성인 나머진 청소년
		Scanner sc = new Scanner(System.in);
		System.out.print("나이(숫자만)를 입력하세요 : ");
		int age = sc.nextInt();
//		if(age <= 13) {
//			System.out.println("어린이");
//		}else if(age <= 19/* && age >13 어차피 if false일경우 13세 이상이기에 생략이 가능하다.*/) {// 항상 조건식은 최대한 짧게 
//			System.out.println("청소년");
//		}else {
//			System.out.println("성인");
//		}
		String result;
		if(age <= 13) {
			 result = "어린이"; // 여기에 String result선언하면  2
		}else if(age <= 19/* && age >13 어차피 if false일경우 13세 이상이기에 생략이 가능하다.*/) {// 항상 조건식은 최대한 짧게 
			 result = "청소년";
		}else {
			 result = "성인";
		}
		System.out.println(result);//2 이게 실행이 안됨 왜냐? 중괄호 밖을 나왔기 때문
		// 그래서 if문 전에 String result를 선언해줘야함.
		sc.close();
	}
	public void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		sc.close();
		
//		if(gender == 'M' || gender == 'm') {
		//xxx님은 x학생이다.
//			System.out.println(name + "님은 남학생이다.");
//		}else if(gender == 'F' || gender == 'f') {
//			System.out.println(name + "님은 여학생이다.");
//		}
		String result="";// 변수를 미리 세팅해둘때 반드시 초기화 해놓는 습관을 들이자!!!
		if(gender == 'M' || gender == 'm') {
			result = "남학생";
		}else if(gender == 'F' || gender == 'f') {
			result = "여학생";
		}else {
			System.out.println("성별을 잘못 입력했습니다.");
			return; // 해당 메서드 자체를 빠져나가는 구문.
		}
		//xx님은 xxx입니다.
		System.out.println(name + "님은 "+result+ "입니다.");// else 나올시 result가 초기화가 안될수 있음.
		
	}
	//특이케이스
	public void method6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		sc.close();
//		if(name == "차은우") {
//			System.out.println("차은우님 반갑습니다.");
//		}else {
//			System.out.println("차은우님이 아니신가보네요.. 안녕히가세요");
//		}
		/*
		 * 기본자료형 : boolean 1, byte 1, short 2, int 4, long8, char2, float4, double8
		 * 참조자료형 : String
		 * 
		 *  기본자료형들 끼리 동등 비교시에는 ==, !=사용가능 정상적으로 비교가 됨.
		 *  단, 참조자료형은 동등 비교시 ==, != 사용시 정상적으로 비교가 안됨.
		 *   이친구는 equlas()메서드를 이용해서 비교해야함.
		 *    문자열.equlas(문자열);
		 */
		if(name.equals("차은우")) {
		System.out.println("차은우님 반갑습니다.");
		}else {
		System.out.println("차은우님이 아니신가보네요.. 안녕히가세요");
		}
		
	}
	//조건문 중첩 사용
	public void method7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력(양수만) : ");
		int num = sc.nextInt();
		sc.close();
		if(num>0) { //양수일 경우
			if(num % 2 == 0) {//양수이고 짝수일 경우
				System.out.println("짝수입니다.");
			}else {//양수이고 홀수일 경우
				System.out.println("홀수입니다.");
			}
		}else {//양수가 아닐 경우
			System.out.println("양수가 아닙니다. 잘못 입력 하셨습니다.");
		}
		
	}
}
