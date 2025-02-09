package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b18110 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			int n = Integer.parseInt(br.readLine());
			arr[i] = n;
		}

		int l = (int) Math.round(arr.length * 0.15);
		Arrays.sort(arr);
		int result = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		for (int i = 0; i < l; i++) {
			sum -= arr[i];
		}

		for (int i = arr.length - l; i < arr.length; i++) {
			sum -= arr[i];
		}

		int length = arr.length - (l * 2);
		result = (int) Math.round((double) sum / length);
		System.out.print(result);
	}

}
