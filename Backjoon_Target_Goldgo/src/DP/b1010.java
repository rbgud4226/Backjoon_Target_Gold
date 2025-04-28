package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1010 {
	public static int[][] dp;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int caseNum = Integer.parseInt(br.readLine());
		dp = new int[31][31];

		for (int i = 0; i <= 30; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					dp[i][j] = 1;
				} else {
					dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
				}
			}
		}

		for (int i = 0; i < caseNum; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int west = Integer.parseInt(st.nextToken());
			int east = Integer.parseInt(st.nextToken());
			sb.append(dp[east][west] + "\n");
		}
		
		System.out.print(sb);
	}

}
