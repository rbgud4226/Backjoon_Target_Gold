package classC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b11659 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] numbers = new int[n+1];
		int[] sums = new int[n+1];
		sums[0] = 0;
		numbers[0] = 0;
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=n; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
			sums[i] = sums[i-1] + numbers[i];
		}

		StringBuilder sb = new StringBuilder(); 
	
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			sb.append(sums[end] - sums[start - 1]).append('\n');
			
		}
		System.out.print(sb);
		
	}

}
