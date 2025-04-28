package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1932 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		int[][] dp = new int[num + 1][num + 1];
		int[][] arr = new int[num + 1][num + 1];
		StringTokenizer st;

		for (int i = 1; i <= num; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= i; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 1; i <= num; i++) { // 배열 초기화
			dp[num][i] = arr[num][i];
		}

		for (int i = num - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				dp[i][j] = arr[i][j] + Math.max(dp[i + 1][j], dp[i + 1][j + 1]);
			}
		}

		System.out.println(dp[1][1]);
	}

}
