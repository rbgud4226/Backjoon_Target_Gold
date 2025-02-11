package classAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2839 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int target = Integer.parseInt(br.readLine());
		int a = 3;
		int b = 5;
		int maxA = target / a;
		int maxB = target / b;
		int result = -1;
		for (int i = 0; i <= maxB; i++) {
			for (int j = 0; j <= maxA; j++) {
				if ((b * i) + (a * j) == target) {
					if (i + j < result || result == -1) {
						result = i + j;
					}
				}
			}
		}
		System.out.print(result);
	}
}
