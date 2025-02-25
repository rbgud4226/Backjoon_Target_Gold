package classC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class b1764 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		HashSet hs = new HashSet<>();
		for(int i=0; i<n; i++) {
			hs.add(br.readLine());
		}
		List<String> li = new ArrayList<>();
		for(int i=0; i<m; i++) {
			String s = br.readLine();
			if(hs.contains(s)) {
				li.add(s);
			}
		}
		Collections.sort(li);
		
		System.out.println(li.size());
		for(String k : li) {
			System.out.println(k);
		}
	}
}
