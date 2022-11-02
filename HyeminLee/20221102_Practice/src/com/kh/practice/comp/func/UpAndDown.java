package com.kh.practice.comp.func;

import java.util.Scanner;

public class UpAndDown {
	
	
	public void upDown() {

		Scanner sc = new Scanner(System.in);

		int count = 0;

		int qiz = (int) (Math.random() * 100 + 1);

		while (true) {

			count++;
			System.out.print("1~100 사이의 수를 맞춰보세요 : ");
			int num = sc.nextInt();

			sc.nextLine();

			if (num > 0 && num < 101) {

				if (num > qiz) {
					System.out.println("다운!!");
				} else if (num < qiz) {
					System.out.println("업~ '-'b");
				} else if (num == qiz) {
					System.out.println("정답입니다~ >0<");
					break;
				}

			}

		} // while

		System.out.println(count + "회 만에 맞추쳤습니다! ");
	}

}