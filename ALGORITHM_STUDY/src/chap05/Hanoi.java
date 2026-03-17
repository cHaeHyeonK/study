package chap05;

import java.util.Scanner;

public class Hanoi {
//	하노이의 탑 : 마지막 원반을 제외한 나머지 원반을 2번째 기둥에 옮기면, 마지막 원반을 3번째, 그룹을 다시 3번째에 올려서 완성시킬 수 있음
	
//	no개의 원반을 x번 기둥에서 y번 기둥으로 옮김
	static void move(int no, int x, int y) {
//		시작점에서 중간지점으로
		if(no > 1)
			move(no - 1, x, 6 - x - y);
		
		System.out.printf("원반[%d]을(를) %d번 기둥에서 %d번 기둥으로 옮김\n", no, x, y);
		
//		중간 지점에서 목표 기둥으로
		if(no > 1)
			move(no - 1, 6 - x- y, y);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("하노이의 탑.");
		System.out.print("원반의 개수 : ");
		int n = stdIn.nextInt();
		
		move(n, 1, 3);
		
		stdIn.close();
	}
}
