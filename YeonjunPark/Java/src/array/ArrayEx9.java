package array;

public class ArrayEx9 {
	public static void main(String[] args) {
		//불연속적인 값들을 셔플하는 방법
		int[] code = {-4,-1,3,6,11};
		int[] temp = new int[10];
		for(int i = 0; i<temp.length;i++) {
			temp[i] = code[(int)(Math.random()*code.length)];
		}
		for(int e: temp) {
			System.out.println(e);
		}
	}
}
