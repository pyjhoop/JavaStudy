package control;

public class G_Continue {
	public void method1() {
		//for문으로 1부터 10까지 홀수 출력
		for(int i =1; i<=10; i++) {
			if(i%2 == 0) continue;
			System.out.print(i + " ");
		}
	}
	public void method2() {
		//1붙 100까지 합계
		// 단 6의 배수는 빼고
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			if(i%6 ==0) continue;
			sum+=i;
		}
		System.out.println(sum);
	}
	public void method3() {
		//2~9단 출력
		//단, 3의 배수단은 생략
		for(int i = 2; i<=9; i++) {
			if(i%3 == 0) continue;
			for(int j = 1; j<=9; j++) {
				System.out.printf("%d x %d = %d\n", i, j,i*j);
			}
			System.out.println("==============");
		}
	}
}
