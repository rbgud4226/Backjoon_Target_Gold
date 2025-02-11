package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b1874 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		Stack<Integer> st = new Stack<>();
		int start = 0;
		
		for(int i=0; i<num; i++) {
			int n = Integer.parseInt(br.readLine());
			
			if(n > start) {
				for(int j= start + 1; j<=n; j++) {
					st.push(j);
					sb.append('+').append("\n");
				}
				start = n;
			}
			if(st.peek() != n) {
				System.out.println("NO");
				return;
			}
			
			st.pop();
			sb.append('-').append("\n");
		}
		System.out.println(sb);
	}
}
