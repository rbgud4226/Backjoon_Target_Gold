package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1003 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int[][] dp = new int[41][2];
		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;
		
		for(int i=2; i<=40; i++) {
			dp[i][0] = dp[i-1][0] + dp[i-2][0]; // 0이 나온 회수
			dp[i][1] = dp[i-1][1] + dp[i-2][1]; // 1이 나온 회수
		}
		StringBuilder sb = new StringBuilder();
		for(int j=0; j<num; j++) {
			int testcase = Integer.parseInt(br.readLine());
			int zerocase = dp[testcase][0];
			int onecase  = dp[testcase][1];
			sb.append(zerocase).append(" ").append(onecase).append("\n");
		}
		
		System.out.println(sb);
	}

}
