package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b11727 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		if(num == 1) {
			System.out.print(1);
			return;
		}
		int[] arr = new int[num+1];
		
		arr[1] = 1;
		arr[2] = 3;
		for(int i=3; i<=num; i++) {
		arr[i] = ((arr[i-2] * 2) + arr[i-1]) % 10007;
		}
	
		System.out.print(arr[num]);
	}

}
