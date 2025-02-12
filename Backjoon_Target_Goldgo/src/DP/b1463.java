package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1463 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] dp = new int[num + 1];
		dp[1] = 0;

		for (int i = 2; i <= num; i++) {
			if (i % 6 == 0) {
				dp[i] = Math.min(dp[i / 3], dp[i / 2]) + 1; // 1 을 더하는 이유는 i/3, i/2중 선택된 값으로 연산을 하기 때문
			} else if (i % 3 == 0) {
				dp[i] = Math.min(dp[i / 3], dp[i - 1]) + 1;
			} else if (i % 2 == 0) {
				dp[i] = Math.min(dp[i / 2], dp[i - 1]) + 1;
			}else {
				dp[i] = dp[i-1] + 1;
			}
		}
		
		System.out.print(dp[num]);

	}

}
