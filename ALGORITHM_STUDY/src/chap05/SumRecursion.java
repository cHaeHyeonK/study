package chap05;

public class SumRecursion {
	
	static int sum(int n) {
		
		if(n <= 0) return 0;
		return n + sum(n - 1);
	}
	
	static void reversePrint(int n) {
		if(n > 0) {
			System.out.println(n);
			reversePrint(n - 1);
		}
	}
	
	static int arraySum(int[] arr, int n) {
		if(n <= 0) return 0;
		return arr[n - 1] + arraySum(arr, n - 1);
	}
	
	public static void main(String[] args) {
		System.out.println(sum(5));
		
		reversePrint(4);
		
		int[] array = {1, 2,3, 4, 5};
		
		System.out.println(arraySum(array, array.length));
	}
}
