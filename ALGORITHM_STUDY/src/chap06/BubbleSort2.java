package chap06;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort2 {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void bubbleSort(int[] a, int n) {
		for(int i = 0; i < n - 1; i++) {
			
			System.out.println("\n패스 " + (i + 1) + "\n");
			int exchg = 0;
			
			for(int j = n-1; j > i; j--) {
				boolean isSwap = false;
				if(a[j - 1] > a[j]) {
					isSwap = true;
					exchg++;
				}
				
				for(int k = 0; k < n; k++) {
					System.out.print(a[k]);
					
					if(a[j] == a[k] && !isSwap)
						System.out.print(" - ");
					else if(a[j] == a[k] && isSwap)
						System.out.print(" + ");
					else
						System.out.print("   ");
				}
				
				if(isSwap) 
					swap(a, j-1, j);
				System.out.println();
			}
			
			if(exchg == 0) break;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소수 : ");
		int nx = stdIn.nextInt();
		
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		bubbleSort(x, nx);
		
			System.out.print("정렬 후 -> " + Arrays.toString(x));
	}
}
