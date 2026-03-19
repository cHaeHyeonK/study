package chap05;

import java.util.Scanner;
import java.util.Stack;

import chap04.IntStack;

// 정석: "할 일"을 정의하는 클래스를 만든다.
class Task {
    int n;
    boolean isPrint; // true면 출력할 차례, false면 더 쪼개야 할 차례

    Task(int n, boolean isPrint) {
        this.n = n;
        this.isPrint = isPrint;
    }
}

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

	static void recur4(int n) {
	    Stack<Task> s = new Stack<>(); // Task 객체를 담는 스택
	    if (n > 0) s.push(new Task(n, false)); // 처음에 n을 '더 쪼개야 할 일'로 넣음

	    while (!s.isEmpty()) {
	        Task current = s.pop(); // 할 일을 하나 꺼낸다.
	        int val = current.n;

	        if (val <= 0) continue; // 0 이하는 무시 (if (n > 0) 조건)

	        if (current.isPrint) {
	            // "출력할 차례"라고 적혀있으면 그냥 출력만 하고 끝!
	            System.out.println(val);
	        } else {
	            // "더 쪼개야 할 차례"라면? 
	            // 원래 순서: (n-1) -> (n-2) -> 출력
	            // 스택에 넣는 순서(역순): 출력 -> (n-2) -> (n-1)
	            
	            s.push(new Task(val, true));      // 나중에 출력할 나 자신 (isPrint = true)
	            s.push(new Task(val - 2, false)); // recur(n-2) 하러 가기
	            s.push(new Task(val - 1, false)); // recur(n-1) 하러 가기 (얘가 맨 위!)
	        }
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
