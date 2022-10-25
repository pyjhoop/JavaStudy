package condition;

import java.util.Scanner;

public class Condition6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int temp = 60*a + b + c;
		a = temp/60;
		b = temp % 60;
		if(a>23) a-=24;
		System.out.printf("%d %d",a,b);
	}
}
// 좀더 좋은 방법
// 시간을 분단위로 만들어서 /60과 %60으로 시간과 분을 구한다.
// 조건문을 통해 시간이 24이상이되면 -24해주게 된다면 조건문한줄만 들어가게된다.
//if(b+c >= 60) {
//	a = a+ (b+c)/60;
//	b = (b+c)%60;
//	if(a>23) {
//		a-=24;
//	}
//}else {
//	b +=c;
//}
//System.out.printf("%d %d",a,b);
//}