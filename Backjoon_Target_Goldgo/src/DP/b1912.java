package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1912 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caseNum = Integer.parseInt(br.readLine());
		int[] dp = new int[caseNum];
		int[] arr = new int[caseNum];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < caseNum; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		dp[0] = arr[0];
		int max = dp[0];
		for (int i = 1; i < caseNum; i++) {
			dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
			max = Math.max(dp[i], max);
		}
		System.out.println(max);
	}

}
