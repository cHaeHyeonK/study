package chap05;

import java.util.Scanner;
import chap04.IntStack;

public class Recur {
	
	static int i = 1;
	
	static void recur(int n) {
		System.out.println("실행횟수 : " + i++);
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
	
	
//	수정해야됨 (다시 정리하고 stack 복습하고 풀어보기)
	static void recur4(int n) {
		IntStack s = new IntStack(n);
		
		while(true) {
			if(n > 0) {
				s.push(n--);
				continue;
			}
			
			if(s.isEmpty() != true) {
				n = s.pop();
				n -= 2;
				System.out.println(n);
				continue;
			}
			
			break;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오 : ");
		int x = stdIn.nextInt();
		
		recur4(x);
		stdIn.close();
	}
}
