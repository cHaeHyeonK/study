package bronze;

import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Question_1271 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		BigInteger money = new BigInteger(st.nextToken());
		BigInteger headCount = new BigInteger(st.nextToken());
		
		System.out.println(money.divide(headCount));
		System.out.println(money.remainder(headCount));
	}
}
