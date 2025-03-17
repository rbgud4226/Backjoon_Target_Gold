package classC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2805 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int max = 0;
		for (int a : arr) {
			if (a > max) {
				max = a;
			}
		}
		int val = topzil(arr, m, max);
		System.out.println(val);

	}

	static int topzil(int[] arr, int target, int max) {
		int start = 0;
		int end = max;
		int result = 0;

		while (start <= end) {
			int mid = (start + end) / 2;
			long count = 0;

			for (int s : arr) {
				if (s >= mid) {
					count += s - mid;
				}
			}

			if (count >= target) {
				result = mid;
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}
		return result;
	}

}
