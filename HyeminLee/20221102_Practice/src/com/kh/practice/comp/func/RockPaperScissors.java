package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {

public void rps() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
		
		int count = 0;
		int win = 0;
		int lose = 0;
		int tie = 0;
		
		
		
		
		while(true) { //while start
			
			System.out.print("가위 바위 보 : ");
			String rsp = sc.nextLine(); 
			
			int random = (int)(Math.random()*3+1);
			
			String com = " ";
			
			
			switch(random) {
			
			case 1 : com = "가위"; break;
			case 2 : com = "바위"; break;
			case 3 : com = "보"; break;
			
			} // switch end
			
			
			
			
			if (rsp.equals("exit")) {
				System.out.println(count+"전 " + win+"승 " + tie+"무 "+ lose+"패 ");
				return;
				
			} else if (rsp.equals("가위") || rsp.equals("바위")|| rsp.equals("보")){
				count++;
				System.out.print("컴퓨터 '-')o : "+com);
				System.out.println();
				System.out.print(name+" : "+rsp);
				System.out.println();
				
				
				if(com.equals("가위")) {
					if(rsp.equals("가위")) {
						System.out.println("------ 비겼습니댜 ---------");
						tie++;
					} else if (rsp.equals("바위")) {
						System.out.println("------- 이겼습니당 >0< ---------");
						win++;
					} else {
						System.out.println("------ 졌습니다 ㅠ0ㅠ ------");
						lose++;
					}
				} else if (com.equals("바위")) {
					
					if(rsp.equals("가위")) {
						System.out.println("------ 졌습니다 ㅠ0ㅠ ------");
						lose++;
					} else if (rsp.equals("바위")) {
						System.out.println("------ 비겼습니댜 ---------");
						tie++;
					} else {
						System.out.println("------- 이겼습니당 >0< ---------");
						win++;
					}
					
				} else { // 보 일경우
					
					if(rsp.equals("가위")) {
						System.out.println("------- 이겼습니당 >0< ---------");
						win++;
					} else if (rsp.equals("바위")) {
						System.out.println("------ 졌습니다 ㅠ0ㅠ ------");
						lose++;
					} else {
						System.out.println("------ 비겼습니댜 ---------");
						tie++;
					}
					
					
				} // 이김,비김,지는거 if문 끝
				
				
				
			} else { // 가위 바위보가 맞는지 if문 끝 / 아닐경우 시작
				System.out.println("다시 제대로 입력해주세용~");
				 System.out.println();
			} // if exit end
			
			
			
		}// while end
		
		
		
		
	} //rps end
	
	
	



}




