package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2748 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Long[] dp = new Long[91];
		//fn = fn-1 + fn-2;
		dp[0] = 0L;
		dp[1] = 1L;
		
		for(int i=2; i<=num; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		System.out.println(dp[num]);
	}

}
