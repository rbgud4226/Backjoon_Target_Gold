package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2775 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int casenum = Integer.parseInt(br.readLine());
		for (int i = 0; i < casenum; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());

			// 0층 배열
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = j + 1;
			}
			
			for (int h = 1; h <= k; h++) {
				for (int m = 1; m < n; m++) {
					arr[m] += arr[m - 1];
				}
			}
			System.out.println(arr[n - 1]);
		}
	}

}
