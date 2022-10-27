package array;

public class ArrayEx3 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		for(int i = 0; i<5;i++) {
			arr[i] = i+1;
		}
		System.out.println("변경전 배열의 값.");
		for(int e: arr) {
			System.out.print(e+" ");
		}
		int[] arr1 = new int[arr.length*2];
		for(int i = 0; i<arr.length;i++) {
			arr1[i] = arr[i];
		}
		System.out.println();
		System.out.println("복사후 배열의 값.");
		for(int e: arr1) {
			System.out.print(e + " ");
		}
	}
}
