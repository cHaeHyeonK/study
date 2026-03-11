package chap05;

public class EuclidGCD2 {
	// 내 생각 : 오름차순으로 정렬이 되어 있다고 가정하고, a[0]이 될 때까지 수를 나눠서
	// 나머지가 0이 되는 수를 찾아서 전체 곱하기
	static int gcdArray(int[] a) {

		int result = 1;
		boolean isGcd = true;

		for (int i = 2; i <= a[0]; i++) {
			isGcd = true;

			for (int j = 0; j < a.length; j++) {
				if (a[j] % i != 0)
					isGcd = false;

				if (!isGcd)
					break;
			}

			if (isGcd)
				result = i;
		}

		return result;
	}

	public static void main(String[] args) {
		int[] a = { 4, 6, 9, 11 };

		System.out.println(gcdArray(a));
	}
}
