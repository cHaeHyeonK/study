package bronze;

import java.io.*;

public class Question_2744 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			
			if(Character.isUpperCase(a))
				result += Character.toLowerCase(a);
			else
				result += Character.toUpperCase(a);
		}
		
		System.out.print(result);
	}
}
