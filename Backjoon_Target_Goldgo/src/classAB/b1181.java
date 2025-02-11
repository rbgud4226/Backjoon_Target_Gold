package classAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class b1181 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		HashSet<String> hs = new HashSet<>();
		for(int i=0; i<num; i++) {
			hs.add(br.readLine());
		}		
		List<String> hslist = new ArrayList<>(hs);
		Collections.sort(hslist);
		Collections.sort(hslist, (o1,o2) -> o1.length() - o2.length());
		
		for(String s : hslist) {
			System.out.println(s);
		}
	}
}
