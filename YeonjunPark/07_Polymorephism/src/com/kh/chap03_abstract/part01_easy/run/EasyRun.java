package com.kh.chap03_abstract.part01_easy.run;

import com.kh.chap03_abstract.part01_easy.model.vo.BasketBall;
import com.kh.chap03_abstract.part01_easy.model.vo.FootBall;
import com.kh.chap03_abstract.part01_easy.model.vo.Sports;

public class EasyRun {
	public static void main(String[] args) {
		Sports s = new FootBall();
		Sports s1 = new BasketBall();
		
		Sports[] arr = new Sports[2];
		arr[0] = new FootBall();
		arr[0].setPeople(11);
		arr[1] = new BasketBall();
		arr[1].setPeople(21);
		for(int i = 0; i< arr.length; i++) {
			arr[i].rule();
			System.out.println(arr[i].toString());
		}
	}
}
