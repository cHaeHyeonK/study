package chap05;

import java.util.Scanner;

public class Recur {
	static void recur(int n) {
		if(n > 0) {
			recur(n - 1);
			System.out.println(n);
			recur(n - 2);
		}
	}
	
	static void recur2(int n) {
		if(n > 0) {
			recur2(n - 2);
			System.out.println(n);
			recur2(n - 1);
		}
	}
	
//	꼬리 재귀 빼기
	static void recur3(int n) {
		while(n > 0) {
			recur3(n - 1);
			System.out.println(n);
			n = n - 2;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오 : ");
		int x = stdIn.nextInt();
		
		recur3(x);
		stdIn.close();
	}
}
