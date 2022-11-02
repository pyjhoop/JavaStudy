package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {

	
	//------------가위 바위 보 -----------
	//...평생 가위바ㅜ이보 져라
	
	
	public void rps() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은~? : ");
		String name = sc.nextLine();
		
		
		
		int win = 0;
		int lose = 0;
		int count = 0;
		int mu = 0;
		
		String exit = "exit";
		
		
		String com = " ";
		int vs=0;
		
		
		while (true) {
			
			System.out.print("가위 바~위 보! : ");
			String str = sc.nextLine();
			
			count++;
			
			if(str.equals("exit")) {
				System.out.println(count+"전 "+win+"승 "+ mu+"무 "+lose+"패");
			} else  {
			
		//랜덤값 수를 통해 결정
		int random = (int)(Math.random()*3+1); // 1 2 3
				
		
		

		
		
		
		// 랜덤값 1은 뭐뭐다 라고 코드 어떻게 짜지??
		switch(random) {
		case 1:
			com = "가위";
			break;
		case 2:
			com = "주먹";
			break;
		case 3:
			com = "보";
			break;
		}
	
		
		
//		switch(str) {
//		case "가위" : 
//			vs = 1;
//			break;
//		case "바위" : 
//			vs = 2;
//			break;
//		case "보" : 
//			vs = 3;
//			break;
//			
//			
//		}
	
		
		
		if (str.equals("가위") || str.equals("바위") || str.equals("보")) {
			
		
		if (str.equals("가위")) {
			
		}
			
			
			

			
			
			
			
			
			
			
			//숫자가 문자열로 출력되게 만들어야함!
			//가위바위보 내가 입력한것도 승패 비교하게 만들기
			
			
			
			System.out.println("컴 : " /*랜덤값이 한글로 나와야함*/ );
			System.out.println(name + " : " + str);
			
		
			
			
			
			
			
			
		}else {
			System.out.println("잘못입력했어용!");
			System.out.println();
			
			
			
			
			//exit 탈출하면 몇회 몇승 몇무 몇패 나타나기
			
			
		 
		
		
		
	}// w
	
	
		}
	}
	
}



}




