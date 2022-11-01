package ch6;

import java.util.Arrays;

public class ReferenceParamEx3 {
	public static void main(String[] args) {
		int[] arr = {3,2,1,6,5,4};
		printArr(arr);
		sortArr(arr);
		printArr(arr);
		System.out.println("sum= "+sumArr(arr));
	}
	static void printArr(int[] a) {
		for(int e: a) {
			System.out.print(e+" ");
		}
		System.out.println();
	}
	static void sortArr(int[] a) {
		Arrays.sort(a);
		
	}
	static int sumArr(int[] a) {
		int sum = 0;
		for(int i = 0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
}
