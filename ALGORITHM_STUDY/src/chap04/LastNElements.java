package chap04;

import java.util.Scanner;

public class LastNElements {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
//		cnt가 10을 넘지 않으면 i를 0으로 두고, cnt개를 출력함
//		cnt가 10을 넘으면 cnt++ % N으로 계속 값을 받았으니까
//		i는 cnt - N으로 두고 거기서 10개를 출력함.
		
		Scanner stdIn = new Scanner(System.in);
		final int N = 10;
		int[] a = new int[N];
		
		int cnt = 0; //입력받은 개수
		int retry; //다시 한 번?
		
		System.out.println("정수를 입력하세요.");
		
		do {
			System.out.printf("%d번째 정수 : ", cnt + 1);
			a[cnt++ % N] = stdIn.nextInt();
			
			System.out.println("계속 할까요? (예. 1 / 아니요. 0)");
			retry = stdIn.nextInt();
		} while(retry == 1);
		
		
		int i = cnt - N;
		if(i < 0) i = 0;
		
		for(; i < cnt; i++)
			System.out.printf("%2d번째 정수 = %d\n", (i + 1), a[i % N]);
		System.out.println();
		
		stdIn.close();
	}
}
