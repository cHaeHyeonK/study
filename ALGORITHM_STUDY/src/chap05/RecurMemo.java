package chap05;

import java.util.Scanner;

public class RecurMemo {
	static String[] memo;
	
//	메모리에 계산한 값을 넣어둬서 중복으로 호출하게 될 때 계산량을 줄임
	
	static int i = 1;
	static void recur(int n) {
		System.out.println("실행횟수 : " + i++);
//		n+1 번째 인덱스가 채워져 있으면 출력
		if(memo[n + 1] != null) 
			System.out.print(memo[n + 1]);
		else {
			if(n > 0) {
				recur(n - 1);
				System.out.println(n);
				recur(n - 2);
				memo[n + 1] = memo[n] + n + "\n" + memo[n - 1];
			}
			else {
				memo[n + 1] = "";
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오 : ");
		int x = stdIn.nextInt();
		
		memo = new String[x + 2];
		recur(x);
		
		stdIn.close();
	}
}
