package practice;

import java.util.Scanner;

public class CompExample {
	public void practice1() {
		//정수 입력받아.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		sc.close();
		int num = sc.nextInt();
		//짝수이면 num/2*박수
		if(num<=0) {
			System.out.println("양수가 아닙니다.");
			return;
		}
		if(num%2 == 0) {
			for(int i = 0; i<num/2;i++) {
				System.out.print("박수");
			}//홀수이면 num*박수 + 박
		}else {
			for(int i =0; i<num/2; i++) {
				System.out.print("박수");
			}
			System.out.print("박");
		}
		// 정수아니면 양수가 아닙니다 출력.
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			if(num <=0) {
				System.out.println("양수가 아닙니다.");
				continue;
			}
			if(num % 2 == 0) {
				for(int i = 0; i<num/2; i++) {
					System.out.print("박수");
				}
			}else {
				for(int i =0; i<num/2; i++) {
					System.out.print("박수");
				}
				System.out.print("박");
			}
			return;
		}
	}
	public void practice3() {
		//문자열 입력받아
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		// 검색문자 입력받아
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		sc.close();
		// 검새문자의 개수를 출력.
		int cnt=0;
		for(int i =0; i<str.length(); i++) {
			if(ch==str.charAt(i)) {
				cnt++;
			}
		}
		System.out.println(str+" 안에 포함된 "+ch+" 개수 : "+cnt);
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("문자열 : ");
			String str = sc.nextLine();
			System.out.print("문자 : ");
			char ch = sc.nextLine().charAt(0);
			int cnt=0;
			for(int i =0; i<str.length(); i++) {
				if(ch==str.charAt(i)) {
					cnt++;
				}
		}
			System.out.println(str+" 안에 포함된 "+ch+" 개수 : "+cnt);
			System.out.print("더 하시겠습니까? (y/n) : ");
			char ch1 = sc.nextLine().charAt(0);
			if(ch1 == 'y' || ch1 =='Y') {
				continue;
			}else if(ch1 == 'n' || ch1 =='N') {
				return;
			}else {
				System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
				System.out.println();
			}
	}
}
	public void upDown() {
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random()*100 + 1);
		int cnt=0;
		while(true) {
			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			int num = sc.nextInt();
			if(num>100 || num<=0) {
				System.out.println("1~100 사이의 숫자를 입력해주세요.");
				continue;
			}
			cnt++;
			if(num>random) {
				System.out.println("DOWN !");
			}else if(num<random) {
				System.out.println("UP !");
			}else {
				System.out.println("정답입니다!!");
				break;
			}
		}
		System.out.println(cnt+"회만에 맞추셨습니다.");
	}
	
	public void rps() {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		int sum = 0;
		int win = 0;
		int loss = 0;
		int draw = 0;
		while(true) {
			System.out.print("가위바위보: ");
			String rsp = sc.nextLine();
			if(rsp.equals("exit")) {
				System.out.println(sum+"전 "+win+"승 "+draw+"무 "+loss+"패");
				break;
			}
			//컴퓨터처리
			int random = (int)(Math.random()*3+1);
			String[] arr = {"바위","보","가위"};
			System.out.println("컴퓨터 : "+arr[random-1]);
			System.out.println(name+" : "+ rsp);
			int num = 0;
			if(rsp.equals("바위")) {
				num = 1;
			}else if(rsp.equals("보")) {
				num = 2;
			}else {
				num=3;
			}
			if(num-random == 1 || random-num == 2) {
				System.out.println("이겼습니다 !");
				win++;
			}else if(num==random) {
				System.out.println("비겼습니다.");
				draw++;
			}else {
				System.out.println("졌습니다 ㅠㅠ");
				loss++;
			}
			sum = win+loss+draw;
			//조건이 들어감.
			
		}
	}
}
