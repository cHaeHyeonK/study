package chap06;

import java.util.Scanner;

public class BubbleSort {
//	정렬 : 데이터를 일정한 순서로 나열하는 것
//	안정된 알고리즘과 그렇지 않은 알고리즘 : 키 값이 같은 요소의 순서가 정렬 전후에 유지되는지, 안 되는지
//	내부 정렬 - 한 배열에서 작업할 수 있을 때 <-> 외부 정렬 : 그렇지 않을 때
	
	static void swap(int[] a, int idx1, int idx2) {
		int tmp = 0;
		tmp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = tmp;
	}
	
	
//	한 번의 패스는 총 n-1번 반복됨 (n-1번 반복되면 마지막 하나는 자동으로 마지막 인덱스에 들어감)
//	패스의 과정에서는 얼마나 정렬되어 있냐(i)에 따라서 달라짐.
	static void bubbleSort(int[] a, int n) {
		
		for(int i = 0; i < n - 1; i++) {
			System.out.println("\n패스 " + (i + 1) + "\n");
			
			for(int j = n - 1; j > i; j--) {
				
				boolean isSwap = false;
				
				if(a[j - 1] > a[j]) {
					isSwap = true;
				}
				
				for(int k = 0; k < n; k++) {
					System.out.print("" + a[k]);
					
					if(a[j] == a[k] && !isSwap)
						System.out.print(" - ");
					else if(a[j] == a[k] && isSwap)
						System.out.print(" + ");
					else
						System.out.print("   ");
				}
				
				if(isSwap) swap(a, j-1, j);
				System.out.println();
			}
		}

	}
	
	static void bubbleSort2(int[] a, int n) {
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n - 1 - i; j++)
				if(a[j] > a[j+1]) swap(a, j, j+1);
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("버블 정렬(버전 1)");
		System.out.print("요솟수 : ");
		int nx = stdIn.nextInt();
		
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		bubbleSort(x, nx);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i = 0; i < nx; i++)
			System.out.println("x[" + i + "] : " + x[i]);
		
		stdIn.close();
	}

}
