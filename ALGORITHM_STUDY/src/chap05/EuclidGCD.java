package chap05;

import java.util.Scanner;

public class EuclidGCD {
//	유클리드 호제법 : 최대공약수를 효과적으로 나누는 방법
//	x, y (x > y일 때)의 최대 공약수를 구하려면, x % y == 0이 될 때까지 반복적으로 나누면 됨
	
	static int gcd(int x, int y) {
		if(y == 0)
			return x;
		else
			return gcd(y, x % y);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("두 수의 최대 공약수를 구합니다.");
		
		System.out.print("정수를 입력하세요.");
		int x = stdIn.nextInt();
		
		System.out.print("정수를 입력하세요.");
		int y = stdIn.nextInt();
		
		System.out.println("최대공약수는 " + gcd(x, y) + "입니다.");
		stdIn.close();
	}
}
