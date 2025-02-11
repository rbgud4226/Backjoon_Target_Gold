package classAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class b15829 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String inputstr = br.readLine();

		String str = "abcdefghijklmnopqrstuvwxyz";
		Map<String, Integer> mp = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			mp.put(String.valueOf(str.charAt(i)), i);
		}

		long result = 0;

		for (int k = 0; k < inputstr.length(); k++) {
			int number = mp.get(String.valueOf(inputstr.charAt(k))) + 1; // 해당 문자의 번호
			result += number * Math.pow(31, k);
		}
		System.out.print(result);
	}

}
