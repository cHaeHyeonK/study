package bronze;

import java.io.*;

public class Question_2753 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		if(a % 4 == 0) {
			if(a % 100 != 0 || a % 400 == 0)
				System.out.print(1);
			else
				System.out.print(0);
		} else {
			System.out.print(0);
		}
	}
}
