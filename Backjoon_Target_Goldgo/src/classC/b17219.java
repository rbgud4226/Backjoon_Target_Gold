package classC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class b17219 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		HashMap<String, String> hm = new HashMap<>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			hm.put(st.nextToken(), st.nextToken());
		}
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < m; i++) {
			String url = br.readLine();
			if (hm.containsKey(url)) {
				sb.append(hm.get(url)).append("\n");
			}
		}
		
		System.out.print(sb);
	}

}
