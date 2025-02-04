package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b2798 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int target = Integer.parseInt(st.nextToken());
		int sum = 0;
		int result = 0;
		int[] arr = new int[num];
 
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int j = 0; j < num - 2; j++) {
			for (int k = j + 1; k < num - 1; k++) {
				for (int m = k + 1; m < num; m++) {
					sum = arr[j] + arr[k] + arr[m];
					if(sum > result && sum <= target) {
						result = sum;
					}
				}
			}
		}
		System.out.print(result);
	}

}
