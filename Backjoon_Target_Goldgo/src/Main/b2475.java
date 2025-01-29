package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2475 {
	public static int doublecheck(int n) {
		int result = n*n;
		return result;
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = 0;
		while(st.hasMoreTokens()) {
			sum += doublecheck(Integer.parseInt(st.nextToken()));
		}
		System.out.print(sum % 10);
	}

}
