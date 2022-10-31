package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		//길이 10 배열 선언
		int[] arr = new int[10];
		// 반복문으로 값 대입
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		// 값출력
		for(int e: arr) {
			System.out.print(e+" ");
		}
	}
	public void practice2() {
		//길이가 10 배열 선언
		int[] arr= new int[10];
		// 10~1까지 배열에 대입
		for(int i =0; i<arr.length; i++) {
			arr[i]=10-i;
		}
		// 출력
		for(int e: arr) {
			System.out.print(e+" ");
		}
	}
	public void practice3() {
		//사용자에게 값을 입력받음
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int size = sc.nextInt();
		//입력받은 값이 배열의 크기임
		int[] arr = new int[size];
		// 그 크기만큼 배열의 값 초기화
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		//배열 출력
		for(int e: arr) {
			System.out.print(e+" ");
		}
		sc.close();
	}
	public void practice4() {
		//길이 5인 String 배열 선언 및 초기화
		String[] arr = {"사과","귤","포도","복숭아","참외"};
		// 조건문을 통해 귤일경우 귤출력
		for(int i = 0; i<arr.length; i++) {
			if(arr[i].equals("귤")) {
				System.out.println(arr[i]);
			}
		}
	}
	public void practice5() {
		//문자열 입력받음, 검색할 문자 입력받음.
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		char[] arr = new char[str.length()];
		// 문자 배열에 문자열을 하나씩 대입
		for(int i = 0; i<str.length();i++) {
			arr[i] = str.charAt(i);
		}
		// 원하는 문자의 위치 출력
		int cnt =0;
		System.out.print(str+"에 "+ch+"가 존재하는 위치(인덱스) : ");
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]==ch) {
				System.out.print(i+" ");
				cnt++;
			}
		}
		System.out.println();
		//원하는 문자 개수 출력
		System.out.println(ch+" 개수 : "+cnt);
		sc.close();
	}
	public void practice6() {
		//월~일까지 초기화된 문자열 배열 만듬.
		Scanner sc = new Scanner(System.in);
		String[] arr = {"월","화","수","목","금","토","일"};
		//0~6까지 입력받는데 범위를 넘어서면 잘못 출력
		System.out.print("0 ~ 6사이 숫자 입력 : ");
		int num = sc.nextInt();
		//입력한 숫자와 같은 인덱스에 있는 요일 출력.
		if(num>=0 && num<=6) {
			System.out.println(arr[num]+"요일");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		sc.close();
	}
	public void practice7() {
		//사용자로부터 정수형배열의 크기 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		//크기만큼 값을 입력받아 초기화
		int[] arr = new int[num];
		for(int i = 0; i<arr.length; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		// 배열 전체값 출력 후 값들의 합을 출력
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			sum+=arr[i];
		}
		System.out.println();
		System.out.println("총합 : "+sum);
		sc.close();
	}
	public void practice8() {
		//3이상 자연수 입력받아 배열의 중간부가뾰족하게 만들어라.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		// 홀수가 아니거나 3미만일 경우 다시 입력 출력
		if(num%2 ==0 || num < 3) {
			System.out.println("다시 입력하세요.");
		}else {
			for(int i = 0; i<arr.length; i++) {
				arr[i] = i+1;
				if(i>=num/2+1) {
					arr[i]= num-i;
				}
			}
		}
		// 피라미드 출력
		for(int e: arr) {
			System.out.print(e+" ");
		}
		sc.close();
	}
	public void practice9() {
		//사용자에게 문자열 입력받음.
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요: ");
		String ken = sc.nextLine();
		String[] arr = {"불닭","후라이드","뿌링클","간장"};
		//미리 만들어진 치킨이름 문자열 배열과 비교해
		boolean b1 = false;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i].equals(ken)) {
				b1 = true;
			}
		}
		// 있으면 배달가능 없으면 없는 치킨
		if(b1) {
			System.out.println(ken+"치킨 배달 가능");
		}else {
			System.out.println(ken+"치킨은 없는 메뉴입니다.");
		}
		sc.close();
	}
	public void practice10() {
		//주민번호 입력받아서 char배열에 등록
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String idNum = sc.nextLine();
		char[] arr = new char[idNum.length()];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = idNum.charAt(i);
		}
		//배열 복사본을 만들어서 1뒤에***로바꿔
		char[] arr1 = Arrays.copyOf(arr, arr.length);
		for(int i =8;i<arr.length;i++) {
			arr1[i] = '*';
		}
		//복사본 출력
		for(char e: arr1) {
			System.out.print(e);
		}
	}
	public void practice11() {
		//정수배열 크기10 선언
		int[] arr = new int[10];
		//1~10 사이의 난수 배열에 초기화
		for(int i = 0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10+1);
		}
		// 출력
		for(int e: arr) {
			System.out.print(e+" ");
		}
	}
	public void practice12() {
		//크기10정수형배열 선언
		int[] arr = new int[10];
		// 1~10사이의 난수로 배열 초기화
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10 +1);
		}
		// 배열 전체값출력
		System.out.print("최대값 : ");
		int max = arr[0];
		int min = arr[0];
		for(int i =0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}else if(arr[i]<min) {
				min = arr[i];
			}
			System.out.print(arr[i]+" ");
		}
		// 배열 최소 최대 출력
		System.out.println();
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
	}
	public void practice13() {
		//크기10정수형 배열 선언
		int[] arr = new int[10];
		//1~10사이의 중복없는 난수로 초기화
		for(int i =0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10 +1);
			//동일값있는지 비교하는 반복문
			for(int j = 0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					//만약 0과1인덱스가 같다면 i--로 다시 1로 돌아가서 난수생성.
				}
			}
		}
		for(int e: arr) {
			System.out.print(e+" ");
		}
	}
	public void practice14() {
		//크기6 정수배열 선언
		int[] arr = new int[6];
		//1~45임의의 수로 초기화
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*45 + 1);
			//중복제거
			for(int j = 0; j<i;j++) {
				if(arr[i]==arr[j]) {
					i--;
				}
			}
		}
		for(int e: arr) {
			System.out.print(e+ " ");
		}
		System.out.println();
		// 오름차순으로 정렬
		//0~5 에서 min값 출력
		//1~5 min 출력
		// 2~5 min 출력
		//결국 셔플 즉 섞어줘야함. ㅠㅠ 이걸 생각 못했네.
		int min;
		for(int i = 0; i<arr.length; i++) {
			min = arr[i];
			for(int j = i; j<arr.length;j++) {
				if(arr[j]<min) {
					min = arr[j];
					arr[j] = arr[i];
				}
				arr[i] = min;
			}
		}
		for(int e: arr) {
			System.out.print(e+" ");
		}
	}
	public void practice15() {
		//문자열 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		char[] arr = new char[str.length()];
		//문자열을 문자배열에 저장하기
		for(int i = 0; i<str.length();i++) {
			arr[i] = str.charAt(i);
		}
		// 중복된 문자 제거하기
		int cnt=0;
		for(int i = 0; i<str.length();i++) {
			for(int j = i+1; j<str.length(); j++) {
				if(arr[i]==arr[j]) {
					arr[j] = '0';
				}
			}
		}
		// 총문자 개수 출력
		// 방법이 완전하지 않아
		// 수정방법을 찾아봐야함.
		System.out.print("문자열에 있는 문자 : ");
		for(int i =0; i<str.length();i++) {
			if(arr[i] == '0') {
				cnt++;
				continue;
			}
			if(i == str.length()-1) {
				System.out.print(arr[i]);
			}else {
				System.out.print(arr[i] +", ");
			}
		}
		System.out.println();
		System.out.println("문자 개수 : "+(str.length()-cnt));
	}
	public void practice16() {
		//배열의 크기 입력받고 문장려 배열 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[num];
		for(int i = 0; i<num;i++) {
			System.out.print((i+1)+"번째 문자열 : ");
			arr[i] = sc.nextLine();
		}
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);
			if(ch == 'N' || ch =='n') {
				for(String e: arr) {
					System.out.print(e+" ");
				}
				break;
			}else {
				System.out.print("더 입력하고 싶은 개수 : ");
				int add = sc.nextInt();
				sc.nextLine();
				String[] arr1 = Arrays.copyOf(arr, num+add);
				for(int i=arr.length; i<arr1.length;i++) {
					System.out.print((i+1)+"번째 문자열 : ");
					arr1[i] = sc.nextLine();
				}
				arr = arr1.clone();
			}
			
		}
		// 반복을 통해 문자열 을 입력받음.
		// 더 입력받겠냐? 만약 입력받으면 몇개 ?
		// 이것을 반복.
		//포기ㅜㅜ
	}
}
