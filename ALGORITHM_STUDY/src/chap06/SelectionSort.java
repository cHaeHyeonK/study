package chap06;

public class SelectionSort {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

//	단순 선택 정렬 : 가장 작은 요소를 맨 앞으로 이동, 두번째로 작은 요소는 맨 앞에서 두 번째로 이동하는 식
	
	static void selectionSort(int[] a, int n) {
		for(int i = 0; i < n - 1; i++) {
			int min = i;
			for(int j = i + 1; j < n; j++)
				if(a[j] < a[min])
					min = j;
			swap(a, i, min);
		}
	}
}
