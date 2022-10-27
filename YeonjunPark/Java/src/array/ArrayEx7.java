package array;

public class ArrayEx7 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i =0; i<10; i++) {
			arr[i] = i;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i = 0; i<100;i++) {
			int random = (int)(Math.random()*10);
			int temp = arr[0];
			arr[0] = arr[random];
			arr[random] = temp;
		}
		for(int e: arr) {
			System.out.print(e + " ");
		}
		
	}
}
