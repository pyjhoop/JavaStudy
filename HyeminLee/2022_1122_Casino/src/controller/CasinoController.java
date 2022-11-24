package controller;

import java.util.ArrayList;

public class CasinoController {

	
	private int[] arr = new int[5];
	private ArrayList list = new ArrayList(4);

	
	

	
	{
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
		}
}
	
	
	
	public ArrayList selectAll() { // 전체 5개 번호 조회
		ArrayList list = new ArrayList();
		
		for(int i=0; i<arr.length; i++) {
			list.add(arr[i]);
		}
	
		return list;
	}
	
	
	public int num1() {
		return arr[0];
	}
	
	public int num2() {
		return arr[1];
	}
	
	public int num3() {
		return arr[2];
	}
	
	public int num4() {
		return arr[3];
	}
	public int num5() {
		return arr[4];
	}
	
	
public boolean total(int ber1,int ber2,int ber3,int ber4, int ber5) {
		
		
		boolean yn = true;
	
		if(arr[0]==ber1 && arr[1]==ber2 && arr[2]==ber3 && arr[3]==ber4 && arr[4]==ber5) {
			yn=true;
		}else {
			yn=false;
		}
		return yn;
	}
	
	
	
	
} // class
