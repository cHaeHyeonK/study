package bronze;

import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Question_2420 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		BigInteger n = new BigInteger(st.nextToken());
		BigInteger m = new BigInteger(st.nextToken());
		
		System.out.print((BigInteger)(n.subtract(m)).abs());
	}
}
