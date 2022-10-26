package array;

import java.util.Arrays;

public class ArrayEx2 {
	public static void main(String[] args) {
		int[] iArray1 = new int[10];
		int iArray2[] = new int[10];
		int[] iArray3 = new int[] {10,20,30,40};
		int[] iArray4 = {10,20,30,40};
		char[] cArray = {'a','b','c','d'};
		for(int i = 0; i< iArray1.length;i++) {
			iArray1[i] = i+1;
		}
		for(int i =0; i<iArray2.length; i++) {
			iArray2[i] = (int)(Math.random()*10 +1);
		}
		for(int i= 0;i<iArray1.length;i++) {
			System.out.print(iArray1[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(iArray2));
		System.out.println(Arrays.toString(iArray3));
		System.out.println(cArray);
	}
}
