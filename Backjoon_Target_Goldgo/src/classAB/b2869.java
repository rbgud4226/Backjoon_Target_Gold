package classAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2869 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		int result = 0;
		int oneday = a - b;
		int target = v - b;
		if(target % oneday != 0) {
			result = target / oneday + 1; 
		}
		else {
			result = target / oneday;
		}
		
		System.out.print(result);
	}

}
