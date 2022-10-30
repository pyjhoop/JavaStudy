package array;

import java.util.Scanner;

public class A_Array {
	public void method1() {
		int[] arr = new int[5];
		int[] arr1;
		arr1 = new int[4];
		for(int i = 0; i<arr.length;i++) {
			arr[i] = i;
		}
		for(int e: arr) {
			System.out.println(e);
		}
	}
	public void method2() {
		int[] arr = new int[5];
		double[] arr1 = new double[5];
		System.out.println(arr);
		System.out.println(arr1);
		System.out.println(arr.hashCode());
	}
	public void method3() {
		int[] arr1 = new int[5];
		for(int i =0; i<5; i++) {
			arr1[i] = i;
		}
		System.out.println("================");
		for(int e: arr1) {
			System.out.print(e +" ");
		}
	}
	public void method4() {
		int[] arr = new int[5];
		for(int i =0; i<5; i++) {
			arr[i] = i+1;
		}
		for(int i = 0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("================");
		System.out.println(arr);
		System.out.println(arr.hashCode());
		System.out.println(arr.length);
	}
	public void method5() {
//		int[] arr;
		int[] arr = null;
		//아무런 객체도 참조하고 싶지 않을때 null 이란 값을 사용한다.
		// null을 참조할땐 길이, 인덱스, 해쉬코드 즉 값들에 접근을 할려면 예외 발생
		System.out.println("선언 완료");
		System.out.println(arr.hashCode());
		System.out.println(arr[1]);
		System.out.println(arr.length);
		//NullPointerException
		//참조변수가 바라보는(참조하는)것이 null이기에 포인터로 접근했을대
		// 값을 찾을수 없기에 발생하는 예외.
	}
	public void method6() {
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i+1)*2;
		}
		for(int e: arr) {
			System.out.println(e);
		}
		System.out.println(arr.hashCode());
		System.out.println(arr.length);
	}
	public void method8() {
		int[] arr= new int[10];
		for(int i = 0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100+1);
		}
		for(int i = 0; i<arr.length;i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}
	}
	public void method9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 정하세요 : ");
		int size = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[size];
		for(int i = 0; i<size; i++) {
			System.out.print("과일의 이름을 입력하세요 : ");
			arr[i] = sc.nextLine();
		}
		for(String e: arr) {
			System.out.println(e);
		}
	}
	public void method10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요:");
		String str = sc.nextLine();
		char[] arr = new char[str.length()];
		for(int i = 0; i<str.length();i++) {
			arr[i] = str.charAt(i);
		}
		for(char e: arr) {
			System.out.println(e);
		}
		System.out.println(arr.length);
	}
	
	public void method11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이를 입력하세요 : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i<size; i++) {
			arr[i] = (int)(Math.random()*100 +1);
		}
		int sum = 0;
		for(int i =0; i<size; i++) {
			if(arr[i] % 2 ==1) continue;
			sum+=arr[i];
		}
		System.out.println(sum);
	}
	
}
