package condition;

import java.util.Scanner;

public class Condition4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		if(x > 0 && y > 0) {
			System.out.println(1);
		}else if(x>0) {
			System.out.println(4);
		}else if(y > 0) {// x가 양수인 조건은 위의 두 조건에서 이미 끝났기에 
			System.out.println(2);
		}else {
			System.out.println(3);
		}
	}
}
