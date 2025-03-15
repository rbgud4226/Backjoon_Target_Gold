package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class b11399 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> times = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int k = Integer.parseInt(st.nextToken());
			times.add(k);
		}
		
		Collections.sort(times);
		int result = times.get(0);
		for(int i=1; i<n; i++) {
			for(int j=i; j>=0; j--) {
				result += times.get(j);
			}
		}
		
		
		System.out.print(result);
		
	}

}
