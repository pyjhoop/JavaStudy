package condition;

import java.util.Scanner;

public class Condition5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		if(m < 45) {
			h-=1;
			m+=15;
			if(h < 0) {
				h = 24 + h;
			}
		}else {
			m-=45;
		}
		System.out.printf("%d %d",h,m);
		sc.close();
	}
}
// 45분 감소는 쉬워 하지만 분이 45분 미만이라면 시간이 변하기에 조건을 통해서
// 45분 미만일때 시간도 -1시간 해준다.
//그러나 시간이 음수가 나올수 없기에 이중 조건문으로 시간이 음수가 나올때 다시 23시부터 시작할 수있도록 해줌.