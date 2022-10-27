package array;

public class ArrayEx6 {
	//배열의 통해 최대값과 최소값을 구하는 방법
	public static void main(String[] args) {
		int[] score = {79,88,98,100,56,75};
		int max = score[0];
		int min = score[0];
		for(int i =1; i<score.length;i++) { //동시비교
			if(score[i]>max) {				//동시에 새로운값이 최대와 최소값에비해 크냐 작냐를 비교해서
				max = score[i];				// 최대값과 최소값을 구한다.
			}else if(score[i]<min) {
				min = score[i];
			}
		}
		System.out.println("max : "+max);
		System.out.println("min : "+min);
	}
}
