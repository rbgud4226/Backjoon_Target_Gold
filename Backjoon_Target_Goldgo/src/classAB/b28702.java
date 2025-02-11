package classAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class b28702 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = new String[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = br.readLine();
		}

		Map<Integer, String> mp = new HashMap<>();

		for (int j = 0; j < 3; j++) {
			if (!(arr[j].equals("Fizz") || arr[j].equals("Buzz") || arr[j].equals("FizzBuzz"))) {
				mp.put(j, arr[j]);
			}
		}

		int result = 0;
		for (int k : mp.keySet()) {
			if (k == 0) {
				result = Integer.parseInt(mp.get(k)) + 3;
			} else if (k == 1) {
				result = Integer.parseInt(mp.get(k)) + 2;
			} else if (k == 2) {
				result = Integer.parseInt(mp.get(k)) + 1;
			}
		}

		while (true) {
			if (result % 3 == 0) {
				if (result % 5 == 0) {
					System.out.print("FizzBuzz");
					break;
				} else {
					System.out.print("Fizz");
					break;
				}
			}

			if (result % 5 == 0) {
				System.out.print("Buzz");
				break;
			} else {
				System.out.print(String.valueOf(result));
				break;
			}
		}
	}
}
