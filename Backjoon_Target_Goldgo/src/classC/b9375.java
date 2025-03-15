package classC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class b9375 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		Map<String, Integer> mp = new HashMap<>();
		for (int i = 0; i < num; i++) {
			int result = 1;
			int cases = Integer.parseInt(br.readLine());
			for (int j = 0; j < cases; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String wear = st.nextToken();
				String category = st.nextToken();
				mp.put(category, mp.getOrDefault(category, 0) + 1);
			}

			for (int s : mp.values()) {
				result *= (s + 1);
			}
			sb.append(result - 1).append('\n');
			mp.clear();
		}

		System.out.print(sb);
	}

}
