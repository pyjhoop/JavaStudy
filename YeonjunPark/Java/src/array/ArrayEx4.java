package array;

public class ArrayEx4 {
	public static void main(String[] args) {
		//배열의 복사를 for문을 통해서 가능하지만 
		// 대부분 System.arraycopy를 사용한다.
		int[] arr = new int[5];
		for(int i =0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		//array.clone()메서드를 통한 복사 이방법은 추천안함. 크키가....
		int[] arr1 = arr.clone();
//		int[] arr1 = new int[10]; 클론하면 이전에 10이란 크기를 줘도 clone한 크기르 따라간다.
//		arr1 = arr.clone();
		for(int e: arr1) {
			System.out.print(e+" ");
		}
		//System.arraycopy(num,0,newnum,0,num.length)메서드
		char[] abc = {'a','b','c','d'};
		char[] num = {'0','1','2','3','4','5','6','7','8','9'};
		System.out.println(abc);
		System.out.println(num);
		char[] result = new char[abc.length+num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
	}
}
