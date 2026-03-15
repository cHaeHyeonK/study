package chap05;

import java.util.Scanner;

public class EuclidGCD3 {
	static int gcd(int a, int b) {
		
		if(b == 0)
			return a;
		else if(b == 1)
			return 1;
		else return gcd(b, a % b);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("배열의 최대공약수 구하기.");
		
		System.out.print("배열 크기 : ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x [" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		int result;
		result = gcd(x[0], x[1]);
		
		for(int i = 2; i < num; i++) {
			result = gcd(x[i], result);
		}
		
		System.out.println("최대공약수는 " + result);
		
		stdIn.close();
	}
}
