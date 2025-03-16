package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b9461 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < cases; i++) {
			int num = Integer.parseInt(br.readLine());
			long[] arr = new long[101];

			if (num == 1 || num == 2 || num == 3) {
				sb.append(1).append('\n');
				continue;
			}

			if (num == 4) {
				sb.append(2).append('\n');
				continue;
			}

			arr[1] = 1;
			arr[2] = 1;
			arr[3] = 1;
			arr[4] = 2;

			for (int j = 5; j <= num; j++) {
				arr[j] = arr[j - 3] + arr[j - 2];
			}

			sb.append(arr[num]).append('\n');
		}

		System.out.print(sb);
	}

}
