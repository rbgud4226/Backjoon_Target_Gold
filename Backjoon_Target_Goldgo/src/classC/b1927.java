package classC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class b1927 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i=0; i<num; i++) {
			int val = Integer.parseInt(br.readLine());
			if(val == 0) {
				if(pq.size() == 0) {
					sb.append("0\n");
				}
				else {
				sb.append(pq.poll()).append("\n");
				}
			}
			else {
				pq.add(val);
			}
		}
		
		System.out.print(sb);
	
	}
}
