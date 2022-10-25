package condition;

import java.util.Scanner;

public class Condition7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a == b && b == c) {
			System.out.println(10000+a*1000);
		}else if(a!=b && a!=c && b!=c) {
			int max =a;
			if(b>a && b>c) {
				max = b;
			}else if(c>a && c>b) {
				max = c;
			}
			System.out.println(max*100);
		}else {
			int same = 0;
			if(a==b) {
				same = a;
			}else if(b==c) {
				same = b;
			}else {
				same = a;
			}
			System.out.println(1000+same*100);
		}
	}
}
