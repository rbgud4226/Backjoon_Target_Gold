package classC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class b11286 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
			if (Math.abs(a) > Math.abs(b)) {
				return Math.abs(a) - Math.abs(b);
			} else if (Math.abs(a) == Math.abs(b)) {
				return a - b;
			} else {
				return -1;
			}
		});
		for (int i = 0; i < num; i++) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) {
				if (pq.isEmpty()) {
					sb.append("0").append("\n");
				} else {
					sb.append(pq.poll()).append("\n");
				}
			} else {
				pq.add(n);
			}
		}
		System.out.print(sb);
	}

}
