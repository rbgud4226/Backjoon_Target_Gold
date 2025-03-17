package classC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class b18870 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list1 = new ArrayList<>();

		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < num; i++) {
			list1.add(Integer.parseInt(st.nextToken()));
		}

		ArrayList<Integer> list2 = new ArrayList<>(list1);
		list2.sort((a, b) -> {
			return a - b;
		});
		
		Map<Integer, Integer> mp = new HashMap<>();
		int index = 0;
		for (int j = 0; j < list2.size(); j++) {
			if (!mp.containsKey(list2.get(j))) {
				mp.put(list2.get(j), index++);
			}
		}

		for (int k = 0; k < list1.size(); k++) {
			sb.append(mp.get(list1.get(k))).append(" ");
		}

		System.out.print(sb);

	}
}
