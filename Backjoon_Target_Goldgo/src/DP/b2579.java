package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2579 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		int[] arr = new int[num + 1]; // arr 계단배열에 해당하는 계단의 값을 저장
		for (int i = 1; i <= num; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		int[] dp = new int[num + 1]; // 계단까지 오르는 값을 구할 dp 배열

		dp[1] = arr[1];
		if (num >= 2) {
			dp[2] = arr[1] + arr[2];
		}
		for (int i = 3; i <= num; i++) {
			dp[i] = Math.max(dp[i - 2], dp[i - 3] + arr[i - 1]) + arr[i];
		}

		System.out.println(dp[num]);

	}

}
