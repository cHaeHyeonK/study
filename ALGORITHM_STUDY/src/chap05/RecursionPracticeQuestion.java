package chap05;

import java.util.Scanner;

public class RecursionPracticeQuestion {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("최대공약수 구하기.");
		System.out.print("정수를 입력하세요 : ");
		
		int x = stdIn.nextInt();
		int result = 1;
		
		for(int i = 1; i <= x; i++ )
			result *= i;
		
		System.out.println("팩토리얼 값 : " + result);
		
		System.out.println("최대공약수 구하기.");
		System.out.print("정수를 입력하세요 : ");
		int y = stdIn.nextInt();
		
		System.out.print("정수를 입력하세요 : ");
		int z = stdIn.nextInt();
		
		int a = 0;
		
		while(a != y) {
			
			a = y % z;
			y = z;
			z = a;
			
			if(a == 0)
				a = y;
		}
		System.out.println("최대 공약수 : " + a);
		
		stdIn.close();
	}
}
