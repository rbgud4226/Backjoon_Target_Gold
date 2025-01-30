package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2438 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for(int i=1; i<=num; i++) {
			StringBuilder sb = new StringBuilder();
			for(int j=1; j<=i; j++) {
				sb.append("*");
			}
			System.out.println(sb);
		}
	}

}
