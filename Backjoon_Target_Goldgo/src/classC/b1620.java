package classC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class b1620 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		Map<String, Integer> listString = new HashMap<>();
		Map<Integer, String> listInteger = new HashMap<>();
		for (int i = 1; i <= n; i++) {
			String va = br.readLine();
			listString.put(va, i);
			listInteger.put(i, va);
		}
	
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			String s = br.readLine();
			if(listString.containsKey(s)) {
				sb.append(listString.get(s)).append("\n");
			}
			else {
				int num = Integer.parseInt(s);
				sb.append(listInteger.get(num)).append("\n");
			}
		}
		System.out.print(sb);
	}

}
