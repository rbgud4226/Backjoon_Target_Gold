package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1654 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int target = Integer.parseInt(st.nextToken());
		long max = 0;

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		Long lengthmin = 1L;
		Long lengthmax = max;
		long result = 0;
		
		while (lengthmin <= lengthmax) {
			long lengthmid = (lengthmin + lengthmax) / 2;
			long count = 0;

			for (int a : arr) {
				count += (a / lengthmid);
			}

			if (count >= target) {
				result = lengthmid;
				lengthmin = lengthmid + 1;
			} else {
				lengthmax = lengthmid - 1;
			}
		}
		
		System.out.print(result);
	}

}
