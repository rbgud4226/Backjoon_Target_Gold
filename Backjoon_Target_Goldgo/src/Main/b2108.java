package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class b2108 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			int n = Integer.parseInt(br.readLine());
			arr[i] = n;
		}

		int sum = 0;
		for (int a : arr) {
			sum += a;
		}

		int[] result = new int[4];
		Arrays.sort(arr);

		result[0] = (int) Math.round((double) sum / num);
		result[1] = arr[(int) Math.floor((double) num / 2)];

	
		Map<Integer, Integer> mp = new HashMap<>();
		for (int s : arr) {
			mp.put(s, mp.getOrDefault(s, 0) + 1);
		}

		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(mp.entrySet());
		list.sort((o1, o2) -> {
			if (o1.getValue() == (o2.getValue())) {
				return o1.getKey() - o2.getKey(); 
			}
			return o2.getValue() - o1.getValue(); 
		});
		
		int maxvalue = list.get(0).getValue();
		List<Integer> maxlist = new ArrayList<>();
		for(Map.Entry<Integer, Integer> mpentry : list) {
			if(mpentry.getValue() == maxvalue) {
				maxlist.add(mpentry.getKey());
			}
		}
		
		if(maxlist.size() == 1) {
			result[2] = maxlist.get(0);
		}else {
			result[2] = maxlist.get(1);
		}

		result[3] = arr[num - 1] - arr[0];

		for (int b : result) {
			System.out.println(b);
		}
	}

}
