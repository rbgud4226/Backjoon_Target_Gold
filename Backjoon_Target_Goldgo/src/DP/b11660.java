package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b11660 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		int[][] dp = new int[n + 1][n + 1];

		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= n; j++) {
				dp[i][j] = dp[i][j - 1] + Integer.parseInt(st.nextToken());
			}
		}

		for (int k = 1; k <= m; k++) {
			int sum = 0;
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			for (int i = x1; i <= x2; i++) {
				sum = sum + (dp[i][y2] - dp[i][y1 - 1]);
			}
			sb.append(sum + "\n");
		}
		System.out.print(sb);
	}

}
