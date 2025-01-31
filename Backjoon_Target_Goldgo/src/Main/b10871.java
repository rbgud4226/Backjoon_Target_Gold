package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10871 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int numlength = Integer.parseInt(st.nextToken());
		int checknum = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<numlength; i++) {
			int nums = Integer.parseInt(st.nextToken());
			if(nums < checknum) {
				sb.append(nums).append(' ');
			}
		}
		System.out.print(sb);
	}

}
