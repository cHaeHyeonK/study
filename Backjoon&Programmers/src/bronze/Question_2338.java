package bronze;

import java.io.*;
import java.math.*;

public class Question_2338 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		if(str == null) return;
		BigInteger first = new BigInteger(str);
		
		str = br.readLine();
		if(str == null) return;
		BigInteger second = new BigInteger(str);
		
		System.out.println(first.add(second));
		System.out.println(first.subtract(second));
		System.out.println(first.multiply(second));
		
	}
}
