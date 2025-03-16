package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b17626 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		int[] arr = new int[num + 1];
		arr[1] = 1;

		for (int i = 2; i <= num; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 1; j * j <= i; j++) {
				min = Math.min(min, arr[i - (j * j)]);
			}
			
			
			arr[i] = min + 1;
		}
		
		System.out.print(arr[num]);

	}

}
