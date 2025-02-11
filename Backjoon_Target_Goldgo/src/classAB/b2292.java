package classAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2292 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 1개 6개 12개 18개 24개
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int count = 1; 
		int start = 2; 

		if (num == 1) {
			System.out.println(1);
		} else {
			while (start <= num) {
				start = start + (6 * count);
				count++;
			}
			System.out.println(count);
		}
	}
}
