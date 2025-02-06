package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class b1920 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		HashSet<Integer> hs = new HashSet<>();
		StringTokenizer st = new StringTokenizer(br.readLine());	
		for(int i=0; i<num; i++) {
			hs.add(Integer.parseInt(st.nextToken()));
		}
		
		int num2 = Integer.parseInt(br.readLine());
		int[] arr = new int[num2];
		st = new StringTokenizer(br.readLine());
		for(int j=0; j<num2; j++) {
			int checknum = Integer.parseInt(st.nextToken());
			if(hs.contains(checknum)) {
				arr[j] = 1;
			}else {
				arr[j] = 0;
			}
		}
		
		for(int a : arr) {
			System.out.println(a);
		}
	}

}
