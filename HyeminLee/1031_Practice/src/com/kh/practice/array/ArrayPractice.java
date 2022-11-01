package com.kh.practice.array;

import java.util.Scanner;


public class ArrayPractice {

	
	
	
	public void practice1() {

		int[] arr = new int[10];

		for (int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}

		// 출력 : 1 2 3 4 5 6 7 8 9 10

	}
	
	
	
	public void practice2() {

		int[] arr = new int[10];

		for (int i=0; i<arr.length; i++) {
			arr[i] = 10-i;
			System.out.print(arr[i]+" ");
		}

		// 출력 : 10 9 8 7 6 5 4 3 2 1 

	}
	
	
	public void practice3() {

		Scanner sc = new Scanner(System.in);

		System.out.print("양의 정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		int j = 0;

		for (int i = 1; i <= num; i++) {
			arr[j] = i;
			System.out.print(arr[j] + " ");
		}

	}
	
	
	
	
	public void practice4() {

		String[] fruit = { "사과", "귤", "포도", "복숭아", "참외" };

	for (int i=0; i<fruit.length; i++) {
		if (fruit[i].equals("귤")) {
			System.out.println("인덱스"+i+"는 "+fruit[i]);
		}
	}
		
		//출력 : 귤

	}
	
	
	
	public void practice5() {

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);

		char[] arr = new char[str.length()];
		//char타입 (문자 하나하나 저장하는거라서)
		//문자열 길이만큼 배열 생성

		
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}

		
		int count = 0;
		
		
		System.out.print(str + "에 " + ch + "가 존재하는 위치 : ");

		for (int i = 0; i < str.length(); i++) {
			if (arr[i] == ch) { //arr배열값 중에 ch값이랑 겹치는게 있어?
				System.out.print(i + " "); // 몇번째 인덱스인지 출력해죠~
				count++; // 숫자도 세죠~
			}
		}
		System.out.println();
		System.out.println(ch + "의 개수 : " + count);

	}
	
	
	public void practice6() {

		String[] day = { "월", "화", "수", "목", "금", "토", "일" };

		Scanner sc = new Scanner(System.in);

		System.out.print("0~6 사이 숫자입력 : ");
		int num = sc.nextInt();

		if (num >= 0 && num < 7) {
			System.out.println(day[num]+"요일");
		} else {
			System.out.println("잘못 입력하셨습니다");
		}

	}
	
	//배열길이 직접 입력
	// 정수형 배열 선언 및 할당
	//배열의 크기만큼 사용자가 직접 값 입력 -> 초기화
	//전체값을 나열
	// 각 인덱스에 저장된 값들의 합을 출력하세요
	
	public void practice7() {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		int sum =0;
		

		for (int i=0; i<arr.length; i++) {
			System.out.print(i+"번째 인덱스에 넣을 값 : ");
			arr[i]=sc.nextInt();
		}
		System.out.println();
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			sum += arr[i];
		}
		System.out.println();
		System.out.println("총 합 : "+ sum);
	}
	
	
	public void practice8() {

		// 3이상 홀수 입력받기
		// 배열의 중간까지는 1부터 증가
		// 중간 이후부터는 끝까지는 1씩 감소
		// 입력한 정수가 홀수가 아니거나 3미만인 경우 "다시 입력하세요 출력"

		// 3이상의 코드를 배열에 각 입력
		// 최종 홀수 입력 숫자만큼 출력
		// 1부터 증가 후 중간 고점 그이후 1감소

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("정수 : ");
			int num = sc.nextInt();
			int[] arr = new int[num];

			if (num > 2 && num % 2 == 1) {
				for (int i = 0; i < arr.length; i++) {
						if (i<num/2+1 ) {
							arr[i] = i + 1;
						}
					//중간 고점 이후 감소????
//						~_~ 몰라 생각안나
				
					System.out.print(arr[i] + " ");
			} 
				System.out.println();
			}else {
				System.out.println("다시 입력하세요");

			}
			break;
		}

	}
	
	
	

	public void practice9() {
		
		
		
		Scanner sc = new Scanner(System.in);

		String[] ken = { "양념", "간장", "순살", "허니" };

		System.out.print("치킨 이름 : ");
		String chi = sc.nextLine();

		int count = 0;

		// 사용자가 입력한 값이 배열에 있는지 확인
		for (int i = 0; i < ken.length; i++) {
			if (ken[i].equals(chi)) {
				count++;
			}
		}
		System.out.println();

		if (count > 0) {
			System.out.println(chi + "메뉴 배달~");
		} else {
			System.out.println(chi + "메뉴 없엉");
		}

	}
	
	
	
	public void practice10() {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호 -포함 입력 : ");
		String str = sc.nextLine();
		
		
		
		char[] gen = new char[str.length()];
		
		for(int i=0; i<gen.length; i++) {
			gen[i]=str.charAt(i);
			}
		
		char[] der = gen.clone();
		//수정할게 없이 완벽복사본이 필요하니 .clone사용
		
		
		
		
//		940927-2*   8번째부터 * 바꿔
		for (int i=8; i<der.length; i++) {
			der[i] = '*';
		}
		
		
		//처음부터 다시 출력
		for (int i=0; i<der.length; i++) {
			System.out.print(der[i]);
		}
		
		
		
	}
	
	
	
	public void practice11() {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	
	
	
	public void practice12() {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) { // 0으로 최대값 최소값 세팅했으니 비교는1부터
			if (arr[i] > max) { // 인덱스 1의 값이 인덱스0(max) 보다 커??
				max = arr[i]; // 크면 max에 인덱스 값 넣어~

			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println();

		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}
	
	
	
	public void practice13() {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);// 10개의 랜덤값 발생 (중복있음)

			for (int j = 0; j < i; j++) { // j<9
				if (arr[i] == arr[j]) {
					i--;
				}
				// 이공식은 무슨말이야 ~_~ 옘병
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

	}

	
	
	public void practice14() {

		int[] ball = new int[45];

		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1; // 1부터 45까지 값 저장
		}

		int tmp = 0;
		int j = 0;

		for (int i = 0; i < 6; i++) { // 0부터 시작이니깐 6미만까지
			j = (int) (Math.random() * 45);
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;

		}

		for (int i = 0; i < 6; i++) {
			for (int e = 0; e < i; e++) { // j<9
				if (ball[i] == ball[e]) {
					i--;

				}

			}
			System.out.print(ball[i] + " ");
		}
//		int min = ball[0];
		// 최소값부터 나열하면 되는데..어엉...몰라
		// 오름차순 메소드말고..ㅠ0ㅠ

	}

	public void practice15() {

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		char[] ch = new char[str.length()];

		int count = 0;

		for (int i = 0; i < ch.length; i++) {
			ch[i] = str.charAt(i);
		}

		System.out.print("문자열에 있는 문자 : ");

		for (int i = 0; i < ch.length; i++) {
			for (int j=1; j < ch.length; j++) {
				if (ch[i]==ch[j]) {
					continue; 
				}
			}
			//아놔 중복제거 건너띄기아니냐고 왜 안먹히냐고
			// 도라버려 ㅠㅠ
				count++;
				System.out.print(ch[i] + " ");
		}

		System.out.println();
		System.out.println("문자 개수 : "+count);
	
	
//	출력 : 
//		문자열 : apple
//		문자열에 있는 문자 : a p p l e 
//		문자 개수 : 5

//         중복제거 안먹힘
//         카운트 안먹힘
     
	
	
	
}
	
	
	//
} //