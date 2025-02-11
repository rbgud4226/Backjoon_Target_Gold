package classAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b11050 {
	public static int factory(int n) {
		int result = 1;
		for(int i=1; i<=n; i++) {
			result *= i;
		}
		return result;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int kum = Integer.parseInt(st.nextToken());
		int answer  = 0 ;
//		b11050 factory = new b11050();
		answer = factory(num) / factory(num - kum) * factory(kum);
		System.out.print(answer);
		
	}

}
