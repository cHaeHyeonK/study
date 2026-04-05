package bronze;

import java.util.*;
import java.io.*;

public class Question_2475 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int[] num = new int[5];
		int result = 0;
		
		for(int i = 0; i < 5; i++) {
			num[i] = Integer.parseInt(st.nextToken());
			result += num[i] * num[i];
		}
		
		System.out.print(result / 10);
	}
}
