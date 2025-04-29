package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10844 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[][] dp = new long[n + 1][10];

		for (int j = 1; j <= 9; j++) {
			dp[1][j] = 1L; // i가 1이면 길이가 1이라서 무조건 1
		}

		for (int i = 2; i <= n; i++) {
			for (int j = 0; j <= 9; j++) {
				if (j == 0) {
					dp[i][0] = dp[i - 1][1] % 1000000000; // 마지막 숫자가 0으로 끝나면 앞에는 1만 올 수 있음
				} else if (j == 9) {
					dp[i][9] = dp[i - 1][8] % 1000000000; // 마지막 숫자가 9로 끝나면 앞에는 8만 가능
				} else {
					dp[i][j] = (dp[i - 1][j - 1]% 1000000000 + dp[i - 1][j + 1] % 1000000000) %1000000000; // j는 앞뒤로 +- 1차이나는거
				}
			}
		}

		Long result = 0L;
		for(int i=0; i<=9; i++) {
			result += dp[n][i];
		}
		System.out.println(result % 1000000000);
	}

}
