package chap05;

import chap04.IntStack;

// 스택 이용해서 첫 번째 재귀함수 빼기

public class RecurX2 {
	static void recur(int n) {
		IntStack s = new IntStack(n);
		
		while(true) {
//			다 저장
			if(n > 0) {
				s.push(n);
				n = n - 1;
				continue;
			}
			
//			저장 끝내고 s에 값이 들어있으면 처리 후에 처음부터 돌아감
			if(s.isEmpty() != true) {
				n = s.pop();
				System.out.println(n);
				n = n - 2;
				continue;
			}
			break;
		}
	}
	
	public static void main(String[] args) {
		recur(4);
	}
}
