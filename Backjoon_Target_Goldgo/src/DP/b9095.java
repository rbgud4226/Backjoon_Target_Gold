package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b9095 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			int value = Integer.parseInt(br.readLine());
			int[] dp = new int[value + 1];
			if (value == 1) {
			    sb.append(1).append("\n");
			    continue;
			} else if (value == 2) {
			    sb.append(2).append("\n");
			    continue;
			} else if (value == 3) {
			    sb.append(4).append("\n");
			    continue;
			}
			dp[1] = 1;
			dp[2] = 2;
			dp[3] = 4;
			
			for (int j = 4; j <= value; j++) {
				dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
			}
			sb.append(dp[value]).append("\n");
		}
		
		System.out.print(sb);
	}

}
